import java.util.Stack;
import java.util.StringTokenizer;

public class Calculadora {
    private Stack<String> stack;

    public Calculadora(String tipo) {
        StackFactory factory = new StackFactory();
        this.stack = factory.getStack(tipo);
    }

    public int evaluar(String operacion) {
        String postfix = convertirAPostfix(operacion);
        return evaluarPostfix(postfix);
    }

    private String convertirAPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            
            if (Character.isDigit(ch)) {
                postfix.append(ch).append(' ');
            } else if (ch == '(') {
                this.stack.push(ch);
            } else if (ch == ')') {
                while (!this.stack.isEmpty() && this.stack.peek() != '(') {
                    postfix.append(this.stack.pop()).append(' ');
                }
                this.stack.pop();
            } else {
                while (!this.stack.isEmpty() && precedence(ch) <= precedence(this.stack.peek())) {
                    postfix.append(this.stack.pop()).append(' ');
                }
                this.stack.push(ch);
            }
        }
        for (int i = 0; i < this.stack.size(); i++) {
            this.stack.pop();
        }
        return postfix;
    }

    private static int precedence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    private int evaluarPostfix(String operacion) {
        StringTokenizer tokens = new StringTokenizer(operacion);
        
        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();
            
            if (esNumero(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Expresión inválida: no hay suficientes operandos para el operador '" + token + "'");
                }
                int b = stack.pop();
                int a = stack.pop();
                
                stack.push(operar(a, b, token));
            }
        }
        
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Expresión inválida: demasiados operandos sin operadores suficientes");
        }
        return stack.pop();
    }

    private boolean esNumero(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int operar(int operandoA, int operandoB, String operador) {
        return switch (operador) {
            case "+" -> operandoA + operandoB;
            case "-" -> operandoA - operandoB;
            case "*" -> operandoA * operandoB;
            case "/" -> {
                if (operandoB == 0) {
                    throw new ArithmeticException("Error: División entre cero");
                }
                return operandoA / operandoB;
            }
            case "^" -> (int) Math.pow(operandoA, operandoB);
            default -> throw new IllegalArgumentException("Operador no válido: " + operador);
        };
    }
}
