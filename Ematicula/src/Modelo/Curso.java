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
public class Curso 
{
    private String nombreCurso;
    private String siglasCurso;
    private String numeroCreditosCurso;
    
    
    public Curso(String siglasCurso,String nombreCurso, String numeroCreditosCurso)
    {
    this.nombreCurso=nombreCurso;
    this.siglasCurso=siglasCurso;
    this.numeroCreditosCurso=numeroCreditosCurso;
    }

    /**
     * @return the nombreCursos
     */
    public String getNombreCursos() {
        return nombreCurso;
    }

    /**
     * @param nombreCursos the nombreCursos to set
     */
    public void setNombreCursos(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    /**
     * @return the SiglasCurso
     */
    public String getSiglasCurso() {
        return siglasCurso;
    }

    /**
     * @param SiglasCurso the SiglasCurso to set
     */
    public void setSiglasCurso(String siglasCurso) {
        this.siglasCurso = siglasCurso;
    }

    /**
     * @return the numeroCreditosCurso
     */
    public String getNumeroCreditosCurso() {
        return numeroCreditosCurso;
    }

    /**
     * @param numeroCreditosCurso the numeroCreditosCurso to set
     */
    public void setNumeroCreditosCurso(String numeroCreditosCurso) {
        this.numeroCreditosCurso = numeroCreditosCurso;
    }
    
    public String getInformacion()
    {
       return"Siglas curso: "+siglasCurso+"  Nombre curso: "+nombreCurso+"  Número creditos: "+numeroCreditosCurso;
    }
}//FIN DE LA CLASE.
