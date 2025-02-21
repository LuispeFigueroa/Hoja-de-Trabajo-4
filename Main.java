import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;

        System.out.println("¿Cómo quiere implementar el stack de la calculadora? (vector, arraylist o list)");
        String tipoStack = scanner.nextLine();
        if (tipoStack.equalsIgnoreCase("list")) {
            System.out.println("¿Qué tipo de lista desea usar? (simple o doble)");
            String tipoLista = scanner.nextLine();
            Calculadora calculadora = new Calculadora(tipoStack, tipoLista);
        }
        else {
            Calculadora calculadora = new Calculadora(tipoStack, "N/A");
        }
        
        while (menu) {
            System.out.println("1. Leer archivo con expresión y obtener solución");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    // Intenta leer el archivo y devuelve un error si no puede
                    try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            int resultado = calculadora.evaluar(linea);
                            System.out.println("Resultado: " + resultado);
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    menu = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }        
    }
}