package week_04;

import java.util.Scanner;

public class LaptopConfigurator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double laptopPrice = 0;

        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();

        laptopPrice += (screenSize == 13.3) ? 200 : (screenSize == 15.0) ? 300 : (screenSize == 17.3) ? 400 : 0;

        System.out.println("Select CPU type:");
        String CPUType = scan.next();

        laptopPrice += (CPUType.equals("i3")) ? 150 : (CPUType.equals("i5")) ? 250 : (CPUType.equals("i7")) ? 350 : 0;

        System.out.println("Select RAM size:");
        int RAMSize = scan.nextInt();

        laptopPrice += RAMSize / 4 * 50;

        System.out.println("Select storage type:");
        String storageType = scan.next();
        System.out.println("Enter memory size:");
        int memorySize = scan.nextInt();

        laptopPrice += (storageType.equals("HDD")) ? memorySize / 500 * 50
                : (storageType.equals("SSD")) ? memorySize / 500 * 100 : 0;

        System.out.println("Enter screen resolution:");
        String resolution = scan.next();

        laptopPrice += (resolution.equals("FULLHD"))? 100 :(resolution.equals("4K"))? 200 : 0;

        System.out.println("Laptop price is: $" + laptopPrice);

        scan.close();


    }
}

/*
Write a program that will calculate laptop price based on the components.

First ask user for a screen size.

If screen size is equals to 13.3, add $200 to the laptop price.
If screen size is equals to 15.0 - add $300 to the laptop price.
If screen size is equals to 17.3 - add $400 to the laptop price.
Then ask user for CPU type.

If CPU type equals to i3, add $150 to the laptop price.
If CPU type equals to i5, add $250 to the laptop price.
If CPU type equals to i7, add $350 to the laptop price.
Then ask user for RAM size.

Add $50 for every 4GB of ram to the laptop price.
Then, ask user for storage type. There are 2 options: SSD and HDD.

If it's HDD - add $50 to the laptop price for every 500gb.
If it's SSD - add $100 to the laptop price for every 500GB.
Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.

Add $100 if it's FULLHD screen
Add $200 if it's 4K screen.
Example:

Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter memory size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0
Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter memory size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0
Example #2

Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i3
Display message: Select RAM size:
input: 4
Display message: Select storage type:
input: HDD
Display message: Enter memory size:
input: 500
Display message: Enter screen resolution:
input: FULLHD
Display message: Laptop price is: $550.0
 */
