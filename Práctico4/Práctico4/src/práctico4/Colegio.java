/*
 */
package práctico4;

/**1. Crear las materias:  
a. Web 2 de 
segundo año.  
b. Matemáticas de 
primer año.  
c. Laboratorio 1 de 
primer año  
2. Crear 2 alumnos.  
a. López Martin con legajo 1001.  
b. Martínez Brenda con legajo 1002.  
3. Inscribir a López en las 3 materias. 
4. Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.  
5. Visualizar la cantidad de materias a las que está inscripto cada alumno.  
 *
 * @author LAURA TELLO
 */
public class Colegio {
 
    public static void main(String[] args) {
        // TODO code application logic here
        Materia web2 = new Materia (1,"Web 2", 2);
        Materia Matemáticas = new Materia (2, "Matemáticas", 1);
        Materia Laboratorio1 = new Materia (3, "Laboratorio1", 1);
        
    Alumno alumno1 = new Alumno (1001, "López", "Martin");
    Alumno alumno2 = new Alumno (1002, "Martínez", "Brenda"); 
    
    alumno1.agregarMateria(web2);
    alumno1.agregarMateria(Matemáticas);
    alumno1.agregarMateria(Laboratorio1);
    
    alumno2.agregarMateria(web2);
    alumno2.agregarMateria(Matemáticas);
    
    
}
    }
