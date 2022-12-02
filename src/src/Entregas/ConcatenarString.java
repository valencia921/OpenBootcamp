package Entregas;

public class ConcatenarString {
    public static void main(String[] args) {
        String [] palabras = {"Este","es","mi","primer","arreglo"};
        System.out.println(concatenar(palabras));
    }
    static String concatenar(String [] palabras){
        String salida="";
        int i=0;
        while (i<palabras.length){

              salida += palabras[i]+" ";
              i++;

        }
        return salida;
    }
}
