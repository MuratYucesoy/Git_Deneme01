package maps;

import java.util.Map;

public class C01 {
        //map'e yeni bir ogrenci ekleyelim
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMapi=KaynakMap.ornekMap();
        ogrenciMapi.put(1005,"Cemil-Can-12-Soz");
        System.out.println(ogrenciMapi);
        // // 1002 numarali ogrenciyi update edelim
        ogrenciMapi.put(1002,"Kadir-Gul-11-Ea");
        System.out.println(ogrenciMapi);
        // 1003 nolu ogrencinin isim ve soyismini yazdirin
        int ogrenciKey=1003;
        System.out.println(KaynakMap.isimSoyisimYazdir(ogrenciMapi, ogrenciKey));
        // 1004 numarali ogrencinin bolumunu say yapin
        ogrenciKey=1004;
        String yeniBolum="Say";
        KaynakMap.bolumDegistir(ogrenciMapi,ogrenciKey,yeniBolum);

    }
}
