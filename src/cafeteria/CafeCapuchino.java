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
public class CafeCapuchino extends Cafe{

    public CafeCapuchino(String nombre, String tamaño, Integer precio) {
        super(nombre, tamaño, precio);
    }

    @Override
    public String añadirIngredientes() {
         return
                "1.- Vertir 60 ml de leche fría \n" +
                "2.- Vertor 25 ml de café oscuro encima\n" +
                "3.- Agregar 90 ml de agua hirviendo\n"+
                "4.- Agregar espuma de capuchino\n" +
                "5.- Espolvorear Canela molida y cacao en polvo\n"
        ;
    }
    
}
