package day07;

public class Q5 {
    public static void main(String[] args) {
        String [][] food={{"steak","hot dog","cheeseburger"},{"pizza","pasta","canoli"},
                {"sushi","ramen","fried rice","dumpling"},
                {"kebab","manto"},{"beriyani","masal","curry","chicken tikka masala"}};
        for (String[] ulkeler:food
             ) {
            for (String yemek:ulkeler
                 ) {
                System.out.println(yemek);
            }
            System.out.println("--------------------");
        }

    }
}
