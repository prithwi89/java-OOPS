package asgn1;
import java.util.*;
public class oops_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting: ");
        int st = sc.nextInt();
        System.out.println("Enter the ending range: ");
        int end = sc.nextInt();
        for (int i=st;i<=end;i++){
            if (isprime(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static boolean isprime(int n){
        if(n<=1) return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return  false;
            }
        return true;
        }

}
