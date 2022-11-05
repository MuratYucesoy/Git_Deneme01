package day04;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi aliniz
        Sayi 0'dan buyuk esit ise 10'dan kucuk olup olmadigini kontrol ediniz
        10 'dan kucuk ise ekrana "rakam" yazdiriniz degilse "pozitif sayi " yazdiriniz
        Sayi 0'dan kucuk ise ekrana "Negatif sayi" yaziniz.
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi= scan.nextInt();
        System.out.println(sayiBul(girilenSayi));
    }

    private static String sayiBul(int girilenSayi) {
        if (girilenSayi>=0){
            if (girilenSayi<10) return "rakam";
            else return "pozitif sayi";
        }
        else return "negatif sayi";
    }
}
