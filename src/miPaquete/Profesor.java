/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miPaquete;

/**
 *
 * @author leox01
 */
public class Profesor extends Universitario{
    
    private String clase;

    public Profesor() {
    }


    public Profesor(String clase, String codigo, String nombre, String direccion) {
        super(codigo, nombre, direccion);
        this.clase = clase;
    }

    

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
    
    
    
}
