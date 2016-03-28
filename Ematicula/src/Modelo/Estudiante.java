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
public class Estudiante {

    private String carnet;
    private String nombre;
    

    public Estudiante( String carnet,String nombre) {
        this.carnet = carnet;
        this.nombre = nombre;
        
    }

  

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the carnet
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getInformacion() {
        return "Carnet: " + carnet+"  Nombre: " + nombre ;
    }

}
