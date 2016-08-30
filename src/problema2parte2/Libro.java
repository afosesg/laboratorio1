/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2parte2;



/**
 *
 * @author Usuario
 */
public class Libro {
    int isbn, precio;
    String titulo;
   

    public Libro(int isbn, int precio, String titulo) {
        
        this.isbn = isbn;
        this.precio = precio;
        this.titulo = titulo;
    }

    
public int darIsbn(){
    return isbn;
}
public int darPrecio(){
    return precio;
}
public String darTitulo(){
    return titulo;
}

    
    
}
