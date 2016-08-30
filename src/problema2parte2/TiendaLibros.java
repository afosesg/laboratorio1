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
public class TiendaLibros {
    
 private Libro [] coleccion;
 private Libro [] carritoCompra;
 private Libro escogido;
 private int cantidadLibroEscogido;
 private int subtotal,total;

    public TiendaLibros(Libro[] coleccion) {
        this.coleccion = coleccion;
        
        
      
    }
 
 public Libro[] darLibrosCatalogo(){
     return coleccion;
 }
 public void buscarAgregaLibroCarritoIsbn(int pIsbn, int cantidad){

     for (int i = 0; i < coleccion.length; i++) {
            if(coleccion [i].darIsbn()==pIsbn){
                System.out.println("desea agregar al carrito?? (y/n)");
                java.util.Scanner lec=new java.util.Scanner(System.in);
                String agregar=lec.next();
                if(agregar.equals("y")){
                escogido=coleccion[i];
                cantidadLibroEscogido=cantidad;
                subtotal=escogido.darPrecio()*cantidadLibroEscogido;
                total+=subtotal;
                    System.out.println("el subtotal de la compra de libros escogidos es: "+subtotal);
                    System.out.println("el total de la compra de libros escogidos es: "+total);
                int contador=0;
                carritoCompra [contador]=escogido;
                contador++;
                    System.out.println("se agrego al carrito el libro: "+escogido.darTitulo());
                }
                
            }
            else{
                System.out.println("no existe el libro con el ISBN indicado");
            }
     
        }  
     
 }
 
public Libro[] darLibrosCarrito(){
    return carritoCompra;
}   
public void eliminarLibroCarritoIsbn(int isbn){
         for (int i = 0; i < carritoCompra.length; i++) {
            if(carritoCompra [i].darIsbn()==isbn){
                carritoCompra [i]=null;
                System.out.println("se elimino correctamente el libro del carrito de compra");
            }
            
        }
    }
    
public static void main(String []args){
    Libro coleccion[]=null;
    
    System.out.println("observe el catalogo y identifique el ISBN del libro que desea agregar al carrito");
    for (int i = 0; i < coleccion.length; i++) {
        
    }
}
}
