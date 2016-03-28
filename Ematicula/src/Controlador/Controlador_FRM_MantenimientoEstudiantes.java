/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Leandro
 */
import Modelo.MetodosEstudiantes;
import Vista.FRM_MantenimientoEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_FRM_MantenimientoEstudiantes implements ActionListener {

    FRM_MantenimientoEstudiantes mantenimientoEstudiante;//Instancia de la clase.
    MetodosEstudiantes metodosEstudiantes;//Instancia de la clase.

    public Controlador_FRM_MantenimientoEstudiantes(FRM_MantenimientoEstudiantes mantenimientoEstudiante) {
        this.mantenimientoEstudiante = mantenimientoEstudiante;
        metodosEstudiantes = new MetodosEstudiantes();;//Inicializacion.
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Agregar")) {
            if (metodosEstudiantes.estaSeguro() == 1) //Metodo Retorna 1 0 2 por usuario 1 esta seguro y Guarda los datos, 2 No eta Seguro No guarda nada.
            {
                if (metodosEstudiantes.verificarAgregarEstudiante(mantenimientoEstudiante.devolverCarnet()) == false)//Verifica si el curso existe. si no existe en la memoria el metodo lo Guarda, si existe muestra un mensaje de error mediante el else.
                {
                    metodosEstudiantes.agregarEstudiante(mantenimientoEstudiante.devolverInformacion());
                    metodosEstudiantes.mostrarInformacionEstudianteTemporal();//Mesanje de exito JOptionPane"Proceso Realizado exitosamente".
                    mantenimientoEstudiante.mostrarInformacionJtArea(metodosEstudiantes.consultarEstudiante(mantenimientoEstudiante.devolverCarnet()));

                } else {
                    metodosEstudiantes.errorDeAgregar();//Muestra un JOptionPane=mensaje de error.
                }
            }
        }

        if (e.getActionCommand().equals("Consultar")) {
            System.out.println("Consultar");
            if ((metodosEstudiantes.verificarExistenciaEsturdiante(mantenimientoEstudiante.devolverCarnet())) == true)//Verifica si el curso existe. si existe en la memoria lo muestra en la interfaz, si no existe muestra un mensaje de error mediante el else.
            {
                mantenimientoEstudiante.mostrarInformacion(metodosEstudiantes.consultarEstudiante(mantenimientoEstudiante.devolverCarnet()));

            } else {
                metodosEstudiantes.errorDeConsultarEstudiante();
                mantenimientoEstudiante. mostrarInformacionTodo(metodosEstudiantes.mostrarTodosLosEstudiantes());//Muestra todos los estudiantes en el jtArea

// metodosEstudiantes.mostrarTodosLosEstudiantes();
                //mantenimientoEstudiante.mostrarInformacionJtAreaTodosLosEstudiantes(metodosEstudiantes.consultarEstudiante(mantenimientoEstudiante.devolverCarnet()));
            }
        }

        if (e.getActionCommand().equals("Modificar")) {
            if ((metodosEstudiantes.verificarExistenciaEsturdiante(mantenimientoEstudiante.devolverCarnet())) == true)//Verifica si el curso existe. si existe en la memoria lo muestra en la interfaz, si no existe muestra un mensaje de error mediante el else.
            {
                metodosEstudiantes.modificarEstudiante(mantenimientoEstudiante.devolverInformacion());
                mantenimientoEstudiante.mostrarInformacion(metodosEstudiantes.consultarEstudiante(mantenimientoEstudiante.devolverCarnet()));
            } else {
                metodosEstudiantes.errorDeModificarEstudiante();//Muestra un mensaje JOptionPane "Error\nEl Curso no esta registrado en su matricula."
            }
        }

        if (e.getActionCommand().equals("Eliminar")) {
            if ((metodosEstudiantes.verificarExistenciaEsturdiante(mantenimientoEstudiante.devolverCarnet())) == true)//Verifica si el curso existe. si existe en la memoria lo muestra en la interfaz, si no existe muestra un mensaje de error mediante el else.
            {
                metodosEstudiantes.eliminarEstudiante(mantenimientoEstudiante.devolverCarnet());
                metodosEstudiantes.procesoExitoso();//Muestra un mensaje JOtionPane."Proceso realizado Exitosamente"
                mantenimientoEstudiante.limpiarInformacionJtArea(metodosEstudiantes.consultarEstudiante(mantenimientoEstudiante.devolverCarnet()));

            } else {
                metodosEstudiantes.errorDeEliminarEstudiante();

                //mantenimientoEstudiante.mostrarInformacionJtArea(metodosEstudiantes.consultarEstudiante(mantenimientoEstudiante.devolverCarnet()));
            }
        }//Fin de eliminar.
    }
}
