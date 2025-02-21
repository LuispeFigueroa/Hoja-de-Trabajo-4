import java.util.StringTokenizer;

public class Calculadora {
    private Stack<String> stack;

    public Calculadora(String tipoStack, String tipoLista) {
        StackFactory<String> factory = new StackFactory<>();
        this.stack = (Stack<String>) factory.getStack(tipoStack, tipoLista);
    }

    public String evaluar(String operacion) {
        String postfix = convertirAPostfix(operacion);
        return evaluarPostfix(postfix);
    }

    private String convertirAPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        
        for (int i = 0; i < infix.length(); i++) {
            char character = infix.charAt(i);
            String ch = String.valueOf(character);
            
            if (Character.isDigit(character)) {
                postfix.append(ch).append(' ');
            } else if (ch.equals("(")) {
                this.stack.push(ch);
            } else if (ch.equals(")")) {
                while (!this.stack.isEmpty() && !this.stack.peek().equals("(")) {
                    postfix.append(this.stack.pop()).append(' ');
                }
                this.stack.pop();
            } else {
                if (!ch.equals(" ")) {
                    while (!this.stack.isEmpty() && precedence(ch) <= precedence(this.stack.peek())) {
                        postfix.append(this.stack.pop()).append(' ');
                    }
                    this.stack.push(ch);
                }
            }
        }
        for (int i = 0; i < this.stack.size(); i++) {
            postfix.append(this.stack.pop());
        }
        return postfix.toString();
    }

    private static int precedence(String ch) {
        char c = ch.charAt(0);
        return switch (c) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    private String evaluarPostfix(String operacion) {
        StringTokenizer tokens = new StringTokenizer(operacion);
        
        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();
            
            if (esNumero(token)) {
                stack.push(token);
            } else {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Expresión inválida: no hay suficientes operandos para el operador '" + token + "'");
                }
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                
                stack.push(String.valueOf(operar(a, b, token)));
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
                yield operandoA / operandoB;
            }
            case "^" -> (int) Math.pow(operandoA, operandoB);
            default -> throw new IllegalArgumentException("Operador no válido: " + operador);
        };
    }
}
