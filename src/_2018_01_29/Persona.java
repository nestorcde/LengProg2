/*
 * Nestor Damian Espinola Chaves
 * CI: 4.543.390
 * Analisis De Sistemas
 */
package _2018_01_29;


public class Persona {
    private Integer id = 0;
    private String nombre = "";
    private Integer edad = 0;
    
    public Persona(Integer id,String nombre,Integer edad){
        this.edad=edad;
        this.id = id;
        this.nombre = nombre;
    }
    

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
}
