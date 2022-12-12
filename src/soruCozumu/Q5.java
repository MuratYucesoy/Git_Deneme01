package soruCozumu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {
    /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
       Taksimetre KM başına 2.20 TL tutmaktadır.
       Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
       Taksimetre açılış ücreti 10 TL'dir*/
    public static void main(String[] args) {
        taksimetre();
    }

    private static void taksimetre() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gidilen yolun kac km oldugunu giriniz");

        double kmUcreti = 2.20;
        double gidilenYol = 0;
        int acilisUcreti=10;
        boolean giris=true;
        do {
            try {
                gidilenYol = scan.nextDouble();

            } catch (Exception e) {
                System.out.println("Hatali giris! Sayisal deger giriniz");
                taksimetre();
                giris=false;
            }
            if ((gidilenYol * kmUcreti) + acilisUcreti < 20) {
                System.out.println("Odenecek ucret= 20TL");
            } else {
                System.out.println("Odenecek ucret= " + ((gidilenYol * kmUcreti) + acilisUcreti));
            }

        }while (true);

    }
}

