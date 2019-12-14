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
public class Administrativo extends Universitario{
    
    private String cargo;

    public Administrativo() {
    }

    public Administrativo(String cargo, String codigo, String nombre, String direccion) {
        super(codigo, nombre, direccion);
        this.cargo = cargo;
    }
    
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    
}
