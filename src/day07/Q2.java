package day07;

public class Q2 {
    static int bosKova;
    public static void main(String[] args) {
        //Verilen bir array'in icerisindeki en buyuk ve en kucuk sayilari bulan methodlari yaziniz
        int[] numbers={3,12,-65,4,-34,199};
        maxNumberArrayi(numbers);
        minNumberArrayi(numbers);


    }

    private static void minNumberArrayi(int[] numbers) {
         bosKova=numbers[0];
        for (int each:numbers
             ) {
            if (bosKova>each) bosKova=each;
        }
        System.out.println("Arraydeki en kucuk sayi ="+bosKova);
    }

    private static void maxNumberArrayi(int[] numbers) {
        bosKova=numbers[0];
        for (int each:numbers
             ) {
            if (bosKova<each) bosKova=each;
        }
        System.out.println("Arraydeki en buyuk sayi= "+bosKova);

    }


}
