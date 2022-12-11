package soruCozumu;

import java.util.Map;
import java.util.TreeMap;

public class Q3 {
    public static void main(String[] args) {
        //kullanicinin girdigi bir cumlede kelimelerin kac defa kullanildigini gosteren bir koz yaziniz.

        String input="hadi hadi sen bilirsin sen";
        String[] arr=input.split(" ");
        Map<String,Integer>tekrariBul=new TreeMap<>();

        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (tekrariBul.containsKey(arr[i]))
                continue;
            else {
            for (int j = i; j <arr.length ; j++) {
                if (arr[i].equals(arr[j])){
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
