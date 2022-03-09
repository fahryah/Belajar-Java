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

public class programNilaiHuruf {
    public static void main (String[]args){
        
        String nama, nim;
        int tMandiri, tTerstruktur, uts, uas;
        double jumlah;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        
        System.out.print("Masukkan NIM : ");
        nim = input.nextLine();       
        
        System.out.print("Masukkan Nilai Tugas Mandiri : ");
        tMandiri = input.nextInt();
        
        System.out.print("Masukkan Nilai Tugas Terstruktur : ");
        tTerstruktur = input.nextInt();
        
        System.out.print("Masukkan Nilai UTS : ");
        uts = input.nextInt();
        
        System.out.print("Masukkan Nilai UAS : ");
        uas = input.nextInt();
        
        jumlah = (tMandiri * 0.15 + tTerstruktur * 0.15 + uts * 0.35 + uas * 0.35 )/4 ;
        
        if (jumlah > 85) {
            System.out.println ("Nilai Akhir anda adalah A");
        }
        if (jumlah > 70) {
            System.out.println ("Nilai Akhir anda adalah B");
        }
        if (jumlah > 60) {
            System.out.println ("Nilai Akhir anda adalah C");
        }
        if (jumlah > 55) {
            System.out.println ("Nilai Akhir anda adalah D");
        }
        if (jumlah < 55) {
            System.out.println ("Nilai Akhir anda adalah A");
        }
        
        System.out.println ("Selamat datang " + nama + "dengan NIM " + nim + " Nilai akhir anda adalah " + jumlah);
        
    }           
    
}
