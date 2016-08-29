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
public class GuessingGame {
    int answer;
    int guess;
    int numGuesses;
   

    public GuessingGame() {
   
        answer = (int)Math.floor((Math.random()*100)+1);
        guess=0;
        
        
          for(numGuesses=1;numGuesses>7 || guess==answer;numGuesses++){
              
              if (numGuesses>7){
                  System.out.println("You Loser");
              }
    
            }
          java.util.Scanner lectura= new java.util.Scanner(System.in) ;
          System.out.println("Guess a number");
          guess=lectura.nextInt();
          if(guess<answer)
          {
              System.out.println("Higher...");
          }
          else if(guess>answer){
              System.out.println("Lower..");
          }
          else{
              System.out.println("You Win");
          }
          
          
          
    }



    
public static void main (String [] args){
    String playAgain = "y";
    if (playAgain=="y"){
       //GuessingGame();
    System.out.println("Would you like play another game(y/n)");
    java.util.Scanner lectura= new java.util.Scanner(System.in);
    playAgain=lectura.next();
        
    }
   
    
    
    
}    
     
}
