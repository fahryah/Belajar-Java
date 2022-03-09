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

public class pilihanUKM {
    public static void main (String [] args){
        
        String nama, jurusan, pilihan;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        
        System.out.print("Masukkan Jurusan : ");
        jurusan = input.nextLine();    
        
        System.out.print("== PILIHAN UKM ==\n"
                + "1. Basket \n"
                + "2. Volly \n"
                + "3. Sepak Bola \n"
                + "Masukkan Pilihan Anda [1/2/3] : ");
        pilihan = input.next();
        
        switch(pilihan){
            case "1" :
                System.out.print ("Anda masuk UKM Basket");
                break;
                
            case "2" :
                System.out.println ("Anda masuk UKM Volly");
                break;
                
            case "3" :
                System.out.println ("Anda masuk UKM Sepak Bola");
                break;
                
            default :
                System.out.println ("Pilihan yang anda masukkan salah!");
                break;
                
        }
        
    }
    
}
