package day05;

public class Q3Arrays {
    public static void main(String[] args) {
        //Create an array of 5 floats and calculate their sum.
        float[] numbers={1.0f,2.0f,3.0f,4.0f,5.0f};
        float sum=0;
        for (int i = 0; i <numbers.length ; i++) {
           sum+=numbers[i];
        }
        System.out.println(sum);
        System.out.println("********************** with while *********************");


        sum=0;
        int index=numbers.length-1;
        while (index>=0){
            sum+=numbers[index];
            index--;
        }
        System.out.println(sum);
        System.out.println("************************* do while *********************");

        sum=0;
        index=0;
        do {
            sum+=numbers[index];
            index++;
        }while (index<numbers.length);
        System.out.println(sum);


    }
}
