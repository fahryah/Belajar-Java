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
public class LatihanOperator {
    public static void main (String [] args) {
        
        //input
        int a = 8;
        int b = 4;
        int c;
        
        //proses
        //operator aritmatika
        c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        
        a++;
        b--;
        
        //operator perbandingan / relasional
        //boolean h = a==b;
        //boolean i = a!=b;
        //booelan j = a>b;
        //boolean k = a<b;
        //boolean l
        //boolean m
        
        //operator logika
        boolean n = (a>b)&&(a!=b);
        boolean o = (a>b)||(a!=b);
        boolean p = (a>b);
        
        //operator bitwise
        int q = a&b;
        int r = a|b;
        int s = a^b;
        
        boolean t = (a>b)&(a!=b);
        
        //operator shortcut
        a+=b;
        b-=a;
        
        //output
        System.out.println("Oeprator Aritmatika");
        System.out.println("Nilai Variabel A : "+a);
        System.out.println("Nilai Variabel B : "+b);
        System.out.println("Hasil Penjumlahan : "+c);
        System.out.println("Hasil Pengurangan : "+d);
        System.out.println("Hasil Perkalian : "+e);
        System.out.println("Hasil Pembagian : "+f);
        System.out.println("Hasil Modulus : "+g);
        System.out.println();
        System.out.println("Operator Perbandingan");
        System.out.println("Hasil h : "+(a==b));
        System.out.println("Hasil i : "+(a!=b));
        System.out.println("Hasil j : "+(a>b));
        System.out.println("Hasil k : "+(a<b));
        System.out.println("Hasil l : "+(a>=b));
        System.out.println("Hasil m : "+(a<=b));
        System.out.println();
        System.out.println("Operator Logika");
        System.out.println("Hasil n : "+n);
        System.out.println("Hasil o : "+o);
        System.out.println("Hasil p : "+p);
        System.out.println();
        System.out.println("Operator Bitwise");
        System.out.println("Hasil q : "+q);
        System.out.println("Hasil r : "+r);
        System.out.println("Hasil s : "+s);
        System.out.println("Hasil t : "+t);
        System.out.println();
        System.out.println("Operator Shortcut");
        System.out.println("Hasil Shortcut A : "+a);
        System.out.println("Hasil Shortcut B : "+b);
        
    }
}
