package conInterfaces;

import sinIntefaces.Empleado;

import java.util.ArrayList;

public class main {
     static implementEmpleadoCRUD empleadoCrud = new implementEmpleadoCRUD();
    public static void main(String[] args) {

        ArrayList<Empleado> misEmpleados = new ArrayList<>();

        Empleado juan = new Empleado("Juan carlos",25,566.999,false);
        Empleado maria = new Empleado("maria",23,966.999,false);
        Empleado carlos = new Empleado(" carlos",28,568.999,false);

        empleadoCrud.guardarEmpleados(juan);
        empleadoCrud.guardarEmpleados(maria);
        empleadoCrud.guardarEmpleados(carlos);

        empleadoCrud.eliminarEmpleado("maria");

        misEmpleados =empleadoCrud.getListaEmpleados();

        for (int i=0; i<misEmpleados.size();i++)
            System.out.println(misEmpleados.get(i).getNombre());
    }
}
