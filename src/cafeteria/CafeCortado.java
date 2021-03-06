/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

/**
 *
 * @author ivanita
 */
public class CafeCortado extends Cafe{

    public CafeCortado(String nombre, String tamaño, Integer precio) {
        super(nombre, tamaño, precio);
    }

    @Override
    public String añadirIngredientes() {
        return 
                "1.- Extraer 40 ml de café en una taza \n" +
                "2.- Añadir 10-20 ml de leche caliente \n" +
                "3.- Agregar 100 ml de agua hirviendo \n" +
                "4.- Agregar 2 cucharadas de espuma de leche \n"
        ;
    }
    
}
