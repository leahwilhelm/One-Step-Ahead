import java.io.IOException;
import java.util.Scanner;
 
public class OneStepAhead
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        //variable declaration
        int num1, num2;
        int sum, diff, product;
        double quot, rem;
        char choice;
        
        //loop to repeat menu continuously
        do
        {
            //Display menu
            System.out.println("\n- - - - - Welcome to One Step Ahead - - - - -\nPlease select one of the below options\n");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quit");
            System.out.println("\nYour Choice: ");
            
            //Read input
            choice = sc.next().charAt(0);
            
            //Switch Case to perform operation
            switch(choice)
            {
                case '1':
                    System.out.print("\nEnter First number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second number: ");
                    num2 = sc.nextInt();
                    sum = num1 + num2;
                    System.out.println("\nSum = "+sum);
                    break;
                    
                case '2':
                    System.out.print("\nEnter First number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second number: ");
                    num2 = sc.nextInt();
                    diff = num1 - num2;
                    System.out.println("\nDifference = "+diff);
                    break;
                    
                case '3':
                    System.out.print("\nEnter First number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second number: ");
                    num2 = sc.nextInt();
                    product = num1 * num2;
                    System.out.println("\nProduct = "+product);
                    break;
                    
                case '4':
                    System.out.print("\nEnter First number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second number: ");
                    num2 = sc.nextInt();
                    quot = (double)num1 / num2;
                    System.out.println("\nQuotient = "+quot);
                    break;
                    
                case '5':
                    System.out.println("\nThank you for using One Step Ahead.\nHave a great day!");
                    break;
                    
                default:
                    System.out.println("\nSorry, invalid input. Please try again!");
            }
        } while (choice != '5');
    }
}