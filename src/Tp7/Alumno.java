package Tp7;


import java.util.HashSet;


/**
 * @author Sergio
 */
public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;

    HashSet<Materia> materiaa = new HashSet<Materia>();
/*¿Qué tipo de colección implementó para evitar materias repetidas y que otras
cuestiones tuvo que modificar?*/
    /** Se sobreescribio el metodo Hashcode y el 
     * metodo equals de la clase materia para que tome el idMateria y lo pueda comparar y direccionar a la misma posicion en memoria */
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;

    }

    public void agregarMateria(Materia e) {

        if (materiaa.add(e)) { 
            System.out.println("Agregado con exito");
        } else {

            System.out.println("No se ha podido agregar cliente, clave repetida");
        }
    }

    public void cantidadMaterias() {
        int i=0;
        for (Materia materia : materiaa) {
            System.out.println(materia.getNombre());
            i++;
        }System.out.println(apellido+" tiene :"+i+" materias anotadas");
    }
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
