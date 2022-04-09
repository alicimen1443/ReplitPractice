package arrays;
import java.util.*;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        for (int i = 1; i < 8; i++) {
            System.out.println("Enter score for judge "+i+":");
            score[i-1]= input.nextFloat();
        }

        float total = 0;
        float sum=0;
        System.out.println("Enter difficulty:");
        float difficulty= input.nextFloat();

        Arrays.sort(score);

        float[] newArray = new float[score.length - 2];

        for (int i = 1, j = 0; i < score.length - 1; i++, j++){
            newArray[j]=score[i];
        }

        for (float each : newArray) {

            sum+=each;
        }

        total=sum*difficulty*0.6F;


        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);


    }
}
/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.

The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then multiplied by the degree of difficulty for that dive.

The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.

Note: System.out.printf("Total: %.2f",total); is used to get rid of extra floating points. Do not make any change there.

Flow:

Accept the 7 scores from the judges
Accept the difficulty number
Display the final score
Enter score for judge 1:
1
Enter score for judge 2:
5
Enter score for judge 3:
5
Enter score for judge 4:
5
Enter score for judge 5:
5
Enter score for judge 6:
8
Enter score for judge 7:
9
Enter difficulty:
2.1
Total: 35.28
 */
