package day03;

import java.util.Scanner;

public class C04DogumGunuCzum2 {
    public static void main(String[] args) {
         /*
    Kullanicidan iki farkli dogum tarihi alip
    Kimin once dogdugunu consola yazdiran bir program yaziniz
     */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen dogum yilinizi giriniz yil ay gun olarak giriniz");//Ahmet
        int yil1= scan.nextInt();
        int ay1=scan.nextInt();
        int gun1=scan.nextInt();

        System.out.println("Lutfen ikinci dogum yilinizi giriniz yil ay ve gun olarak giriniz");//Ayse
        int yil2= scan.nextInt();
        int ay2=scan.nextInt();
        int gun2=scan.nextInt();

        int ahmetinDogumGunu=yil1*10000+ay1*100+gun1;
        int ayseninDogumGunu=yil2*10000+ay2*100+gun2;
        if (ayseninDogumGunu>ahmetinDogumGunu) System.out.println("Ahmet daha buyuktur");
        else if (ahmetinDogumGunu>ayseninDogumGunu) {
            System.out.println("Ayse daha buyuktur");
        }else {
            System.out.println("yaslari esittir");
        }
    }
}
