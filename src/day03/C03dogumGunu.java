package day03;

import javax.swing.*;
import java.util.Scanner;

public class C03dogumGunu {
    /*
    Kullanicidan iki farkli dogum tarihi alip
    Kimin once dogdugunu consola yazdiran bir program yaziniz
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen dogum yilinizi giriniz yil ay gun olarak giriniz");//Ahmet
        int yil1= scan.nextInt();
        int ay1=scan.nextInt();
        int gun1=scan.nextInt();

        System.out.println("Lutfen ikinci dogum yilinizi giriniz yil ay ve gun olarak giriniz");//Ayse
        int yil2= scan.nextInt();
        int ay2=scan.nextInt();
        int gun2=scan.nextInt();

        if (yil1>yil2) {System.out.println("Ayse Ahmet'ten buyuktur");}
        else if (yil1<yil2) {System.out.println("Ahmet Ayse'den buyuktur");}
        else {//bu satira geldigimizde yillar esittir,bu durumda aylara bakmak icin yeni if blogu olusturulur
            if (ay1>ay2) {System.out.println("Ayse Ahmet'ten buyuktur");}
            else if (ay1<ay2) {System.out.println("Ahmet Ayse'den buyuktur");}
            else {
                if (gun1>gun2) {System.out.println("Ayse Ahmet'ten buyuktur");}
                else if (gun1<gun2) {System.out.println("Ahmet Ayse'den buyuktur");}
                else {
                    System.out.println("Ayni gun dogdunuz");
                }
            }
        }
        }




    }

