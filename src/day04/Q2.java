package day04;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //kullanicidan tek sayida harf iceren bir String degiskenin ortasinaki harfi
        //konsola yazdirmak icin bir java programi yaziniz
        //Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdiran method create adiniz
        /*
        ornek:
        input:Python
        output:th
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz ");
        String girilenKelime = scan.nextLine();
        System.out.println(ortadakiHarfiYazdir(girilenKelime));

    }

    public static String ortadakiHarfiYazdir(String girilenKelime) {
  int kelimeUzunlugu=girilenKelime.length();
  int ortadakiIndex=kelimeUzunlugu/2;
  int baslangicIndex=ortadakiIndex-1;
  int bitisIndex=ortadakiIndex+1;
        if (girilenKelime.length()==0) return "Hatali giris";
       else if (!(kelimeUzunlugu%2==0)) return "Girilen kelimenin ortasindaki harf: "+girilenKelime.substring(ortadakiIndex,ortadakiIndex+1);
        else return "Girilen kelimenin orsasindaki harf: "+girilenKelime.substring(baslangicIndex,bitisIndex);

        }
    }


