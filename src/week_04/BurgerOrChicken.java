package week_04;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();

        if(in.equals("burger")||in.equals("chicken")){
            switch(in){
                case "burger":
                    System.out.println("burger\n10.0");break;
                case "chicken":
                    System.out.println("chicken\n10.0");
            }
        }
        if(in.equals("soda")){
            System.out.println("soda\2.0");
        }
        if(in.equals("fries")){
            System.out.println("fries\n3.5");
        }




    }
}
/*
A fast food company has two main order types, burger meal and chicken meal.

Both have the same prices, so if a cashier enters "burger" or "chicken " he will get the same price of 10.0.

If the order is burger price is 10.0
If the order is chicken price is 10.0
If the order is soda price is 2.0
If the order is fries price is 3.5
hint: or operator in java is ||

Examples:

burger
​
10.0
burger

10.0
chicken
​
10.0
chicken

10.0
soda
​
2.0
 */
