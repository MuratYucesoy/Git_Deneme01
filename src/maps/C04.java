package maps;

import java.util.Map;

public class C04 {
    public static void main(String[] args) {
        // ogrenciler map'inde subesi H olan ogrencilerin isim soyisim ve siniflarini yazdiralim
        Map<Integer,String> ogrenciMapi=KaynakMap.ornekMap();
        System.out.println(ogrenciMapi);
        /*
      {
      1001=Ali-Cem-10-Say-A,
      1002=Veli-Can-11-Soz-B,
      1003=Hasan-Can-9-Ea-A,
      1004=Onder-Han-12-Soz-C
      }
         */
       ogrenciMapi.put( 1005,"Kay-Han-11-Soz-A");
       ogrenciMapi.put( 1006,"Kaya-Han-10-Soz-C");
        System.out.println(ogrenciMapi);
        String subeAdi="A";
        KaynakMap.isimSoyisimGetir(ogrenciMapi,subeAdi);
    }
}
