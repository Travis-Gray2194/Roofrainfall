import java.util.Scanner;

public class Roofrainfall {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        long length;
        long width;
        long roof_dimensions;
        long rainfallest;
        long cubicwater;
        long numgallonsofwater;
        String yes;

        do { //Prompt r for roof dimensions
            System.out.println("Please enter your roof length? (inches)");
            length = keyboard.nextLong();

            System.out.println("Please enter your roof width?(inches)");
            width = keyboard.nextLong();
            keyboard.nextLine();

            System.out.println("Please enter estimated rainfall(inches)");
            rainfallest = keyboard.nextLong();
            keyboard.nextLine();


            roof_dimensions = length * 12 + width * 12;

            cubicwater = roof_dimensions * rainfallest * 1; //Cubic inchs of rainfall
            numgallonsofwater = cubicwater / 231;
            System.out.println("Water runoff from storm is " + numgallonsofwater + "  Gallons ");

            System.out.println("Do you want to enter calculate another water runoff estimate Yes or No");//Prompt user for another answer
            yes = keyboard.nextLine();
        } while (yes.equalsIgnoreCase("Yes"));//If user enters Yes run loop 


    }
}
