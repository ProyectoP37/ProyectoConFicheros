
package projecto2;
/**
 *
 * @author mario
 */
public class Pokedex {
    
   private String nombre,descripcion;

    public Pokedex() {
    }

    public Pokedex(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Pokedex{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
  
}
