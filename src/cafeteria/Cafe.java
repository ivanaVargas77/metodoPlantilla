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
public abstract class Cafe {
    
    private String nombre;
    private String tamaño;
    private Integer precio;
    
// constructor 
    public Cafe(String nombre, String tamaño, Integer precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }
    
    
//seters y geters
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public void setTamaño(String tamaño) {
//        this.tamaño = tamaño;
//    }
//
//    public void setPrecio(Integer precio) {
//        this.precio = precio;
//    }

    public String getNombre() {
        return nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public Integer getPrecio() {
        return precio;
    }
    
    
    
    // metodos principales 
    public String hervirAgua(){
        return "HIRVIENDO Aguaaaa............. \n";
    }
    
    public String prepararTaza(){
        return "PREPARANDO taza de tamaño : " + this.tamaño +"\n";  
    }
    
    public String vaciarEnTaza(){
        return "VACIANDO contenido en taza\n";
    }
    
    public String entregarCliente(){
        return "EL trabajador entrega al cliente \n";
    }
    
    
    public abstract String añadirIngredientes();
    
    
    
    public String prepararCafe(){
        return hervirAgua()+"\n" + prepararTaza()+"\n"+añadirIngredientes()+"\n" + vaciarEnTaza()+"\n"+entregarCliente() ;
    }
    
}
