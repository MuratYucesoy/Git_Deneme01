package day06;


import java.util.Scanner;

public class Q2perfectNumber {
    //Bir sayinin mukemmel olup olmadigini bulan bir program yaziniz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir pozitif sayi giriniz");
        int girilenSayi = scan.nextInt();
        int toplam = 0;
        for (int i = 1; i < girilenSayi; i++) {
            if (girilenSayi % i == 0){
            toplam += i;}
        }

        if (toplam==girilenSayi){
            System.out.println("Bu sayi mukemmel bir sayidir");
        }
        else{
            System.out.println("Bu sayi mukemmel bir sayi degildir.");

        }
    }
}

