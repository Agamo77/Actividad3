public class Main {
    public static void main(String[] args) {
        //Construir el deck
        deck deck = new deck();

        //Invocar el metodo shuffle
        deck.shuffle();
        //Invocar metodo head
        deck.head();
        //Invocar metodo pick
        deck.pick();
        //Invocar metodo hand
        deck.hand();
    }
}
