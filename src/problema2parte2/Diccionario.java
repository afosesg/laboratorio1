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
public class Diccionario {
    public static void main (String [] args){
    String [] espanolIngles= new String [100];
    String [] espanolFrances=new String [100];
    String []espanolItaliano=new String [100];
    String [] buscada=new String [100];
    String[] traducida=new String [100];
    int cantidad=0;
        System.out.println("ingrese la cantidad de palabras a traducir");
        java.util.Scanner lec=new java.util.Scanner(System.in);
        cantidad=lec.nextInt()-1;
        System.out.println("ingrese una a una las palabra que desea traducir");
        
        for (int i = 0; i < cantidad; i++) {
            buscada[i]=lec.next();
        }
        System.out.println("ingrese el idioma del que desea traducir (espanol,frances e italiano)");
        String entrada=lec.next();
        System.out.println("ingrese el idioma al que desea traducir (espanol,frances e italiano)");
        String salida=lec.next();
        if(entrada.equals("espanol")&& salida.equals("ingles")){
            for (int i = 0; i < cantidad; i++) {
                for (int j = 0; j < espanolIngles.length; j++) {
                 if(buscada[i].equals(espanolIngles[j])){;
                traducida[i]=espanolIngles[j];    
                }
                } 
          
                
                
            }
        }
        else if(entrada.equals("espanol")&& salida.equals("frances")){
            for (int i = 0; i < cantidad; i++) {
                for (int j = 0; j < espanolFrances.length; j++) {
                 if(buscada[i].equals(espanolFrances[j]));
                traducida[i]=espanolFrances[j];
                    
                }       
                
            }
        }
        else if(entrada.equals("espanol")&& salida.equals("italiano")){
            for (int i = 0; i < cantidad; i++) {
                for (int j = 0; j < espanolItaliano.length; j++) {
                 if(buscada[i].equals(espanolItaliano[j])){;
                traducida[i]=espanolItaliano[j];    
                 }
                }       
                
            }
        }
        else if(entrada.equals("ingles")&& salida.equals("espanol")){
            for (int i = 0; i < cantidad; i++) {
                for (int j = 0; j < espanolIngles.length; j++) {
                 if(buscada[i].equals(espanolIngles[j])){;
                traducida[i]=espanolIngles[j];    
                 }
                }       
                
            }
        }
        else if(entrada.equals("ingles")&& salida.equals("frances")){
            for (int i = 0; i < cantidad; i++) {
                for (int j = 0; j < espanolIngles.length; j++) {
                 if(buscada[i].equals(espanolIngles[j])){;
                 String temp=espanolIngles[j];
                    for (int k = 0; k < espanolFrances.length; k++) {
                    if( temp.equals(espanolFrances[j])){
                        traducida[i]=espanolFrances[j]; 
                    }    
                    }
                
                 }
                }       
                
            }
        }
        else if(entrada.equals("ingles")&& salida.equals("italiano")){
            for (int i = 0; i < cantidad; i++) {
                for (int j = 0; j < espanolIngles.length; j++) {
                 if(buscada[i].equals(espanolIngles[j])){;
                 String temp=espanolIngles[j];
                    for (int k = 0; k < espanolItaliano.length; k++) {
                    if( temp.equals(espanolItaliano[j])){
                        traducida[i]=espanolItaliano[j]; 
                    }    
                    }
                
                 }
                }       
                
            }
        }
        else if(entrada.equals("frances")&& salida.equals("ingles")){
            for (int i = 0; i < cantidad; i++) {
                for (int j = 0; j < espanolFrances.length; j++) {
                 if(buscada[i].equals(espanolFrances[j])){;
                 String temp=espanolFrances[j];
                    for (int k = 0; k < espanolIngles.length; k++) {
                    if( temp.equals(espanolIngles[j])){
                        traducida[i]=espanolIngles[j]; 
                    }    
                    }
                
                 }
                }       
                
            }
        }
        else if(entrada.equals("frances")&& salida.equals("italiano")){
            for (int i = 0; i < cantidad; i++) {
                for (int j = 0; j < espanolFrances.length; j++) {
                 if(buscada[i].equals(espanolFrances[j])){;
                 String temp=espanolFrances[j];
                    for (int k = 0; k < espanolItaliano.length; k++) {
                    if( temp.equals(espanolItaliano[j])){
                        traducida[i]=espanolItaliano[j]; 
                    }    
                    }
                
                 }
                }       
                
            }
        }
        else if(entrada.equals("frances")&& salida.equals("espanol")){
            for (int i = 0; i < cantidad; i++) {
                for (int j = 0; j < espanolFrances.length; j++) {
                 if(buscada[i].equals(espanolFrances[j])){;
                traducida[i]=espanolFrances[j];    
                 }
                }       
                
            }
        }
        else if(entrada.equals("italiano")&& salida.equals("ingles")){
            for (int i = 0; i < cantidad; i++) {
                for (int j = 0; j < espanolItaliano.length; j++) {
                 if(buscada[i].equals(espanolItaliano[j])){;
                 String temp=espanolItaliano[j];
                    for (int k = 0; k < espanolIngles.length; k++) {
                    if( temp.equals(espanolIngles[j])){
                        traducida[i]=espanolIngles[j]; 
                    }    
                    }
                
                 }
                }       
                
            }
        }
        for(int i=0; i < cantidad; i++){
    System.out.println("la traduccion es: "+traducida[i]);
        }
    }
}
