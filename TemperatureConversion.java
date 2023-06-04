import java.util.Objects;
import java.util.Scanner;

public class TemperatureConversion{
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter C (convert from fahrenheit to celsius) or F (convert from celsius to fahrenheit): ");
        String value = in.nextLine();

        System.out.println("Please enter the temperature you want converted in either C or F: ");
        double temperature = in.nextDouble();
        double celsius;
        double fahrenheit;

        if(Objects.equals(value, "C")){
            celsius = ((temperature - 32) * 5) /9;
            System.out.println("After the conversion, the temperature is " + celsius);
        } else {
            fahrenheit = ((temperature * 9) / 5) + 32;
            System.out.println("After the conversion, the temperature is " + fahrenheit);
        }

        /* Test Cases
        C
        32 -> 0.0
        50 -> 10
       100 -> 37.777777777778
        -5 -> -20.55555555557


        F
        0 -> 32.0
        100 -> 212.0
       -100 -> -148.0
         48 -> 118.4.0
         */

    }
}
