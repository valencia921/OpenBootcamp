package Ejercicio_Herencia;

public class SmartWatch extends SmartDevice{
    public String color;


    public SmartWatch(String marca, String serial, double precio, double peso, String color) {
        super(marca, serial, precio, peso);
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", serial='" + serial + '\'' +
                ", precio=" + precio +
                ", peso=" + peso +
                '}';
    }
}
