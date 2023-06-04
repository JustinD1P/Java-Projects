import java.util.Scanner;
public class ElectricityBillingSystem {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        double electricRate = 17.27;

        System.out.println("Please enter the amount of electricity you've used this month: ");
        double userElectric = in.nextDouble();

        System.out.println("The amount you owe this month for the amount of electricity used is: " + userElectric * electricRate);

    }
}
