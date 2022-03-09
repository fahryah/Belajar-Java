/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarProgramJava;

/**
 *
 * @author akutagawaxyz
 */
import java.util.Scanner;

public class bilanganPosNeg {
    public static void main(String[]args){
   
    int bilangan;
    Scanner input = new Scanner(System.in);
   
    System.out.println ("Masukkan bilangan : ");
    bilangan = input.nextInt();
    if (bilangan < 0){
        System.out.println ("bilangan " + bilangan + " adalah bilangan negatif");

    }
    else {
        System.out.println ("bilangan " + bilangan + " adalah bilangan positif");
    }
    
  }
}
    

