import java.util.Scanner;
public class task2 extends task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int sum = 0;
        for (int i=0; i<n; i++)
        {
            System.out.println("Enter the marks for subject " + (i+1) + ":");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        double average = (double)sum/n;
        System.out.println("Total marks: " + sum);
        System.out.println("The average marks is: " + average);
        if (average >= 90 & average <= 100)  
        {
            System.out.println("Grade: A");
        }
        else if (average >= 80)  
        {
            System.out.println("Grade: B");
        }
        else if (average >= 70)  
        {
            System.out.println("Grade: C");
        }
        else if (average >= 60)  
        {
            System.out.println("Grade: D");
        }
        else  
        {
            System.out.println("Grade: F");

        sc.close();
    }
    }
    
}
