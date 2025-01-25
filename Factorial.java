//1. Factorial Program In Java
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i,fact=1;  
    int number= in.nextInt();  
    in.close(); 
    for(i=1;i<=number;i++){    
      fact=fact*i;    
    }    
    System.out.println("Factorial of "+number+" is: "+fact);    
   
  
    }


}
