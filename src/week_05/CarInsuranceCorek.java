package week_05;

import java.util.Scanner;

public class CarInsuranceCorek {
    public static void main(String[] args) {

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your name");
        name = scan.next();

        System.out.println("Do you have a US driver license?");
        String driverLicense = scan.next();
        if (!driverLicense.equals("Yes")){
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        switch (zipCode){
            case 20910: case 20740: premium +=60; break;
            case 22102: case 22103: premium +=30; break;
            default: premium +=50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();

        switch (vehicleOwnership) {
            case "Owned" : premium += 10; break;
            default: premium += 20;
        }

        System.out.println("How is this vehicle primarily used?");

        vehicleUsage = scan.next();

        switch (vehicleUsage){
            case "Business" : premium += 50; break;
            case "Pleasure" : premium += 10; break;
            case "Commute" : premium += 20;
                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool = scan.nextInt();
                premium += daysDrivenToWorkOrSchool*5;

                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool = scan.nextInt();
                premium += milesToWorkOrSchool;
        }

        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age < 16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else if (age < 18){
            premium *= 20;
        }else if (age <= 21){
            premium *= 6;
        }else if (age < 25){
            premium *= 2;
        }

        System.out.println("How many years you've been driving?");
        int exp = scan.nextInt();
        if (exp <= 0 || age - exp < 16){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        premium -= exp*5;

        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scan.next();
        if (accident.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            int amountAccident = scan.nextInt();
            premium += (premium*0.2)*amountAccident;
        }

        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();

        if (continuousInsurance.equalsIgnoreCase("No")){
            premium *= 2;
        }

        System.out.println("What is the highest level of education you have completed?");
        scan.nextLine();
        education = scan.nextLine();
        switch (education){
            case "PhD": case "Bachelors" : case "Masters" : premium -= premium*0.05; break;
            case "Doctors" : premium -= premium*0.1; break;
            case "Less than High School" : premium += premium*0.05; break;
        }

        referenceNumber = (name.substring(0,2) + age + name.substring(name.length()-2) + zipCode + education.replace(" ", "")).toUpperCase();

        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        System.out.println("Reference number: " + referenceNumber);


    }
}

