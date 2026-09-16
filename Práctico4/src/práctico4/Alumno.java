/*Un Alumno tiene un nro. de legajo, un apellido, un nombre y una lista HashSet de materias en las 
que está inscripto; para ello tiene un método agregarMateria que permite inscribir al Alumno en 
una materia determinada (implementar de manera tal que no deje inscribir un alumno en dos 
materias iguales.) y otro método cantidadMaterias que devuelve la cantidad de materias a las que 
está inscripto el alumno.  
 
 */
package práctico4;

import java.util.HashSet;

/**
 *
 * @author LAURA TELLO
 */
public class Alumno {
    int legajo;
    String Apellido;
    String nombre;
    HashSet<Materia> materias; 

    public Alumno(int legajo, String Apellido, String nombre) {
        this.legajo = legajo;
        this.Apellido = Apellido;
        this.nombre = nombre;
        materias = new HashSet<>();
              
    }
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  public void agregarMateria(Materia m){
      materias.add(m);
  }
  public int cantidadMaterias(){
      return materias.size();
  }
}
