package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    //kullanicidan istedigi kadar sayi alip, bu sayilari bir Array'de toplayip
    //bu sayilarin toplamini yazdiran bir program yaziniz

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size;
        int arr[];
        int toplam=0;
        System.out.println("Kac sayi girmek istiyorsunuz: ");
        size=scan.nextInt();//initialize islemini gerceklestirdim,kullanicidan gelecek olan degeri atadim
        arr=new int[size];//arrayimin uzunlugunu belirtmek zorundaydim bu sekilde arrayimin uzunlugunu yazdim

        for (int i = 0; i <size ; i++) {
            System.out.println("Toplamak istediginiz sayilari giriniz");
            arr[i]=scan.nextInt();
            toplam+=arr[i];
        }
        System.out.println("Girdiginiz sayilar= "+ Arrays.toString(arr));
        System.out.println("Girdiginiz sayilarin toplami= "+toplam);




    }
}
