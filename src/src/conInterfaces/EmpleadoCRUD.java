package conInterfaces;

import sinIntefaces.Empleado;

import java.util.ArrayList;

public interface EmpleadoCRUD {
    void  guardarEmpleados (Empleado e);
    void  eliminarEmpleado(String nombre);
    ArrayList<Empleado> getListaEmpleados();
}
