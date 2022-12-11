package maps;

import java.util.*;

public class KaynakMap {
    public static Map<Integer,String>ornekMap(){   //burasi method ve bize map dondurecek dedigimiz bir method
        Map<Integer,String>ogrenciMapi=new HashMap<>();  //burasi ise dondurecegimiz map cunku map dondurecegiz demistik
        ogrenciMapi.put(1001,"Ali-Cem-10-Say-A");
        ogrenciMapi.put(1002,"Veli-Can-11-Soz-B");
        ogrenciMapi.put(1003,"Hasan-Can-9-Ea-A");
        ogrenciMapi.put(1004,"Onder-Han-12-Soz-C");
        return ogrenciMapi;
    }


    public static String isimSoyisimYazdir(Map<Integer, String> ogrenciMapi, int ogrenciKey) {
        String ogrenciValue=ogrenciMapi.get(ogrenciKey);
        String[]arr=ogrenciValue.split("-");
        String istenenValue=arr[0]+" "+arr[1];
        return istenenValue;
    }

    public static Map<Integer,String> bolumDegistir(Map<Integer, String> ogrenciMapi, int ogrenciKey, String yeniBolum) {
        String ogrenciValue=ogrenciMapi.get(ogrenciKey);
        String[]arr=ogrenciValue.split("-");
        arr[3]=yeniBolum;
        String yeniValue=arr[0]+arr[1]+arr[2]+arr[3];
        ogrenciMapi.put(ogrenciKey,yeniValue);
        System.out.println(ogrenciMapi);
        return ogrenciMapi;
    }

    public static void isimSoyisimGetir(Map<Integer, String> ogrenciMapi, String subeAdi) {
        Collection<String>ogrencivalue =ogrenciMapi.values();
        for (String each:ogrencivalue
             ) {
           String[]ogrenciValueArr=each.split("-");
           if (ogrenciValueArr[4].equals(subeAdi)){
               System.out.println(ogrenciValueArr[0]+" "+ogrenciValueArr[1]);
           }
        }
    }


    public static List<String> isimSoyisimBolumDondur(Map<Integer, String> ogrenciMapi, int basNo, int bitNo) {
        List<String>ogrenciList=new ArrayList<>();
        Set<Integer>ogrenciSet=ogrenciMapi.keySet();
        String value;
        String [] valueArr;
        String istenenValue;

        for (Integer eachKey:ogrenciSet
             ) {
            if (basNo<=eachKey && eachKey<=bitNo){
                value=ogrenciMapi.get(eachKey);
                valueArr=value.split("-");
                istenenValue=valueArr[0]+" "+valueArr[1]+" "+valueArr[3];
                ogrenciList.add(istenenValue);
            }
        }
        return ogrenciList;
    }

    public static void numaraIsimSoyisimYazdir(Map<Integer, String> ogrenciMapi) {
       Set<Integer>ogrenciSeti=ogrenciMapi.keySet();
       String value;
       String [] valueArr;
        for (Integer eachKey:ogrenciSeti
             ) {
            value=ogrenciMapi.get(eachKey);
            valueArr=value.split("-");
            System.out.println(eachKey+" "+valueArr[0]+" "+valueArr[1]);
        }
    }
}

