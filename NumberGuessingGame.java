import java.util.Scanner;
public class NumberGuessingGame {

    public static void main (String[]args){

        Scanner input = new Scanner (System.in);


        System.out.println("Please enter a range for the random number guesser game (Maximum then Minimum): ");
        int max = input.nextInt();
        int min = input.nextInt();

        int randomNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);

        System.out.println("Please take a guess on what is the random number (between " + min + " to " + max + "): ");
        int userGuess = input.nextInt();


        boolean isCorrect;
        String toString;

        if (userGuess == randomNumber){
            isCorrect = true;
            toString = "Correct! You got it right!";
        } else {
            isCorrect = false;
            toString = "Sorry but that was incorrect";
        }


        System.out.println(toString);

    }
}
