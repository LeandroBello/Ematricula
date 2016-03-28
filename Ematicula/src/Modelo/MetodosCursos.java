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
import javax.swing.JOptionPane;
import java.util.ArrayList;//Importtacion de la clase ArrayList.

public class MetodosCursos {

    ArrayList<Curso> arrayCursos;//Intancia del ArrayList tipo objeto.
    int cursosAgregados = 0;
    public boolean cursoMatriculado = false;//ATRIBUTO GLOBAL.

    MetodosEstudiantes metodosEstudiante;
    Estudiante estudiante;

    public MetodosCursos()//MetodoConstructor.
    {
        arrayCursos = new ArrayList<Curso>();//Inicialización del Array tipo Objeto.

    }

    public void agregarCurso(String informacion[])//MetodoAgregarCursos.
    {
        Curso cursoTemporal = new Curso(informacion[0], informacion[1], informacion[2]);
        arrayCursos.add(cursoTemporal);
        cursosAgregados++;
    }

    public void modificarCurso(String devolverInformacion[])//MetodoAgregarCursos.
    {
        for (int contador = 0; contador < arrayCursos.size(); contador++) {
            if (arrayCursos.get(contador).getSiglasCurso().equals(devolverInformacion[0])) {
                arrayCursos.get(contador).setSiglasCurso(devolverInformacion[0]);
                arrayCursos.get(contador).setNombreCursos(devolverInformacion[1]);
                arrayCursos.get(contador).setNumeroCreditosCurso(devolverInformacion[2]);
            }
        }

    }

    public String[] ConsultarCurso(String[] devolverInformacion)//MetodoAgregarCursos.
    {
        String arregloDatos[] = new String[3];
        for (int contador = 0; contador < arrayCursos.size(); contador++) {
            if (arrayCursos.get(contador).getSiglasCurso().equals(devolverInformacion[0])) //BUSCA LA SIGLAS CURSO.
            {
                arregloDatos[0] = arrayCursos.get(contador).getSiglasCurso();
                arregloDatos[1] = arrayCursos.get(contador).getNombreCursos();
                arregloDatos[2] = arrayCursos.get(contador).getNumeroCreditosCurso();
                contador = arrayCursos.size();
            }//Fin del if.
        }//Fin del for.

        return arregloDatos;
    }

    public boolean errorConsultarCurso(String[] devolverInformacion) {

        for (int contador = 0; contador < arrayCursos.size(); contador++) {
            if (arrayCursos.get(contador).getSiglasCurso().equals(devolverInformacion[1])) {
                cursoMatriculado = true;
                contador = arrayCursos.size();
            }

        }

        return cursoMatriculado;
    }

    public void EliminarCurso(String devolverSiglasCurso)//MetodoAgregarCursos.
    {
        for (int contador = 0; contador < arrayCursos.size(); contador++) {
            if (arrayCursos.get(contador).getSiglasCurso().equals(devolverSiglasCurso)) {
                arrayCursos.remove(contador);
                contador = arrayCursos.size();
            }
        }
    }

    public void mostrarInformacionCursoTemporal() //Muestra cada vez que matricula un curso.
    {
        Curso cursoTemporal;
        cursoTemporal = arrayCursos.get(cursosAgregados() - 1);//Usa el metodoCurso Agregados para poder mostrar el campo nuevo  del Curso guardado.
        System.out.println(cursoTemporal.getInformacion());
        JOptionPane.showMessageDialog(null, "Proceso Exitoso\n" + cursoTemporal.getInformacion());
    }
     public String mostrarTodosLosCursos()//MetodoMuestra todos los estudiantes.
    {
        String mensaje="Busqueda de Cursos agregados\n";
         for (int contador = 0; contador < arrayCursos.size(); contador++) 
         {  
               mensaje+= arrayCursos.get(contador).getInformacion()+"\n";
         }
        // JOptionPane.showMessageDialog(null,mensaje);
         
         return mensaje;//Retorna el mensaje
    }

    //Metodos Segundarios
    public boolean verificarExistenciaCurso(String devolverSiglasCurso)//Verifica si el estudiante esta en el arrayList.
    {
        boolean encontrado = false;
        for (int contador = 0; contador < arrayCursos.size(); contador++) {
            if (arrayCursos.get(contador).getSiglasCurso().equals(devolverSiglasCurso)) 
            {
                encontrado = true;
                contador = arrayCursos.size();
            }
        }
        return encontrado;
    }

    public int estaSeguro() {
        int estaSeguro = 0;
        do {
            estaSeguro = Integer.parseInt(JOptionPane.showInputDialog("Estas seguro de agregar el siguiente Carnet\n Si = 1\n No = 2"));

        } while (estaSeguro != 1 && estaSeguro != 2);
        return estaSeguro;
    }

    public void procesoExitosoCurso() {
        JOptionPane.showMessageDialog(null, "Proceso realizado Exitosamente");
    }

    public void errorDeAgregarCurso() {
        JOptionPane.showMessageDialog(null, "Error\nEl Curso ya esta registrado en el Sistema.");

    }

    public void errorDeConsultarCurso() {
        JOptionPane.showMessageDialog(null, "Error\nEl curso no puso ser encontrado\nEl Curso no esta registrado en su matricula.");
    }

    public void errorDeModificarCurso() {
        JOptionPane.showMessageDialog(null, "Error\nEl curso no puso ser modificado\nEl Curso no esta registrado en el sistema.");
    }

    public void errorDeEliminarCurso() {
        JOptionPane.showMessageDialog(null, "Error\nEl curso no pudo ser Eliminado\nEl Curso no esta registrado en su matricula.");
    }

    public int cursosAgregados() {
        return cursosAgregados;
    }

}//Fin de la clase.

