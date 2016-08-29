/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author Usuario
 */
public class opcion {  

public static void main(String [] args){
java.util.Scanner lectura= new java.util.Scanner(System.in) ;
System.out.println("Primera Función en Main");
int a =lectura.nextInt();

if(a==1){
    func1();    
}
else if(a==2){
    func2();
}
    System.out.println("Se Termina Main");
    
}

public static void func1(){
    System.out.println("Segunda Función");
}
public static void func2(){
    System.out.println("Tercera Función");
}

    
}

         
    

