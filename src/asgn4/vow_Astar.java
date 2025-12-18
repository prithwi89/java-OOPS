package asgn4;
import java.util.*;
public class vow_Astar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string in the UPPERCASE: ");
        String input = sc.nextLine().toUpperCase();
        String  replacestring = input.replaceAll("[AEIOU]","*");
        System.out.println("New String: "+replacestring);
    }

}
