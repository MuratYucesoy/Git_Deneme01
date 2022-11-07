package day05;

import java.util.Random;
import java.util.Scanner;

public class Q1RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Random random=new Random();

        int userChoice=0;
        int compChoice=0;
        int user=0;
        int comp=0;

        do {
            System.out.println("=========================\n" +
                    "Please make your choice :\n\t1 for Rock \n\t2 for Paper \n\t3 for Scissors  ");
            userChoice=scan.nextInt();
            compChoice=random.nextInt(3)+1;

            if (userChoice==1 && compChoice==2){
                System.out.println("User Choice= "+ userChoice +" Compiters' Choice= "+ compChoice+
                        "\nPaper wraps Rocks");
                comp++;
                System.out.println("User = "+ user +"| Comp= " + comp);
            }
            else if (userChoice==1 && compChoice==3){
                System.out.println("User Choice= "+ userChoice +" Compiters' Choice= "+ compChoice+
                        "\nRock breaks Scissors");
                user++;
                System.out.println("User = "+ user +"| Comp= " + comp);
            }
            else if (userChoice==2 && compChoice==1){
                System.out.println("User Choice= "+ userChoice +" Compiters' Choice= "+ compChoice+
                        "\nRock wraps Paper");
                user++;
                System.out.println("User = "+ user +"| Comp= " + comp);
            }
            else if (userChoice==2 && compChoice==3){
                System.out.println("User Choice= "+ userChoice +" Compiters' Choice= "+ compChoice+
                        "\nScissors cuts Paper");
                comp++;
                System.out.println("User = "+ user +"| Comp= " + comp);
            }
            else if (userChoice==3 && compChoice==1){
                System.out.println("User Choice= "+ userChoice +" Compiters' Choice= "+ compChoice+
                        "\nRock breaks Scissors");
                comp++;
                System.out.println("User = "+ user +"| Comp= " + comp);
            }
            else if (userChoice==3 && compChoice==2){
                System.out.println("User Choice= "+ userChoice +" Compiters' Choice= "+ compChoice+
                        "\nScissors cuts Paper");
                user++;
                System.out.println("User = "+ user +"| Comp= " + comp);
            }
            else {
                System.out.println("User Choice= "+ userChoice +" Compiters' Choice= "+ compChoice+
                        "\nIt's a tie");
            }
            System.out.println("User = "+user +"| Comp= " + comp);





        }while (user !=5 && comp !=5);{
            if (user>comp) System.out.println("You are the winner");
            else System.out.println("You are the loser");
        }
    }
}
