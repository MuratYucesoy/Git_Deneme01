package soruCozumu;

import java.util.Scanner;

import static day03.C02DortIslemMethodlu.bolme;

public class Q4 {
    static Scanner scan = new Scanner(System.in);

    //Kullaniciya ana menu gostererek yapmak istedigi islemi sectirip islem sonucunu donduren bir program olusturalim
    public static void main(String[] args) {

        anamenu();
    }

    private static void anamenu() {

        System.out.println("Yapmak istediginiz islemi seciniz\n" +
                "1-Toplama\n" +
                "2-Cikarma\n" +
                "3-Carpma\n" +
                "4-Bolme\n" +
                "5-Cikis");

        int secim = scan.nextInt();
        switch (secim) {
            case 1: {
                toplama();
                break;
            }
            case 2: {
                cikarma();
                break;
            }
            case 3: {
                carpma();
                break;
            }
            case 4: {
               bolme();
               break;
            }
            case 5:{
                cikis();
            }
            default:{
                System.out.println("Hatali giris tekrar secim yapiniz");
                anamenu();
            }
        }
    }

    private static void cikis() {
        System.exit(0);
    }

    private static void bolme() {   int sayi1=0, sayi2=0;
        System.out.println("Bir tamsayi degeri giriniz");
        if (scan.hasNextInt()){
            sayi1=scan.nextInt();
            System.out.println("Bolmek istediginiz diger tamsayi degerini giriniz");
            if (scan.hasNextInt()){
                sayi2=scan.nextInt();
                System.out.println("Girilen sayilarin bolumu= "+(sayi1/sayi2));
            }else{
                try {
                    sayi2=Integer.parseInt(scan.next());
                }catch (NumberFormatException ex){
                    System.out.println("Hatali giris tekrar anamenuye yonlendirileceksiniz");
                    anamenu();}
            }
        }
        else {
            try {
                sayi1=Integer.parseInt(scan.next());
            }catch (NumberFormatException ex){
                System.out.println("Hatali giris tekrar anamenuye yonlendirileceksiniz");
                anamenu();}
        }
    }


    private static void carpma() {
        int sayi1=0, sayi2=0;
        System.out.println("Bir tamsayi degeri giriniz");
        if (scan.hasNextInt()){
            sayi1=scan.nextInt();
            System.out.println("Carpmak istediginiz diger tamsayi degerini giriniz");
            if (scan.hasNextInt()){
                sayi2=scan.nextInt();
                System.out.println("Girilen sayilarin carpimi= "+(sayi1*sayi2));
            }else{
                try {
                    sayi2=Integer.parseInt(scan.next());
                }catch (NumberFormatException ex){
                    System.out.println("Hatali giris tekrar anamenuye yonlendirileceksiniz");
                    anamenu();}
                }
            }
        else {
            try {
                sayi1=Integer.parseInt(scan.next());
            }catch (NumberFormatException ex){
            System.out.println("Hatali giris tekrar anamenuye yonlendirileceksiniz");
            anamenu();}
        }
    }

    private static void cikarma() {
        int sayi1=0,sayi2=0;
        System.out.println("Bir tamsayi degeri giriniz");
       if (scan.hasNextInt()){
           sayi1=scan.nextInt();
           System.out.println("Cikarmak istediginiz sayiyi giriniz");
           if (scan.hasNextInt()){
               sayi2=scan.nextInt();
               System.out.println("Cikarma islemi sonucu= "+(sayi1-sayi2));
           }else {
               try {
                   sayi2=Integer.parseInt(scan.next());
               }catch (NumberFormatException ex){
                   System.out.println("Hatali giris tekrar anamenuye yonlendirileceksiniz");
                   anamenu();}   }
           }else   try {
           sayi1=Integer.parseInt(scan.next());
       }catch (NumberFormatException ex){
           System.out.println("Hatali giris tekrar anamenuye yonlendirileceksiniz");
           anamenu();}
    }

    private static void toplama() {
        int sayi1 = 0, sayi2 = 0;
        System.out.println("Toplamak istediginiz birinci sayiyi giriniz");
        if (scan.hasNextInt()){
            sayi1=scan.nextInt();
            System.out.println("Toplamak istediginiz diger tamsayi degerini giriniz");
            if (scan.hasNextInt()){
                sayi2=scan.nextInt();
                System.out.println("Girilen sayilarin toplami= "+ (sayi1+sayi2));
            }else {
                try {
                    sayi2=Integer.parseInt(scan.next());
                }catch (NumberFormatException ex){
                    System.out.println("Hatali giris,tamsayi degeri girmelisiniz! Anamenuye yonlendiriliyorsunuz");
                    anamenu();
                }
            }
        }else {
            try {
                sayi1=Integer.parseInt(scan.next());
            }catch (NumberFormatException ex){
                System.out.println("Hatali giris,tamsayi degeri girmelisiniz! Anamenuye yonlendiriliyorsunuz");
                anamenu();
            }
        }
        System.out.println("Toplamak istediginiz ikinci sayiyi giriniz");
        if (scan.hasNextInt()){
            sayi2=scan.nextInt();
        }else {
            try {
                sayi2=Integer.parseInt(scan.next());
            }catch (NumberFormatException ex){
                System.out.println("Bir tamsayi degeri girmelisin,Islemleri tekrar yapmak icin anamenuden secim yapiniz");
                anamenu();

            }
        }

        System.out.println("Girilen sayilarin toplami= "+(sayi1+sayi2));
        }
    }
