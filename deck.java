import java.util.random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


//Creamos los atributos List para guardar las cartas y Random para que no se numeros al azar
public class deck {
    private List<card> cartas;
    private Random random; 

 
 // Aqui creamos el constructor del deck
    public Deck() {
        cartas = new ArrayList<>();
        random = new Random();
        
// Se inicializan las cartas que usaremos

String[] color = {"Rojo","Negro"};
String[] palo = {"Treboles", "Espadas","Diamantes","Corazones"};
String[] valor = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

for (String palo : palo) {
    String color = (palo.equals("Diamantes") || palo.equals("Corazones")) ? "Rojo" : "Negro";

    for (String valor : valor) {
        cartas.add(new Card(palo, valor, color));
    }
}
    }

 //Creamos los metodos solicitados
 //Primero metodo shuffle para revolver el deck
    public void shuffle() {
        Collections.shuffle(cartas, random);
        System.out.println("Se mezclo el Deck")
    }

 //Despues creamos el metodo head para mostrar la primera carta y sacarla del deck
     public void head() {
        if (!cartas.isEmpty()) {
            Card carta = cartas.remove(0);
            System.out.println(carta);
            System.out.println("Quedan " + cartas.size() + " cartas en el deck");
        }
        else {
            System.out.println("El mazo esta vacio");
        }
     }

     //Creamos metodo hand para sacar una mano de 5 cartas y sacarlas del deck
     public void hand() {
        if (cartas.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card carta = cartas.remove(0);
                System.out.println(carta);
            }
            System.out.println("Quedan " + cartas.size() + " cartas en el deck");
        
        }
        else {
            System.out.println("No hay suficientes cartas en el mazo");
        }
     }

     //Metodo pick para seleccionar una carta al azar y sacarla del deck
     public void pick() {
        if (!cartas.isEmpty()) {
            int index = random.nextInt(cartas.size());
            Card carta = cartas.remove(index);
            System.out.println(carta);
            System.out.println("Quedan " + cartas.size() + " cartas en deck");
        }
        else {
            System.out.println("El mazo esta vacio")
        }
     }

     //Por ultimo el metodo que nos da el tamano del deck
     public int getTamano() {
        return cartas.size();
     }
     }
    

}
