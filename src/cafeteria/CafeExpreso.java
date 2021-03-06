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
public class CafeExpreso extends Cafe{

    public CafeExpreso(String nombre, String tamaño, Integer precio) {
        super(nombre, tamaño, precio);
    }

    @Override
    public String añadirIngredientes() {
        return "1.- Extraer 70 ml de café en una taza\n" +
                "2.- Agregar 100 ml de agua hirviendo \n";
    }
    
    
}
