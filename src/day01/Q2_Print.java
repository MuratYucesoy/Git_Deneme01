package day01;

public class Q2_Print {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi alin ve;
        input=76543
        7
        6
        5
        4
        3
        sekliinde output alin
         */
        int sayi=76543;
        int birler=sayi%10;
        int onlar =(sayi/10)%10;
        int yuzler =(sayi/100)%10;
        int binler =(sayi/1000)%10;
        int onbinler =(sayi/10000)%10;
        System.out.println(onbinler+ "\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler);



    }
}
