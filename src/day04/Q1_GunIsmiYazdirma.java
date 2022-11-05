package day04;

import java.util.Scanner;

public class Q1_GunIsmiYazdirma {
    public static void main(String[] args) {
        //kullanicidan gun numarasi alip gun ismini yazdiran bir program yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun numarasi giriniz");
        int gunSayisi= scan.nextInt();
       /* if (gunSayisi<=0||gunSayisi>7) System.out.println("Hatali gun sayisi girisi");
        else if (gunSayisi==1) System.out.println("pazartesi");
        else if (gunSayisi==2) System.out.println("sali");
        else if (gunSayisi==3) System.out.println("carsamba");
        else if (gunSayisi==4) System.out.println("persembe");
        else if (gunSayisi==5) System.out.println("cuma");
        else if (gunSayisi==6) System.out.println("cumartesi");
        else System.out.println("pazar");*/
        //Ayni sorunun switchcase ile cozumu

        switch (gunSayisi){
            case 1:
            System.out.println("pazartesi");
               break;
            case 2:
            System.out.println("sali");
                break;
            case 3:
            System.out.println("carsamba");
                break;
            case 4:
            System.out.println("persembe");
                break;
            case 5:
            System.out.println("cuma");
                break;
            case 6:
            System.out.println("cumartesi");
                break;
            case 7:
            System.out.println("pazar");
                break;
            default:
                System.out.println("Hatali giris");

        }

    }
}
