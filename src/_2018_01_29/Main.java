/*
 * Nestor Damian Espinola Chaves
 * CI: 4.543.390
 * Analisis De Sistemas
 */
package _2018_01_29;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        /*Personas perso = new Personas(5, "Nestor", 30);
        Clientes cli = new Clientes(5, "Robert", 40, 165000);
        System.out.println(perso.toString());
        System.out.println(cli.toString());*/
        ArrayList<Clientes> clientesList= new ArrayList<>();
        Clientes cli= new Clientes(1,"Luis",8,155000);
        clientesList.add(cli);
        cli = new Clientes(2,"Marta",23,200000);
        
        clientesList.add(cli);
        Iterator it = clientesList.iterator();
        
        /*while (it.hasNext()){
            System.out.println(it.next());
        }*/
        while (it.hasNext()){
            cli = (Clientes) it.next();
        System.out.println(cli);
    }
        clientesList.remove(0);
        for (int i=0; i<clientesList.size();i++){
            System.out.println(clientesList.get(i).getNombre());
        }
        
    }
}
