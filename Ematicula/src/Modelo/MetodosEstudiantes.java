/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Leandro
 */
import Vista.GUI_Botones;
import javax.swing.JOptionPane;
import java.util.ArrayList;//Importcion de la clase ArrayList.

public class MetodosEstudiantes {

    ArrayList<Estudiante> arrayEstudiantes;//ArrayList tipo claseEstudiante. 
    int estudiantesAgregados = 0;
    GUI_Botones gUI_Botones;

    public MetodosEstudiantes()//METODO CONSTRUCTOR.
    {
        arrayEstudiantes = new ArrayList<Estudiante>();//Inicialización del arrayList tipo Objeto.
    }

    //METODOS PRIMARIOS.
    public void agregarEstudiante(String informacion[]) //Metodo Agregar
    {

        Estudiante temporal = new Estudiante(informacion[0], informacion[1]);
        arrayEstudiantes.add(temporal);
        estudiantesAgregados++;
    }

    public void modificarEstudiante(String devolverInformacion[]) //Metodo Agregar
    {
        JOptionPane.showMessageDialog(null, "MODIFICAR");
        for (int contador = 0; contador < arrayEstudiantes.size(); contador++) {
            if (arrayEstudiantes.get(contador).getCarnet().equals(devolverInformacion[0])) //Verifica el getCarnet con el array [0]=carnet.
            {
                arrayEstudiantes.get(contador).setNombre(devolverInformacion[1]);//Modifica el nombre del estudiante [1]
            }
        }
    }

    public String[] consultarEstudiante(String carnet) //Metodo Agregar
    {
        String arregloDatos[] = new String[2];
        for (int contador = 0; contador < arrayEstudiantes.size(); contador++) {

            if (arrayEstudiantes.get(contador).getCarnet().equals(carnet)) {
                arregloDatos[0] = arrayEstudiantes.get(contador).getCarnet();
                arregloDatos[1] = arrayEstudiantes.get(contador).getNombre();

                contador = arrayEstudiantes.size();
            }
        }
        return arregloDatos;
    }

    public void eliminarEstudiante(String devolverCarnet) //Metodo Agregar
    {
        //JOptionPane.showMessageDialog(null, "ELIMINAR");
        for (int contador = 0; contador < arrayEstudiantes.size(); contador++) {
            if (arrayEstudiantes.get(contador).getCarnet().equals(devolverCarnet)) {
                arrayEstudiantes.remove(contador);
            }
        }
    }

    public void mostrarInformacionEstudianteTemporal() //Muestra cada vez que matricula un curso.
    {
        Estudiante estudianteTemporal;
        estudianteTemporal = arrayEstudiantes.get(estudiantesAgregados() - 1);//Usa el metodoCurso Agregados para poder mostrar el campo nuevo  del Curso guardado.
        System.out.println(estudianteTemporal.getInformacion());
        JOptionPane.showMessageDialog(null, "Proceso Exitoso\n" + estudianteTemporal.getInformacion());//Muestra Mensaje Guardado exitosamente.

    }

    //Metodos Buscadores
    public void mostrarInformacionEstudiante() {
        Estudiante temporal;
        temporal = arrayEstudiantes.get(0);
        System.out.println(temporal.getInformacion());
    }

    public void mostrarInformacionEsturdianteTemporal() //muestra cada vez que matricula un curso.
    {
        Estudiante estudianteTemporal;
        estudianteTemporal = arrayEstudiantes.get(estudiantesAgregados());
        System.out.println(estudianteTemporal.getInformacion());
        JOptionPane.showMessageDialog(null, "Guardado con exito\n" + estudianteTemporal.getInformacion());

    }

    

    public MetodosEstudiantes(ArrayList<Estudiante> arrayEstudiantes, GUI_Botones gUI_Botones) {
        this.arrayEstudiantes = arrayEstudiantes;
        this.gUI_Botones = gUI_Botones;
    }

//METODOS DE CONFIRMACION Y CONTROL DE METODOS PRIMARIOS.
    public boolean verificarAgregarEstudiante(String devolverCarnet)//Verifica si el estudiante esta en el arrayList.
    {
        boolean encontrado = false;
        for (int contador = 0; contador < arrayEstudiantes.size(); contador++) {
            if (arrayEstudiantes.get(contador).getCarnet().equals(devolverCarnet)) {
                encontrado = true;
                contador = arrayEstudiantes.size();
            }
        }
        return encontrado;
    }

    public boolean verificarExistenciaEsturdiante(String devolverCarnet)//Verifica si el estudiante esta en el arrayList.
    {
        boolean encontrado = false;
        for (int contador = 0; contador < arrayEstudiantes.size(); contador++) {
            if (arrayEstudiantes.get(contador).getCarnet().equals(devolverCarnet)) {
                encontrado = true;
                contador = arrayEstudiantes.size();
            }
        }
        return encontrado;
    }

    public int estudiantesAgregados() {
        return estudiantesAgregados;
    }

    public String mostrarTodosLosEstudiantes()//MetodoMuestra todos los estudiantes.
    {
        String mensaje="Busqueda de estudiantes agregados\n";
         for (int contador = 0; contador < arrayEstudiantes.size(); contador++) 
         {   
               mensaje+= arrayEstudiantes.get(contador).getInformacion()+"\n";
         }
       //  JOptionPane.showMessageDialog(null,mensaje); 
         return mensaje;//Retorna el mensaje
    }
    
    
    
    
    public void errorDeAgregar() {
        JOptionPane.showMessageDialog(null, "Error\nEl estudiante ya esta registrado en el Sistema.");
    }

    public int estaSeguro() {
        int estaSeguro = 0;
        do {
            estaSeguro = Integer.parseInt(JOptionPane.showInputDialog("Estas seguro de agregar el siguiente Carnet\n Si = 1\n No = 2"));

        } while (estaSeguro != 1 && estaSeguro != 2);
        return estaSeguro;
    }

    public void errorDeConsultarEstudiante() {
        JOptionPane.showMessageDialog(null, "Error\nEl Estudiante no esta registrado.");
    }

    public void errorDeEliminarEstudiante() {
        JOptionPane.showMessageDialog(null, "Error\nNo se pudo eliminar \nEl Estudiante no esta registrado.");
    }

    public void errorDeModificarEstudiante() {
        JOptionPane.showMessageDialog(null, "Error\nEl Estudiante no puso ser modificado\nEl Estudiante no esta registrado en el sistema.");
    }

    public void procesoExitoso() {
        JOptionPane.showMessageDialog(null, "Proceso realizado Exitosamente");
    }

}
