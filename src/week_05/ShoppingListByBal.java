package week_05;

import java.util.Scanner;

public class ShoppingListByBal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        int itemNumber = 1;
        String itemName;
        double price;
        String answer;
        double totalPrice = 0;
        do{
            System.out.println("Enter Item" + itemNumber + " and its price:");
            itemName = scan.next();
            price = scan.nextDouble();

            totalPrice += price;
            System.out.println("Add one more item?");
            answer = scan.next();

            if (answer.equals("no")) {
                shoppingListReport += "Item" + itemNumber + ": " + itemName + " Price: " + price;
                System.out.println(shoppingListReport + "\nTotal price: " + totalPrice);
                System.exit(0);

            }else{
                shoppingListReport += "Item" + itemNumber + ": " + itemName + " Price: " + price + ", ";
            }
            itemNumber++;
        }while(answer.equals("yes"));

        System.out.print(shoppingListReport + "\nTotal price: " + totalPrice );
    }
}

