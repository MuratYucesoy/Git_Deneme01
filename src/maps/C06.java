package maps;

import java.util.Map;

public class C06 {
    public static void main(String[] args) {
        // Ogrenci Map'inden Numara, isim ve soyisim degerlerini yazdiralim
        Map<Integer,String>ogrenciMapi=KaynakMap.ornekMap();
        ogrenciMapi.put(1005,"Suleyman-Sah-11-EA-A");
        ogrenciMapi.put(1006,"Sule-Karaca-10-Soz-C");

        KaynakMap.numaraIsimSoyisimYazdir(ogrenciMapi);

    }
}
