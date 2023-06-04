import java.util.Scanner;
public class StringReversing {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word or sentence to be reversed: ");

        String reversingString = input.nextLine();
        String reversedString = " ";

        char temp;

        System.out.println("The original word is: " + reversingString);

        for (int i = 0; i < reversingString.length(); i++){
            temp = reversingString.charAt(i);
            reversedString = temp + reversedString;
        }
        System.out.println(reversingString + " in reverse is: " + reversedString);

    }
}
