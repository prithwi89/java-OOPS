package asgn4;

import java.util.*;
public class print_palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("palindrome in this sentence: ");

        for (String word : words){
            if (isPalindrome(word)){
                System.out.println(word);
            }
        }

    }
    public static boolean isPalindrome(String word){
        int left =0;
        int right =word.length()-1;
        while(left<right){
            if (word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

