package day05;

import java.util.Arrays;

public class Q2Arrays {
    public static void main(String[] args) {
        //make a arrays from strings and then change index 0 and index 1
        // input [rock,paper,scissors]   output [paper,rock,scissors]
        String[] names =new String[3];
        names[0]="Ayse";
        names[1]="Fatma";
        names[2]="Hayriye";

        System.out.println(Arrays.toString(names));

        String emptyCan =names[0];
        names[0]=names[1];
        names[1]=emptyCan;
        System.out.println(Arrays.toString(names));


    }
}

