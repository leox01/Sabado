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
public class Estudiante extends Universitario{
    
    private String carrera;

    public Estudiante() {
        
    }
    
    public Estudiante(String nombre,String codigo, String carrera, String direccion){
        super(codigo, nombre, direccion);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    public void mostrar(){
    
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Carrera: "+getCarrera());
        System.out.println("Direccion: "+getDireccion());
    
    }

   

   
}
