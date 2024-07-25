/*9. [Write a program to print the factorial of a number by defining a method named 'Factorial'.]
(https://www.javatpoint.com/factorial-program-in-java)
Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.
<pre>
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1*/

import java.util.Scanner;
public class Factorial_Method{
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the number:");
    int num = in.nextInt();
    in.close();
    Fact(num);
    }
    static void Fact(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){    
            fact=fact*i;
            System.out.println(num  +  " = " + i + " * " + fact );
    }
}
}