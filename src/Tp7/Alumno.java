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
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;

    }

    public void agregarMateria(Materia e) {

        if (materiaa.add(e)) { // si hay lugar para put. agregar  ????????????
            System.out.println("Agregado con exito");
        } else {

            System.out.println("No se ha podido agregar cliente clave repetida");
        }
    }

    public void cantidadMaterias() {
        for (Materia materia : materiaa) {
            System.out.println(materia.getNombre());
        }
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
