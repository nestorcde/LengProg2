/*
 * Nestor Damian Espinola Chaves
 * CI: 4.543.390
 * Analisis De Sistemas
 */
package _2018_01_29;

/**
 *
 * @author user
 */
public class Clientes extends Persona{
    private Integer deuda = 0;

    public Clientes(Integer id, String nombre, Integer edad, Integer deuda) {
        super(id, nombre, edad);
        this.deuda = deuda;
    }

    public Integer getDeuda() {
        return deuda;
    }

    public void setDeuda(Integer deuda) {
        this.deuda = deuda;
    }

    @Override
    public String toString() {
        return "Clientes{" + super.toString() + "deuda=" + deuda + '}';
    }
    
}
