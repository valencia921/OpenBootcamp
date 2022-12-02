package Entregas;

public class Precio_Iva {
    public static void main(String[] args) {
    int precio_iva = 0;
    precio_iva = precio(100000,10);
        System.out.println(precio_iva);


    }
    static int precio (int precio, int iva){
        return precio *iva/100 ;
    }


}


