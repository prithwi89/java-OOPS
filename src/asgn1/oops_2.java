package asgn1;/*Write a Java program to calculate GCD of two integer numbers
Test cases: same as above  */
import java.util.*;
public class oops_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        try{
            int a=sc.nextInt();
            System.out.println("Enter second integer: ");
            int b=sc.nextInt();

            if (a<0||b<0){
                System.out.println("error: negative numbers not allowed");
                return;
            }
            int gcd = findgcd(a,b);
            System.out.println("gcd of "+a+" and "+b+" is: "+gcd);

        }
        catch (InputMismatchException e){
            System.out.println("Error: invalid input");
        }
    }
    public  static int findgcd(int a, int b){
        if(a==0) return b;
        if(b==0) return a;

        while(a!=b){
            if (a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }

}
