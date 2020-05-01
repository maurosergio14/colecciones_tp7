package Tp7;

/**
 * @author Sergio
 */
public class Colegio {

    public static void main(String[] args) {

        Materia ingles = new Materia(1, "Ingles", 1);
        Materia matematicas = new Materia(2, "Matematicas", 1);
        Materia laboratorio = new Materia(3, "Laboratorio", 1);

        Alumno lopez = new Alumno(1001, "Lopez", "Martin");
        Alumno martinez = new Alumno(1002, "Martinez", "Brenda");
        
        lopez.agregarMateria(ingles);
        lopez.agregarMateria(matematicas);
        lopez.agregarMateria(laboratorio);
        martinez.agregarMateria(ingles);
        martinez.agregarMateria(matematicas);
        martinez.agregarMateria(laboratorio);
        martinez.agregarMateria(laboratorio);
        martinez.cantidadMaterias();
        lopez.cantidadMaterias();

    }       


}
