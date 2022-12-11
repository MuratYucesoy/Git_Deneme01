package maps;

import java.util.List;
import java.util.Map;

public class C05 {
    // Ogrenci map'inde numarasi verilen sayilarin arasinda(sinirlar dahil) olan ogrencilerin
    // Isim soyisim ve Bolumlerini list olarak bize döndüren bir method olusturun
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMapi=KaynakMap.ornekMap();
        int basNo=1002;
        int bitNo=1004;
       List<String> ogrenciList= KaynakMap.isimSoyisimBolumDondur(ogrenciMapi,basNo,bitNo);
        System.out.println(ogrenciList);
    }
}
