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
import Vista.FRM_MantenimientoCursos;
import Vista.FRM_MantenimientoEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_FRM_MenuPrincipal implements ActionListener
{
    FRM_MantenimientoEstudiantes mantenimientoEstudiante;
    FRM_MantenimientoCursos mantenimientoCurso;
    
    public Controlador_FRM_MenuPrincipal()
    {
    mantenimientoEstudiante=new FRM_MantenimientoEstudiantes();
    mantenimientoCurso=new FRM_MantenimientoCursos();
    }
    
    public void actionPerformed( ActionEvent e)
    {
        if (e.getActionCommand().equals("Salir")) {
            System.exit(0);
        }
        if (e.getActionCommand().equals("Estudiante")) {
            this.mantenimientoEstudiante.setVisible(true);
        }
        if (e.getActionCommand().equals("Curso")) {
            this.mantenimientoCurso.setVisible(true);
        }

    }//Fin de actionPerformed
    
}//Fin de la clase.
