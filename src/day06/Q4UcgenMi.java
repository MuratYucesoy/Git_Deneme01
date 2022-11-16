package day06;

import java.util.Scanner;

public class Q4UcgenMi {
    /*
   kullanicidan 3 kenar uzunlugu alarak girilen degerlerle ucgen olusturulup olusturulamayacagini kontrol edin,
   eger ucgen olma sartlarini sagliyorsa eskenar ucgen mi diye kontrol edin
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgen olusturmak icin 3 kenar uzunlugu giriniz");
        int toplamAveB=0, farkAveB=0;
        int toplamAveC=0, farkAveC=0;
        int toplamBveC=0, farkBveC=0;

        int a= scan.nextInt();
        if (a<=0){
            System.out.println("Girilen sayi 0 ve 0'dan kucuk olamaz");
            System.exit(0);
        }
        int b= scan.nextInt();
        if (b<=0){
            System.out.println("Girilen sayi 0 ve 0'dan kucuk olamaz");
            System.exit(0);
        }
        int c= scan.nextInt();
        if (c<=0){
            System.out.println("Girilen sayi 0 ve 0'dan kucuk olamaz");
            System.exit(0);
        }

        toplamAveB=a+b;
        toplamAveC=a+c;
        toplamBveC=c+b;

        farkAveB=Math.abs(a-b);
        farkAveC=Math.abs(a-c);
        farkBveC=Math.abs(b-c);

        if     (toplamAveB>c && farkAveB<c &&
                toplamAveC>b && farkAveC<b &&
                toplamBveC>a && farkBveC<a){
            System.out.println("Girdiginiz degerler ile ucgen olusturulabilir");
            if (farkAveB==0 && farkBveC==0){
                System.out.println("Girdiginiz degerler ile olusan ucgen eskenar ucgendir.");
            }
        }
        else {
            System.out.println("Girdiginiz degerler ile ucgen olusturulamaz");
        }



    }
}
