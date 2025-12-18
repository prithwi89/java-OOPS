package asgn4;
import java.util.*;
public class LONGEST_WORD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input =sc.nextLine();
        String[] words = input.split(" ");
        String longestword = "";
        int maxlength=0;
        for(String word : words){
            if (word.length()>maxlength){
                maxlength= word.length();
                longestword = word;
            }
        }

        System.out.println("Longest word: "+longestword);
        System.out.println("length of the word: "+maxlength);
    }
}
