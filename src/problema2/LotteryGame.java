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
public class LotteryGame {
    int number1;
    int number2;
    int number3;
    int numUsuario1;
    int numUsuario2;
    int numUsuario3;

    public LotteryGame(int numUsuario1, int numUsuario2, int numUsuario3) {
        this.numUsuario1 = numUsuario1;
        this.numUsuario2 = numUsuario2;
        this.numUsuario3 = numUsuario3;
      number1=(int)Math.floor((Math.random()));
      number2=(int)Math.floor((Math.random()));
      number3=(int)Math.floor((Math.random()));
      if((numUsuario1==number1 && numUsuario2==number2 && numUsuario3==number3)&& (number1!=number2 && number1!=number3)&&(number2!=number3)){
          System.out.println("You Win 1,000,000");
          
      }
      else if(numUsuario1==number1 || numUsuario1==number2 || numUsuario1==number3 && numUsuario2==number1 || numUsuario2==number2 || numUsuario2==number3 && numUsuario3==number1 || numUsuario3==number2 || numUsuario3==number3 &&(number1!=number2 && number1!=number3)&&(number2!=number3)){
          System.out.println("You Win 1,000");
      }
      else if(numUsuario1==number1 || numUsuario1==number2 || numUsuario1==number3 && numUsuario2==number1 || numUsuario2==number2 || numUsuario2==number3 && number1!=number2){
          
          System.out.println("You Win 100");
          }
      else if(numUsuario1==number1 || numUsuario1==number2 || numUsuario1==number3 && numUsuario3==number1 || numUsuario3==number2 || numUsuario3==number3 &&number1!=number3){
          System.out.println("You Win 100");
      }
      else if(numUsuario2==number1 || numUsuario2==number2 || numUsuario2==number3 && numUsuario3==number1 || numUsuario3==number2 || numUsuario3==number3 && number2!=number3){
          System.out.println("You Win 100");
      }
      else if((numUsuario1==number1 || numUsuario1==number2 || numUsuario1==number3)||(  numUsuario2==number1 || numUsuario2==number2 || numUsuario2==number3) ||( numUsuario3==number1 || numUsuario3==number2 || numUsuario3==number3)){
          System.out.println("You Win 10");
      }
      else{
          System.out.println("YOU LOSER");
      }

      
        
    }
    public static void main(String [] args){
java.util.Scanner lectura= new java.util.Scanner(System.in) ;
        System.out.println("Ingrese el primer numero");
      

    }
}
    

