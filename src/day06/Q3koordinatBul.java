package day06;

import java.util.Scanner;

public class Q3koordinatBul {
    //Kullanicidan aliginiz koordinat noktasinin(x=3,y=1)
    //koordinat sisteminde hangi noktada oldugunu yazdiran bir kod yazdirin
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Koordinat sistemi uzerinde yerinizi bulmak icin x ve y degerlerini giriniz");
        int x=scan.nextInt();
        int y=scan.nextInt();
        if (x>0&&y>0){System.out.println("Bulundugunuz nokta 1. bolgededir");}
        else if (x<0&&y>0){System.out.println("Bulundugunuz nokta 2. bolgededir");}
        else if (x<0&&y<0){System.out.println("Bulundugunuz nokta 3. bolgededir");}
        else if (x>0&&y<0){System.out.println("Bulundugunuz nokta 4. bolgededir");}
        else if (x!=0&&y==0){System.out.println("Bulundugunuz nokta X ekseni uzerindedir");}
        else if (x==0&&y!=0){System.out.println("Bulundugunuz nokta Y ekseni uzerindedir");}
        else {System.out.println("Bulundugunuz nokta Orijin'dir");}
    }
}
