package JavaP;

import java.util.Scanner;

public class Game {

    public static void guessnumber(){
        Scanner sc = new Scanner(System.in);

        //Generating random number
        int num = 1 + (int) (100 * Math.random());

        //number of attempts
        int K = 5;

        System.out.println("A number is chosen between 1 and 100.");

        System.out.println("You have " + K + "attempts to guess the correct number.");

        // loop for number of attempts
        for(int i=0;i<K;i++) {
            System.out.println("Enter your guess:");
            int guess = sc.nextInt();

            //check condition
            if(guess == num) {
                System.out.println("Congratulations! You guessed the correct number.");

                sc.close();

                //exit function if correct guess
                return;
            }
            else if(guess < num) {
                System.out.println(" The number is greater than " + guess);

            }
            else {
                System.out.println(" The number is less than " + guess);
            }

        }

        //if user run out of attempts
        System.out.println(" You've exhausted all attempts. The correct number was: "  + num);

        sc.close();
    }

    public static void main(String[] args) {
        guessnumber();
    }


}
