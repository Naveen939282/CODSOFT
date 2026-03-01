import java.util.Random;
import java.util.Scanner; 
import java.util.Random;

public class task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int b = random.nextInt(100)+1;
        for (int i=3; i>0; i--)
        {
        System.out.println("Enter the guess for the generated number. You have " + i + " attempts.");
        int a = sc.nextInt();
        
        if (a==b)
        {
            System.out.println("Congratulations! You guessed the number.");
            System.out.println("Your score is " + (3/i)*10 + "%");
        }
        else if (a>b)
        {
            System.out.println("Sorry, you guessed too high.");
        }
        else
        {
            System.out.println("Sorry, you guessed too low.");  
        }
        
    }
     System.out.println("The generated number was " + b);
    System.out.println("If u want to play again, please enter 1. If not, enter 0.");
        int c = sc.nextInt();
        if (c==1)
        {
            main(args);
        }
        else if (c==0)
        {
            System.out.println("Thank you for playing!");
        }
       
        sc.close();
    }
}