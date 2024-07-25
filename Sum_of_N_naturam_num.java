//14. [Write a function that returns the sum of first n natural numbers.]
//(https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/)

import java.util.Scanner;
public class Sum_of_N_naturam_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = in.nextInt();
        in.close();
        System.out.println(Sum(num));
    }
    static int Sum (int num){
        int sum=0;
        for(int i = 1 ; i <= num ; i++){
            sum=sum+i;
        }
        return sum;
    }
}
