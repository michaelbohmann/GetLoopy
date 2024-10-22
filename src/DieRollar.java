import java.util.Random;
import java.util.Scanner;

class DieRollar
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean continueRolling = true;
        int rollNumber = 1;


        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("----------------------------------------------------------");


        while (continueRolling)
        {

            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int die3 = rand.nextInt(6) + 1;


            int sum = die1 + die2 + die3;


            System.out.printf("%-10d %-10d %-10d %-10d %-10d\n", rollNumber, die1, die2, die3, sum);


            if (die1 == die2 && die2 == die3)
            {
                System.out.println("Triple! All dice are the same.");
                break;
            }


            String input;


            while (true)
            {
                System.out.print("Do you want to roll again? (y/n): ");
                input = scanner.next();
                if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n"))
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                }
            }


            if (input.equalsIgnoreCase("n"))
            {
                continueRolling = false;
            }


            rollNumber++;
        }


        scanner.close();
    }
}