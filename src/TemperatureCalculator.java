import java.util.Scanner;
import java.text.DecimalFormat;

public class TemperatureCalculator {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        double cTemp;
        double fTemp;
        int choice;
        int x=1;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please Choose Your Conversion:\n Input 1 for Fahrenheit(F) to Celsius(C)\n Input 2 for Celsius(C) to Fahrenheit(F)\n");
            choice = scan.nextInt();

        
        switch (choice) {
            case 1:
                System.out.print("You have selected: FAHRENHEIT TO CELSIUS\n");
                System.out.print("Please input the Fahrenheit temperature you wish to convert: ");
                fTemp = scan.nextInt();
                cTemp = (fTemp - 32) * 5/9;
                System.out.print("\n" + fTemp + " degrees Fahreheit is " + df.format(cTemp) + " degrees Celsius\n\n");
                x=0;
                break;
            case 2:
                System.out.print("You have selected: CELSIUS TO FAHRENHEIT\n");
                System.out.print("Please input the Celsius temperature that you wish to convert: ");
                cTemp = scan.nextInt();
                fTemp = (cTemp * 1.8) + 32; 
                System.out.print("\n" + cTemp + " degrees Celsius is " + Math.round(fTemp) + " degrees Fahrenheit\n\n");
                x=0;
                break;
            default:
                System.out.print("Invalid selection, Please try again \n\n");
                break;
        }

    } while (x != 0);
        
        // System.out.print("Please input your temperature you wish to convert. ")

    }
}






    // Prompt user to choose if they are converting Fahrenheit to Celsius OR Celsius to Fahrenheit
    // When they have chosen enter an if/else statement:
        // If (F to C){
            // confirm for the user the choice via output
            // Prompt user to input their Fahrenheit Temperature (fTemp)
            // run the temperature they have given through the F to C formula
                // cTemp = (fTemp - 32)/(5/9)
        // } else if (C to F){
            // confirm to the user their choice via output
            // Prompt user to input their Celsius Temperature (cTemp)
            // run the temperature they have given through the C to F formula
                //  fTemp = (cTemp * 1.8) + 32
        // }