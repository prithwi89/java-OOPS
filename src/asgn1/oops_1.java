package asgn1;/* calculate factorial of an integer number */
import java.util.*;
public class oops_1 {
    static long factorial(int n){
        long fact =1;
        for(int i=1;i<=n;i++){
            fact =fact*i;
        }
        return fact;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        String input = sc.next();

        try{
            int num = Integer.parseInt(input);
            if(num<0){
                System.out.println("Error: no Factorial for negative number");
            }
            else {
                long result = factorial(num);
                System.out.println("Factorial: "+result);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Error: Invalid input. Please enter a valid input");
        }

    }
}
