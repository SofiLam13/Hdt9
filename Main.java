/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos 
 * Sofía Lam
 * carné 21548
 */
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Archivo archivo = new Archivo();
        Grafo g = archivo.Read();
        boolean terminar = false;
        System.out.println("Por favor ingrese la opción que desea");
        while(!terminar) {
            System.out.println("1.Calcular ruta");
            System.out.println("2.Centro del grafo");
            System.out.println("3.Grafo");
            System.out.println("4.Finalizar el programa");

            try {
                int opcion = scan.nextInt();
                scan.nextLine();
                switch (opcion) {
                    case 1:
                        try {
                            System.out.println("Ingrese la ciudad de origen");
                            String origen = scan.nextLine();
                            System.out.println("Ingrese la ciudad destino");
                            String destino = scan.nextLine();
                            String camino = g.Ruta(origen, destino);
                            System.out.println("\n" + camino);
                        } catch (Exception e) {
                            System.out.println("No se ha encontrado la ciudad especificada, intente de nuevo.");
                        }
                        break;
                    case 2:
                        String center = g.Centro();
                        System.out.println(center);
                        break;
                    case 3:
                        System.out.println(g.toString());
                        break;
                    case 4:
                        System.out.println("Programa terminado");
                        terminar= true;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("No ha ingresado un dato valido, intente de nuevo");
            }
        }
        scan.close();
    }
}
