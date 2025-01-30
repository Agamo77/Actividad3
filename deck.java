import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Creamos los atributos List para guardar las cartas y Random para generar números al azar
public class deck {
    private List<card> cartas;  // Usamos "card" con mayúscula
    private Random random;

    // Constructor del Deck
    public deck() {
        cartas = new ArrayList<>();
        random = new Random();

        // Se inicializan las cartas que usaremos
        String[] colores = {"Rojo", "Negro"};
        String[] palos = {"Tréboles", "Espadas", "Diamantes", "Corazones"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        // Creamos las cartas, asegurándonos de pasar los valores correctos
        for (String palo : palos) {
            // Determinar el color del palo
            String color = (palo.equals("Diamantes") || palo.equals("Corazones")) ? "Rojo" : "Negro";

            // Crear las cartas con los valores correspondientes
            for (String valor : valores) {
                cartas.add(new card(palo, color, valor));
            }
        }
    }

    // Método shuffle para barajar el deck
    public void shuffle() {
        Collections.shuffle(cartas, random);
        System.out.println("Se mezcló el Deck");
    }

    // Método head para mostrar la primera carta y sacarla del deck
    public void head() {
        if (!cartas.isEmpty()) {
            card carta = cartas.remove(0);
            System.out.println(carta);
            System.out.println("Quedan " + cartas.size() + " cartas en el deck");
        } else {
            System.out.println("El mazo está vacío");
        }
    }

    // Método hand para sacar una mano de 5 cartas y sacarlas del deck
    public void hand() {
        if (cartas.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                card carta = cartas.remove(0);
                System.out.println(carta);
            }
            System.out.println("Quedan " + cartas.size() + " cartas en el deck");
        } else {
            System.out.println("No hay suficientes cartas en el mazo");
        }
    }

    // Método pick para seleccionar una carta al azar y sacarla del deck
    public void pick() {
        if (!cartas.isEmpty()) {
            int index = random.nextInt(cartas.size());
            card carta = cartas.remove(index);
            System.out.println(carta);
            System.out.println("Quedan " + cartas.size() + " cartas en deck");
        } else {
            System.out.println("El mazo está vacío");
        }
    }

    // Método para obtener el tamaño del deck
    public int getTamano() {
        return cartas.size();
    }
}
