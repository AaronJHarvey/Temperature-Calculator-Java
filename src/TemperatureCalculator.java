import java.util.Scanner;

public class TemperatureCalculator {
    public static void main(String[] args) {
        double cTemp;
        int fTemp;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please Choose Your Conversion:\n Input 1 for Fahrenheit(F) to Celsius(C)\n Input 2 for Celsius(C) to Fahrenheit(F)\n");
        scan.close();

    }
}


// F to C Formula: 
    // (Ftemp - 32) * (5/9)

// C to F Formula:
    //  (Ctemp * 1.8) + 32



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