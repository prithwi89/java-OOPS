package asgn2;

import java.util.Scanner;

class Sort {
    int a[] = new int[10];

    void arrange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        // Modified Bubble Sort
        for (int i = 0; i < 10 - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < 10 - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break; // Optimization: exit if no swaps occurred
        }

        System.out.println("The sorted order is: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = a.length - 1;
        int pos = -1; // To store the index if found

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                pos = mid;
                break;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (pos != -1) {
            System.out.println("Number " + key + " found at index " + pos);
        } else {
            System.out.println("Number " + key + " not found in the array.");
        }
    }
}

public class oops_7 {
    public static void main(String[] args) {
        Sort obj = new Sort();

        // Step 1: Input and Sort
        obj.arrange();

        // Step 2: Search
        obj.search();
    }
}