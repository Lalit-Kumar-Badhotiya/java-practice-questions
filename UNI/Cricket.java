//You're developing a simple scoring system for a cricket match. The match involves 
//a single over (6 balls) and you're required to record the runs scored on each ball. The system 
//should also calculate the total runs scored in the over and determine if the over included any 
//dot balls (a ball where no runs are scored). 
//Task: 
//Create a 1-dimensional array to store the runs scored on each of the 6 balls in the over. 
//Calculate the total runs scored in the over. 
//Count the number of dot balls (balls where zero runs were scored). 
//Determine the highest run scored on a single ball. 
//Runs scored in the over (ball by ball): 
//Ball 1: 1 run 
//Ball 2: 4 runs 
//Ball 3: 0 runs (dot ball) 
//Ball 4: 6 runs 
//Ball 5: 2 runs 
//Ball 6: 0 runs (dot ball)

import java.util.Scanner;

public class Cricket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dot_ball = 0;
        int total = 0;
        int high = 0;
        int[] arr = new int[6];
        for (int i = 0; i <= 5; i++) {
            System.out.print("Enter score in " + (1 + i) + " ball: ");
            arr[i] = in.nextInt();
        }
        for (int i = 0; i <= 5; i++) {
            total = total + arr[i];
            if (arr[i] == 0) {
                dot_ball++;
            }
            if (arr[i] > arr[high]) {
                high = i;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("Total Score: " + total);
        System.out.println("Total Dot balls: " + dot_ball);
        System.out.println("Highest score in a ball: " + arr[high]);

    }
}
