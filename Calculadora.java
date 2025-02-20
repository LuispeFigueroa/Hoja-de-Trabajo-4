import java.util.Stack;
import java.util.StringTokenizer;

public class Calculadora implements StackArrayList {
    private Stack<Integer> stack;

    public Calculadora() {
        stack = new StackVector<>();
    }

    @Override
    public int evaluar(String operacion) {
        String postfix = convertirAPostfix(operacion);
        return evaluarPostfix(postfix);
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

    @Override
    public int operar(int operandoA, int operandoB, String operador) {
        return switch (operador) {
            case "+" -> operandoA + operandoB;
            case "-" -> operandoA - operandoB;
            case "*" -> operandoA * operandoB;
            case "/" -> {
                if (operandoB == 0) {
                    throw new ArithmeticException("Error: División entre cero");
                }
                yield operandoA / operandoB;
            }
            default -> throw new IllegalArgumentException("Operador no válido: " + operador);
        };
    }

    private String convertirAPostfix(String infix) {
        Stack<Character> pila = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            
            if (Character.isDigit(ch)) {
                postfix.append(ch).append(' ');
            } else if (ch == '(') {
                pila.push(ch);
            } else if (ch == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    postfix.append(pila.pop()).append(' ');
                }
                pila.pop();
            } else {
                while (!pila.isEmpty() && precedence(ch) <= precedence(pila.peek())) {
                    postfix.append(pila.pop()).append(' ');
                }
                pila.push(ch);
            }
        }
        
        while (!pila.isEmpty()) {
            postfix.append(pila.pop()).append(' ');
        }
        
        return postfix.toString().trim();
    }

    private static int precedence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    private boolean esNumero(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
