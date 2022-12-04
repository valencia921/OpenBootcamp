package conInterfaces;

import sinIntefaces.Empleado;

import java.util.ArrayList;

public class implementEmpleadoCRUD implements  EmpleadoCRUD{
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    @Override
    public void guardarEmpleados(Empleado e) {
        listaEmpleados.add(e);
    }

    @Override
    public void eliminarEmpleado(String nombre) {
        for (int i =0; i<listaEmpleados.size();i++){
            if (listaEmpleados.get(i).getNombre().equals(nombre)){
                listaEmpleados.remove(i);
            }

        }
    }

    @Override
    public ArrayList<Empleado> getListaEmpleados() {
        return this.listaEmpleados;
    }
}
