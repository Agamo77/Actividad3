import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un deck de cartas
        deck deck = new deck();
        Scanner scanner = new Scanner(System.in); 

        // Creamos un menu para poder escoger la operacion
        int opcion = 0;  
        while (opcion != 5) {
           
            System.out.println("Que te gustaria hacer hoy?");
            System.out.println("1. Barajar el deck");
            System.out.println("2. Mostrar la primera carta");
            System.out.println("3. Seleccionar una carta al azar");
            System.out.println("4. Pedir una mano");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            
            
            opcion = scanner.nextInt();
            
            // Invocar las acciones del menu
            switch (opcion) {
                case 1:
                    deck.shuffle();
                    break;
                case 2:
                    deck.head();
                    break;
                case 3:
                    deck.pick();
                    break;
                case 4:
                    deck.hand();
                    break;
                case 5:
                    System.out.println("Terminando juego");
                    break;
                default:
                    System.out.println("Esa no es una opcion");
            }
        }

        
        scanner.close();
    }
}

