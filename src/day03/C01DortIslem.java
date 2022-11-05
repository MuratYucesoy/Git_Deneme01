package day03;

import java.util.Scanner;

public class C01DortIslem {
    public static void main(String[] args) {
        //kulanicidan iki deger alip kullanicinin istegine gore carpma bolme toplama veya cikarma islemi yapan
        // bir kod yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Lutfen yapmak istediginiz islemi seciniz:" +
                "\n\t1.Toplama\n\t2.Cikarma\n\t3.Carpma\n\t4.Bolme");
        int islem = scan.nextInt();
        if (islem == 1) {
            System.out.println("Girdiginiz sayilarin toplami =" + (a + b));
        } else if (islem == 2) {
            System.out.println("Girdiginiz sayilarin cikarma sonucu =" + (a - b));

        } else if (islem == 3) {
            System.out.println("Girdiginiz sayilarin carpimi =" + (a * b));

        } else if (islem == 4) {
            System.out.println("Girdiginiz sayilarin bolumu =" + (a / b));

        } else {
            System.out.println("Hatali giris yaptiniz");


        }


    }
}
