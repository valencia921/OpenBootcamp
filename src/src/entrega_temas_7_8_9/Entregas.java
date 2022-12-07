package entrega_temas_7_8_9;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Entregas {
    public static void main(String[] args) {

        System.out.println(reverse("hola mundo"));

        String [] palabra ={"Hola","Esto", "es","el bootcamp"};
        crearUnidimensional(palabra);

        int [][] matriz = {{2,4,4},{6,6,9},{8,10,12}};
        crearBidimensional(matriz);

        Vector vector = new Vector<>();
        vector.add("Ines");
        vector.add("Sofia");
        vector.add("Sara");
        vector.add("Diego");
        vector.add("Natalia");

        Vector nuevoVector = new Vector<>();
        nuevoVector = eliminarPosVector(vector);
        imprimirVecto(nuevoVector);

        ArrayList<String> array = new ArrayList<>();
        array.add("Carro");
        array.add("Moto");
        array.add("Bicicleta");
        array.add("Avion");

        copiarArraylist(array);

        ArrayList<Integer> enteros = new ArrayList<>();
        enteros = numerosPares();
        imprimirArray(enteros);


    }

    public static void imprimirVecto(Vector vector){
        for (int i=0;i<vector.size();i++){
            System.out.println(vector.get(i));
        }
    }
    public static void imprimirArray(ArrayList<Integer> numeros){
        for (int i=0;i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
    }
    /**
     * Metodo que retorna palabra al reves
     * @param   texto que se va a revolver al reve
     * @return la palabra ingresada al reves
     */
    public static String reverse(String texto){
    String salida ="";
    char [] nuevo = texto.toCharArray();

        for(int i=nuevo.length-1;i>=0; i--){
             salida += nuevo[i];
             }
          return  salida;
    }

    /**
     * Metodo que recorre un arreglo unidimensional
     * @param palabras
     */
    public static  void crearUnidimensional(String [] palabras){
        for (int i=0;i<palabras.length;i++){
            System.out.print(palabras[i]);
        }
    }

    /**
     * Metodo que recorre un arreglo bidimensional
     * @param matriz
     */
    public static void crearBidimensional(int [][] matriz){

        for (int i =0 ; i>matriz.length;i++){
            for (int j=0; j<matriz[0].length;j++){
                System.out.println("la posicion es: "+"["+i+"]"+" " +"["+j+"]"+ " Y tiene :"+ matriz[i][j] );
            }
        }
    }

    /**
     * Metodo que eliminar la posion de un vector
     * @param vector
     * @return Nuevo vector sin los elementos eliminados
     */
    public static Vector eliminarPosVector (Vector vector){
        Vector salida = new Vector<>();
        for (int i= 0; i<=vector.size();i++){
            if(i== 2 || i==3){
                vector.remove(i);
            }else {
                salida.add(vector.get(i));
            }
        }
        return salida;
    }

    /**
     * MEtodo que copioa una array a un linked e imprime el contenido de cada uno
     * @param arreglo
     */
    public static void copiarArraylist(ArrayList<String> arreglo){
        LinkedList<String> nuevo = new LinkedList<>();
        for (int i=0 ;i<arreglo.size();i++){
            System.out.println("Soy el Arraylist  "+ arreglo.get(i));
            nuevo.add(arreglo.get(i));
        }
        for (int j=0 ;j< nuevo.size();j++){
            System.out.println("Soy el LinkedList "+ nuevo.get(j));
        }
    }

    /**
     * Metodo que entrega un array de los numeros pares
     * @return
     */
    public static ArrayList<Integer> numerosPares (){
        ArrayList<Integer> salida = new ArrayList<>();
        for (int i=1;i<=10;i++){
            if(i%2 ==0){
                salida.add(i);
            }
        }
        return salida;
    }



}
