package day07;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        char[][] arr=new char[3][4];
        arr[0][0]='A';
        arr[0][1]='B';
        arr[0][2]='C';
        arr[0][3]='D';

        arr[1][0]='E';
        arr[1][1]='F';
        arr[1][2]='G';
        arr[1][3]='H';

        arr[2][0]='I';
        arr[2][1]='J';
        arr[2][2]='K';
        arr[2][3]='L';
        System.out.println(arr[0][1]);//ilk arraydeki 2.elemani verir yani"B"
        System.out.println(Arrays.toString(arr));//array'in icindeki arraylerin referanslarini verir.
        System.out.println(Arrays.deepToString(arr));//Bu sekilde icice olan butun arrayi verir

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
        }
    }

