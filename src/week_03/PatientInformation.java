package week_03;


import java.util.Scanner;

public class PatientInformation {

    public static void main(String[] args) {
        int age,zipcode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber, personalPhoneNumber;

        String firstName,
                lastName,
                eMail,
                street,
                state,
                city;

        Scanner scan= new Scanner(System.in);

        System.out.println("Welcome to the patient portal!"+"\nPlease enter your personal information"
                +"\nEnter your first name");
        firstName=scan.next();
        System.out.println("Enter your last name");
        lastName=scan.next();
        System.out.println("Enter your email");
        eMail= scan.next();
        scan.nextLine();     //to capture Enter key press
        System.out.println("Enter your street");
        street= scan.nextLine();
        System.out.println("Enter your city");
        city= scan.next();
        System.out.println("Enter your state");
        state= scan.next();
        System.out.println("Enter your zip code");
        zipcode=scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber= scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber= scan.nextLong();
        System.out.println("Enter your age");
        age= scan.nextInt();
        System.out.println("Enter your height");
        height= scan.nextDouble();
        System.out.println("Enter your weight");
        weight= scan.nextDouble();
        System.out.println("Are you married?");
        isMarried= scan.nextBoolean();

        String contacts ="Contacts: work phone number - " +workPhoneNumber+", personal phone number - "+
                personalPhoneNumber+", email: "+eMail;
        String fullName = lastName+", "+firstName;
        String address= street+", "+city+", "+state+" "+zipcode;

        System.out.println("Patient personal information"+"\nFull name: "+fullName+"\nAddress: "+address+
                "\n"+contacts+"\nAge: "+age+"\nHeight: "+height+"\nWeight: "+weight+" pounds"
                +"\nMarried?: "+ isMarried);

    }
}






