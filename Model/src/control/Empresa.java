package control;

import gui.Menu;
import utilidades.Datos;
import datos.Personal;

/**
 *
 * @author Antonio
 */
public class Empresa {
    
    private Personal personal = new Personal();

    public void iniciarPrograma() {
        boolean seguir = true;
        do {
            Menu.mostrarMenu();
            seguir = this.seleccionOpciones();
        } while (seguir);
        System.out.println("   --- Fin de la sesion ---");
    }

    public boolean seleccionOpciones() {

        boolean continuar = true;

        //Non preocupare do try
        try {
            switch (Datos.recogeInt()) {
                case 1:
                    //ALTA DE UN EMPLEADO
                    personal.addEmpleado();
                    break;

                case 2:
                    //ELIMINAR UN EMPLEADO
                    personal.eliminarEmpleado();
                    break;

                case 3:
                    //LISTAR EMPLEADOS
                    personal.listarEmpleados();
                    break;

                case 4:
                    //INDICAR SI EXISTE UN EMPLEADO
                    personal.existeEmpleado();
                    break;

                case 5:
                    //MODIFICAR DATOS DE UN EMPLEADO
                    personal.modificarEmpleado();
                    break;
                    
                case 6:
                    //INCENTIVAR DATOS DE UN DIRECTOR
                    personal.incentivarDirectores();
                    break;                    

                case 7:
                    //CASOS DE PRUEBA
                    personal.CasosDePrueba();
                    break;

                case 0:
                    continuar = salir();
                    break;
            }
        } catch (Exception e) {
            System.out.println("error: " + e.toString());
        }
        return continuar;
    }

    private boolean salir() throws Exception {
        String sino = Datos.recogeString("   ¿Está seguro?(S/N)");
        return (sino.toUpperCase().charAt(0) != 'S');
    }
    
}
