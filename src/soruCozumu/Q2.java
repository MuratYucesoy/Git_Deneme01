package soruCozumu;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alip kullanicinin girdigi sayinin armstrong sayi olup olmadigini bulunuz 153

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayyi degeri giriniz");
        int girilenSayi=scan.nextInt();
        int sayi=girilenSayi;
        int toplam=0;
        for (int i =0; i <Integer.toString(girilenSayi).length() ; i++) {
         int basamak=sayi%10;
         toplam+=(basamak*basamak*basamak);
         sayi=sayi/10;
        }
        if (toplam==girilenSayi){
            System.out.println("Bu bir armstrong sayidir");
        }else {
            System.out.println("Armstrong sayi degildir");
        }

    }
    }