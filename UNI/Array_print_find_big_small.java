//WAP to reed and print an array. also find greatest and smallest element in array

import java.util.Scanner;

public class Array_print_find_big_small {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int arrlength = in.nextInt();
        int[] arr = new int[arrlength];
        for (int i = 0; i < arrlength; i++) {
            System.out.print("Enter the data for index " + i + " :");
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arrlength; i++) {
            System.out.print(arr[i] + ",");

        }
        System.out.println();
        int smallele = 0;
        int largeele = 0;
        for (int i = 0; i < arrlength; i++) {
            if (arr[i] > arr[largeele]) {
                largeele = i;
            }
            if (arr[i] < arr[smallele]) {
                smallele = i;
            }
        }
        System.out.print(largeele + "  " + smallele);

        in.close();
    }

}