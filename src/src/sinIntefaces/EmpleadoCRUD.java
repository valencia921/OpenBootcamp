package sinIntefaces;

import java.util.ArrayList;

public class EmpleadoCRUD {
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public void guardarEmpleados (Empleado e) {
        listaEmpleados.add(e);
    }

    public void  eliminarEmpleado(String nombre){
        for (int i =0; i<listaEmpleados.size();i++){
            if (listaEmpleados.get(i).equals(nombre)){}
                listaEmpleados.remove(i);
        }
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
}
