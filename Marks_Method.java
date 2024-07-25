/*8. [Write a program that will ask the user to enter his/her marks (out of 100). 
Define a method that will display grades according to the marks entered as below:]
(https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html)
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail */
import java.util.Scanner;
public class Marks_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks:");
        float marks = in.nextFloat();
        in.close();
        Marks(marks);
    }
    static void Marks(float marks){
        if (marks>100){
            System.out.println("Please enter valid marks");
        }
        else if (marks>=91){
            System.out.println("Your grade is AA");
        }
        else if (marks>=81){
            System.out.println("Your grade is AB");
        }
        else if (marks>=71){
            System.out.println("Your grade is BB");
        }
        else if (marks>=61){
            System.out.println("Your grade is BC");
        }
        else if (marks>=51){
            System.out.println("Your grade is CD");
        }
        else if (marks>=41){
            System.out.println("Your grade is DD");
        }
        else {
            System.out.println("FAIL!!!!!!!!!!!!!!!!!");
        }
    }
    
}
