package Ejercicio_Herencia;

public class SmartPhone extends  SmartDevice{
    public String procesador;
    public int ram;

    public SmartPhone(String marca, String serial, double precio, double peso, String procesador, int ram) {
        super(marca, serial, precio, peso);
        this.procesador = procesador;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "procesador='" + procesador + '\'' +
                ", ram=" + ram +
                ", marca='" + marca + '\'' +
                ", serial='" + serial + '\'' +
                ", precio=" + precio +
                ", peso=" + peso +
                '}';
    }
}
