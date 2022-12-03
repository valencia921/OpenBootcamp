package Ejercicio_Herencia;

public class MainHerencia {
    public static void main(String[] args) {
        SmartPhone primerSmartphone = new SmartPhone("samsung","2346346l",
                657.988,3.4,"Snapdragon",2);
        SmartWatch primerSmartWatch = new SmartWatch("xiamoi",
                "12343242x",350.699,6.9,"Blanco");

        System.out.println("Este es tu primer telefono "+"\n"+primerSmartphone.toString());
        System.out.println("Este es tu primer reloj inteligente"+"\n"+primerSmartWatch.toString());
    }
}
