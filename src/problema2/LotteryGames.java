/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *clase que representara las loterias
 * @author Usuario 
 */
public class LotteryGames {
    

    public static void lotteryGame(int numUsuario1, int numUsuario2, int numUsuario3 ) {
    int number1;
    int number2;
    int number3;
   
       
      number1=(int)Math.floor((Math.random()*10));
      number2=(int)Math.floor((Math.random()*10));
      number3=(int)Math.floor((Math.random()*10));
      if((numUsuario1==number1 && numUsuario2==number2 && numUsuario3==number3)&& (number1!=number2 && number1!=number3)&&(number2!=number3)){
          System.out.println("You Win 1,000,000");
          System.out.println("yours numbers: number 1="+numUsuario1+", number 2="+numUsuario2+" and number 3="+numUsuario3);
          System.out.println("Pc numbers: number 1="+number1+", number 2="+number2+" and number 3="+number3);
          
      }
      else if((numUsuario1==number1 || numUsuario1==number2 || numUsuario1==number3) && (numUsuario2==number1 || numUsuario2==number2 || numUsuario2==number3) && ( numUsuario3==number1 || numUsuario3==number2 || numUsuario3==number3) &&(number1!=number2 && number1!=number3 && number2!=number3)){
          System.out.println("yours numbers:  number 1="+numUsuario1+", number 2="+numUsuario2+" and number 3="+numUsuario3);
          System.out.println("Pc numbers:  number 1="+number1+", number 2="+number2+" and number 3="+number3);          
          System.out.println("You Win 1,000");
          
      }
      else if((numUsuario1==number1 || numUsuario1==number2 || numUsuario1==number3) && (numUsuario2==number1 || numUsuario2==number2 || numUsuario2==number3) && (number1!=number2)){
          System.out.println("yours numbers:  number 1="+numUsuario1+", number 2="+numUsuario2+" and number 3="+numUsuario3);
          System.out.println("Pc numbers:  number 1="+number1+", number 2="+number2+" and number 3="+number3);
          System.out.println("You Win 100");
          }
      else if((numUsuario1==number1 || numUsuario1==number2 || numUsuario1==number3) && (numUsuario3==number1 || numUsuario3==number2 || numUsuario3==number3) &&(number1!=number3)){
          System.out.println("yours numbers:  number 1="+numUsuario1+", number 2="+numUsuario2+" and number 3="+numUsuario3);
          System.out.println("Pc numbers:   number 1="+number1+", number 2="+number2+" and number 3="+number3);          
          System.out.println("You Win 100");
      }
      else if((numUsuario2==number1 || numUsuario2==number2 || numUsuario2==number3) && (numUsuario3==number1 || numUsuario3==number2 || numUsuario3==number3) &&( number2!=number3)){
          System.out.println("yours numbers:  number 1="+numUsuario1+", number 2="+numUsuario2+" and number 3="+numUsuario3);
          System.out.println("Pc numbers:  number 1="+number1+", number 2="+number2+" and number 3="+number3);          
          System.out.println("You Win 100");
      }
      else if((numUsuario1==number1 || numUsuario1==number2 || numUsuario1==number3)||(  numUsuario2==number1 || numUsuario2==number2 || numUsuario2==number3) ||( numUsuario3==number1 || numUsuario3==number2 || numUsuario3==number3)){
          System.out.println("yours numbers:  number 1="+numUsuario1+", number 2="+numUsuario2+" and number 3="+numUsuario3);
          System.out.println("Pc numbers:  number 1="+number1+", number 2="+number2+" and number 3="+number3);          
          System.out.println("You Win 10");
      }
      else{
          System.out.println("yours numbers:  number 1 ="+numUsuario1+", number 2 ="+numUsuario2+" and number 3 ="+numUsuario3);
          System.out.println("Pc numbers:   number 1 ="+number1+", number 2 ="+number2+" and number 3 ="+number3);         
          System.out.println("YOU LOSER");
      }

      
        
    }
    public static void main(String [] args){
        
java.util.Scanner lectura= new java.util.Scanner(System.in) ;
        System.out.println("Ingrese el primer numero");
        int numUsuario1 = lectura.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numUsuario2 = lectura.nextInt();
        System.out.println("ingrese el tercer numero");
        int numUsuario3 = lectura.nextInt();
      lotteryGame(numUsuario1, numUsuario2, numUsuario3);

    }
}
    

