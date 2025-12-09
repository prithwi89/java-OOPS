package asgn1;
import java.util.*;
public class oops_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x= sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        double sum=0;
        int power =2;
        for (int i=1;i<=n;i++){
            double term = Math.pow(x,power)/factorial(power);
            sum+=term;
            power+=2;
        }
        System.out.println("The final sum is: "+sum);

    }
    public static long factorial(int num){
        long fact =1;
        for (int i=1; i<=num;i++){
            fact*=i;
        }
        return fact;
    }

}
