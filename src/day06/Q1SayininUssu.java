package day06;


import java.util.Scanner;

public class Q1SayininUssu {
    /*
    Kullanicidan bir sayi alarak o sayinin kacinci ussunu almak istedigini sorup
    cevabi bize  donduren bir method yaziniz
     */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Kuvvetini almak istediginiz sayiyi ve ardindan da kuvvetini giriniz");
        int taban= scan.nextInt();
        int kuvvet= scan.nextInt();
        int sonuc=1;
        while (kuvvet!=0){
            sonuc*=taban;
            kuvvet--;
        }
        System.out.println(taban+"'in istenen kuvveti= "+sonuc);
    }
}

