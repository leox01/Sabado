/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miPaquete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leox01
 */
public class PruebaSiiau {

  
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static ArrayList<Administrativo> administrativos = new ArrayList<>();
    public static ArrayList<Profesor> profesores = new ArrayList<>();
    
    public static Scanner tecladoInt = new Scanner(System.in);
    public static Scanner tecladoString = new Scanner(System.in);
   
    public static void main(String[] args) {
     
       
        int respuesta;
        
        do{
            System.out.println("Bienvenido a mi programa");
            System.out.println("1.-Profesores");
            System.out.println("2.-Administrativos");
            System.out.println("3.-Alumnos");
            System.out.println("4.-Salir");
            respuesta = tecladoInt.nextInt();
            
            switch(respuesta){
                
                case 1:
                    menuProfesor();
                    break;
                case 2:
                    menuAdministrativo();
                    break;
                case 3:
                    menuAlumno();
                    break;
                case 4:
                    System.out.println("Saliendo....");
                    break;
                default:System.out.println("Opción no válida");
            
            }
        }while(respuesta!=4);
        
        
    }
    
    
    public static void menuProfesor() {
    }

    public static void menuAdministrativo() {
    }

    public static void menuAlumno() {
        int respuesta;
        
        do{
            System.out.println("Menú Alumnos");
            System.out.println("1.-Registrar");
            System.out.println("2.-Mostrar todos");
            System.out.println("3.-Buscar");
            System.out.println("4.-Eliminar");
            System.out.println("5.-Editar");
            System.out.println("6.-Regresar al menú anterior");
            respuesta = tecladoInt.nextInt();

            switch(respuesta){
                case 1:
                    registrarEstudiante();
                    break;
                case 2:
                    mostrarAlumnos();
                    break;
                case 3:
                    buscarAlumno();
                    break;
                case 4:
                    eliminarAlumno();
                    break;
                case 5:
                    editarAlumno();
                    break;
                case 6:
                    System.out.println("Regresando...");
                    break;
                default:System.out.println("No es una opción válida");
            }
        
        }while(respuesta!=6);
               
    }

    private static void registrarEstudiante() {
    
        System.out.println("Dame el código del estudiante");
        String codigo = tecladoString.nextLine();
        System.out.println("Dame el nombre del estudiante");
        String nombre = tecladoString.nextLine();
        System.out.println("Dame la carrera del estudiante");
        String carrera = tecladoString.nextLine();
        System.out.println("Dame la direccion del estudiante");
        String direccion = tecladoString.nextLine();
        
        Estudiante estudiante = new Estudiante(nombre, codigo, carrera, direccion);
        
        
        estudiantes.add(estudiante);
    
    }

    private static void mostrarAlumnos() {
        
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrar();
        }
      
    }

    private static void buscarAlumno() {
    
        System.out.println("Dame el código el alumno a buscar");
        String codigoBuscado = tecladoString.nextLine();
        
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getCodigo().equals(codigoBuscado)){
                estudiante.mostrar();
                return;
            }
                
        }
        System.out.println("No existe ese código de estudiante");
    }

    private static void eliminarAlumno() {
    
        int indexDelAlumnoAEliminar = 0;
        int respuesta;
        System.out.println("Dame el código el alumno a eliminar");
        String codigoBuscado = tecladoString.nextLine();
        
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getCodigo().equals(codigoBuscado)){
                estudiante.mostrar();
                System.out.println("Seguro que quieres eliminar? 1.- Si, 2.-No ");
                respuesta = tecladoInt.nextInt();
                
                if(respuesta==1){
                
                    estudiantes.remove(indexDelAlumnoAEliminar);
                    return;
                }
               
            }
            indexDelAlumnoAEliminar++;
        }
        System.out.println("No existe ese código de estudiante");
    
    }

    private static void editarAlumno() {
    
        int respuesta;
        System.out.println("Dame el código el alumno a editar");
        String codigoBuscado = tecladoString.nextLine();
        
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getCodigo().equals(codigoBuscado)){
                estudiante.mostrar();
                
                System.out.println("¿Que quieres editar?");
                System.out.println("1.-Codigo");
                System.out.println("2.-Nombre");
                System.out.println("3.-Carrera");
                System.out.println("4.-Direccion");
                System.out.println("5.-Todo");
                System.out.println("6.-No editar");
                respuesta = tecladoInt.nextInt();
                switch(respuesta){
                    
                    case 1:
                        System.out.println("Dame el código");
                        estudiante.setCodigo(tecladoString.nextLine());
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                        
                    default: System.out.println("No es una opción válida");
                }
                return;
            }
                
        }
        System.out.println("No existe ese código de estudiante");
    
    
    }

    
}
