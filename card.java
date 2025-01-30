public class card {
    private String palo;
    private String color;
    private String valor;

    // Creamos los constructores de las cartas
public card(String palo, String color, String valor){
    this.palo = palo;
    this.color = color;
    this.valor = valor;
}
//Creamos los getters
public String getPalo() {
    return palo;
}

public String getColor() {
    return color;
}

public String getValor() {
    return valor;
}

//Usamos este metodo toString para darle mejor formato al output de las cartas
public String toString() {
    return palo + "," + color + "," + valor;
}

}
