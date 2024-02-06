package homework;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Select your furniture: ");
        System.out.println("1- Desk");
        System.out.println("2- Chair");
        System.out.println("3- Sofa");

        System.out.println("Please enter the number of the product you want to buy:");
        int input = scanner.nextInt();

        whichProduct(input);
    }

    
    public static void whichProduct(int input) {
        switch (input) {
            case 1:
                System.out.println("You ordered Desk.");
                break;
            case 2:
                System.out.println("You ordered Chair.");
                break;
            case 3:
                System.out.println("You ordered Sofa.");
                break;
            default:
                System.out.println("Please enter a valid product number.");
        }
    }
}
