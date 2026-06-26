package Tema1y2;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         
         System.out.println("Dime tu edad:");
         int edad = teclado.nextInt();
       
         if (edad >= 18 && edad <= 99){
             System.out.println("eres mayor de edad");
         }
         else if (edad >= 100) {
            System.out.println("eres un cadaver viviente");
         }
         else {
             System.out.println("eres menor de edad");
            }
            
    }
}




 





