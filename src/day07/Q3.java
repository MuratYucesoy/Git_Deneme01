package day07;

import java.util.ArrayList;

public class Q3 {
    //Iki array arasindaki ayni olan elemanlari yeni bir array liste ekleyen program yaziniz
    //input1 {john,Brad,Angel,Sofia,Hazel}
    //input2 {Sofia,Brad,Grace,hazel,Emily}
    //output {Sofia,Brad}
    public static void main(String[] args) {
        String[] arr1={"john","Brad","Angel","Sofia","Hazel"};
        String[] arr2={"Sofia","brad","Emily","grace","Hazel"};
        arraylerinOrtakelemanlari(arr1,arr2);


    }

    private static void arraylerinOrtakelemanlari(String[] arr1, String[] arr2) {
        ArrayList<String>arrayList=new ArrayList<>();
        for (String each:arr1
             ) {
            for (String hic:arr2
                 ) {
                if (each.equalsIgnoreCase(hic)) {
                    arrayList.add(each);
                }
            }

        }
        System.out.println(arrayList);
    }
}
