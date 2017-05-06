
package factorial;

import java.io.*;
import java.util.*;

import java.util.Scanner;


public class Factorial {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("ingrese un numero");
        int numero=leer.nextInt();
        int factorial=1;
        while (numero !=0)
        {factorial*=numero;
        numero--;
        } 
        System.out.println("el factorial es "+factorial);
        
        
    }
    
}
