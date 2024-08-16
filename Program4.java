import java.util.Scanner;

public class program4
{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        int one, two, three, four;
        
        System.out.println("Enter a 3 digit number");
        one = s1.nextInt();
        System.out.println("Enter a 3 digit number");
        two = s1.nextInt();
        System.out.println("Enter a 3 digit number");
        three = s1.nextInt();
        System.out.println("Enter a 3 digit number");
        four = s1.nextInt();
        
        int sum = one + two + three + four;
        System.out.println("The sum of the four numbers is " + sum);
        
        double average = sum/4.0;
        System.out.println("The average of the four numbers is " + average);
    }
       
}
