package maps;

import java.util.Map;
import java.util.TreeMap;

public class C02 {
    public static void main(String[] args) {
        // Verilen bir cumlede kullanilan her bir harfi
        // ve o harfin kullanim miktarini
        // A=5 , b=3 ... gibi yazdirin
        String str= "Javayi balonu patlatmadan bitirelim";
        // J=1 , a=7, v=1 , y=1......
        String [] arr=str.split("");
        Map<String,Integer>tekrariBul=new TreeMap<>();
        int sayac=0;
        for (int i = 0; i < arr.length ; i++) {
            if (tekrariBul.containsKey(arr[i]))
                continue;
            else {
                for (int j =i; j <arr.length ; j++) {
                    if (arr[j].equals(arr[i])){
                        sayac++;
                    }
                }
            }
            tekrariBul.put(arr[i],sayac);
            sayac=0;
        }
        System.out.println(tekrariBul);
    }
}
