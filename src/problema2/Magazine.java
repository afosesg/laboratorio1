/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author Usuario
 */
public class Magazine {
    

    public static void main (String [] args){
        int contUnder20Female =0, incomeUnder30k=0;
        int cont20y29Female=0, income30y49k=0;
        int cont30y39Female=0, income50y69k=0;
        int cont40y49Female=0;
        int cont50Female=0, income70k=0;
        int cont50upFemale=0, income70kUp=0;
        int contUnder20Male=0;
        int cont20y29Male=0;
        int cont30y39Male=0;
        int cont40y49Male=0;
        int cont50Male=0;
        int cont50upMale=0;
        String genero;
        int age, income;
        String clasiGenero;
        System.out.println("por favor ingrese su edad");
        java.util.Scanner lectura= new java.util.Scanner(System.in);
        age=lectura.nextInt();
        System.out.println("por favor ingrese su genero (F/M)");
        genero=lectura.next();
        System.out.println(" por favor digite sus ingresos anuales");
        income=lectura.nextInt();
        System.out.println("por favor ingrese si desea clasificar por genero o ingresos (g/i)");
        clasiGenero=lectura.next();
        while(clasiGenero.equals("g")){
        if(age<20&&genero.equals("f")){
            contUnder20Female++;
        }
       else if(age<20&&genero.equals("m")){
            contUnder20Male++;
        }
       else if(age>=20&&age<30&&genero.equals("f")){
            cont20y29Female++;
        }
       else if(age>=20&&age<30&&genero.equals("m")){
            cont20y29Male++;
        }
       else if(age>=30&&age<40&&genero.equals("f")){
            cont30y39Female++;
        }
       else if(age>=30&&age<40&&genero.equals("m")){
            cont30y39Male++;
        } 
       else if(age>=40&&age<50&&genero.equals("f")){
            cont40y49Female++;
        }
       else if(age>=40&&age<50&&genero.equals("m")){
            cont40y49Male++;
        } 
       else if(age==50&&genero.equals("f")){
           cont50Female++;
        }
       else if(age==50&&genero.equals("m")){
           cont50Male++;
       }
       else if(age>50&&genero.equals("f")){
            cont50upFemale++;
        }
       else if(age>50&&genero.equals("m")){
            cont50upMale++;
        }
        }
        if(income<30000){
            incomeUnder30k++;
            
        }
        else if(income>=30000&&income<50000){
            income30y49k++;
        }
        else if(income>=50000&&income<70000){
            income50y69k++;
        }
        else if(income==70000){
            income70k++;
        }
        else if(income>70000){
            income70kUp++;
        }
   }
    
}
