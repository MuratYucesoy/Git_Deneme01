package soruCozumu;

public class Q1 {
    public static void main(String[] args) {
        //verilen string bir ifadeyi tersten yazdirma

        terstenYaz("yav he he");
    }
    public static void terstenYaz(String input){
        for (int i =input.length()-1; i>=0 ; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
