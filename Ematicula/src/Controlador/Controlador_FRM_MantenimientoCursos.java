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
import Modelo.MetodosCursos;//Importacion del paquete [Modelo] clase MetodosCursos.
import Vista.FRM_MantenimientoCursos;//Importacion del paquete [Vista] clase FRM_MantenimientoCurso.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.GUI_InformacionCurso;

public class Controlador_FRM_MantenimientoCursos implements ActionListener {

    FRM_MantenimientoCursos mantenimientoCurso;//Instancia de la clase.
    MetodosCursos metodosCurso;//Instancia de la clase.
    GUI_InformacionCurso gUI_InformacionCurso;

    public Controlador_FRM_MantenimientoCursos(FRM_MantenimientoCursos mantenimientoCurso)//MetodoConstructor.
    {
        this.mantenimientoCurso = mantenimientoCurso;
        metodosCurso = new MetodosCursos();
    }

    public void actionPerformed(ActionEvent e) //Escuchador de botones y textos de [FRM_MantenimientoCursos][]
    {
        if (e.getActionCommand().equals("AgregarCurso")) {
            if (metodosCurso.estaSeguro() == 1) //Metodo Retorna 1 0 2 por usuario 1 esta seguro y Guarda los datos, 2 No eta Seguro No guarda nada.
            {
                if ((metodosCurso.verificarExistenciaCurso(mantenimientoCurso.devolverSiglasCurso())) == false)//Verifica si el curso existe. si no existe en la memoria el metodo lo Guarda, si existe muestra un mensaje de error mediante el else.
                {
                    metodosCurso.agregarCurso(mantenimientoCurso.devolverInformacionCurso());//Guarda los datos en arrayList.
                    metodosCurso.mostrarInformacionCursoTemporal();//Muestra mensaje de procesoRealizado con exito.

                    mantenimientoCurso.mostrarInformacionJtArea(metodosCurso.ConsultarCurso(mantenimientoCurso.devolverInformacionCurso()));

                } else {
                    metodosCurso.errorDeAgregarCurso();//Muestra un JOptionPane=mensaje de error.
                }
            }
        }

        if (e.getActionCommand().equals("ConsultarCurso")) {
            System.out.println("ConsultarCurso");

            if ((metodosCurso.verificarExistenciaCurso(mantenimientoCurso.devolverSiglasCurso())) == true)//Verifica si el curso existe. si existe en la memoria lo muestra en la interfaz, si no existe muestra un mensaje de error mediante el else.
            {
                mantenimientoCurso.mostrarInformacion(metodosCurso.ConsultarCurso(mantenimientoCurso.devolverInformacionCurso()));
                mantenimientoCurso.mostrarInformacionJtArea(metodosCurso.ConsultarCurso(mantenimientoCurso.devolverInformacionCurso()));

                metodosCurso.procesoExitosoCurso();//Muestra un mensaje JOtionPane."Proceso realizado Exitosamente"
            } else {
                metodosCurso.errorDeConsultarCurso();//Muestra un mensaje JOptionPane "Error\nEl Curso no esta registrado en su matricula."
                mantenimientoCurso.mostrarInformacionTodo(metodosCurso.mostrarTodosLosCursos());//Muestra todos los estudiantes en el jtArea

            }

        }

        if (e.getActionCommand()
                .equals("ModificarCurso")) {
            System.out.println("ModificarCurso");
            if ((metodosCurso.verificarExistenciaCurso(mantenimientoCurso.devolverSiglasCurso())) == true)//Verifica si el curso existe. si existe en la memoria lo muestra en la interfaz, si no existe muestra un mensaje de error mediante el else.
            {
                metodosCurso.modificarCurso(mantenimientoCurso.devolverInformacionCurso());
                mantenimientoCurso.mostrarInformacionJtArea(metodosCurso.ConsultarCurso(mantenimientoCurso.devolverInformacionCurso()));
                metodosCurso.procesoExitosoCurso();//Muestra un mensaje JOtionPane."Proceso realizado Exitosamente"

            } else {
                metodosCurso.errorDeModificarCurso();//Muestra un mensaje JOptionPane "Error\nEl Curso no esta registrado en su matricula."
            }
        }

        if (e.getActionCommand()
                .equals("EliminarCurso")) {
            System.out.println("EliminarCurso");
            if ((metodosCurso.verificarExistenciaCurso(mantenimientoCurso.devolverSiglasCurso())) == true)//Verifica si el curso existe. si existe en la memoria lo muestra en la interfaz, si no existe muestra un mensaje de error mediante el else.
            {
                metodosCurso.EliminarCurso(mantenimientoCurso.devolverSiglasCurso());
                metodosCurso.procesoExitosoCurso();//Muestra un mensaje JOtionPane."Proceso realizado Exitosamente"
                mantenimientoCurso.limpiarInformacionJtArea(metodosCurso.ConsultarCurso(mantenimientoCurso.devolverInformacionCurso()));

            } else {
                metodosCurso.errorDeEliminarCurso();//Muestra un mensaje JOptionPane "Error\nEl Curso no esta registrado en su matricula."
            }
        }
    }
}
