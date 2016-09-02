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

    public static void main (String [] args){
        String []coleccionNombreLibros=new String[30];
        String []carritoCompra=new String[30];
        int[]precios=new int[30];
        int subtotal=0, total=0;
        String buscado;
        String termino="y";
        java.util.Scanner lec= new java.util.Scanner(System.in);
        while(termino.equals("y")){
        for (int i = 0; i < coleccionNombreLibros.length; i++) {
            String seleccionado=coleccionNombreLibros[i];
            System.out.println("ingrese el nombre del libro que busca");
            buscado=lec.next();
            if(buscado.equals(seleccionado)){
                System.out.println("desea agregarlo?? (y/n)");
                String desicion=lec.next();
                if(desicion.equals("y")){
                    System.out.println("cuantos desea llevar??");
                    int cantidad=lec.nextInt();
                    carritoCompra[i]=seleccionado;
                    subtotal=(cantidad* precios[i]);
                    System.out.println("el subtotal de la compra es "+subtotal+" y la cantidad que agrego es de: "+cantidad);
                    total+=subtotal;
                    System.out.println("ha terminado su compra? (y/n)");
                    termino=lec.next();
                }
            }
            System.out.println("el libro buscado: "+buscado+" no esta en el catalogo");
        }
    }
        System.out.println(" el total por la compra es "+total);
   }
}
