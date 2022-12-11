package maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C03 {
    public static void main(String[] args) {
        // ogrenciler map'inde subesi H olan ogrencilerin isim soyisim ve siniflarini yazdiralim
        Map<Integer,String> ogrenciMapi=KaynakMap.ornekMap();//Bu mapteki value degerlerine ulasmak icin asagidakini yapariz
        Collection<String>ogrenciValue=ogrenciMapi.values();
        System.out.println(ogrenciValue);
        /*
        [
        Ali-Cem-10-Say-A,
        Veli-Can-11-Soz-B,
        Hasan-Can-9-Ea-A,
        Onder-Han-12-Soz-C
        ]
         */
        //Bir mapteki keylere ulasmak icin ise ;
        Set<Integer> ogrenciKey=ogrenciMapi.keySet();
        System.out.println(ogrenciKey);
        /*
        [
        1001,
        1002,
        1003,
        1004
        ]
         */
    }
}
