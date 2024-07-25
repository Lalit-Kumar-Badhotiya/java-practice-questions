/*22. [Subtract the Product and Sum of Digits of an Integer]
(https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)*/
public class FIRST_leet_code {
    public static void main(String[] args) {
        
            int n = 2346;
            int sum=0;
            int P= 1;
            while(n>0)
            {
                int r=n%10;
                P=P*r;
                sum=sum+r;
                n=n/10;
            }
              System.out.println(P-sum);
        }
}
