import java.util.*;

public class Project_parth_patel
{
   // Main method
   public static void main(String[] args)
   {
      // Scanner class is needed to allow user input
      Scanner keyboard = new Scanner(System.in);
      
      // Prompting the user to input the policy number
      System.out.print("Please enter the Policy Number: ");
      int policyNum = keyboard.nextInt();
      keyboard.nextLine();
      
      // Prompting the user to input the provider name
      System.out.print("Please enter the Provider Name: ");
      String providerName = keyboard.nextLine();
      
      // Prompting the user to input the policy holder's first name
      System.out.print("Please enter the Policyholder's First Name: ");
      String firstName = keyboard.nextLine();
      
      // Prompting the user to input the policy holder's last name
      System.out.print("Please enter the Policyholder's Last Name: ");
      String lastName = keyboard.nextLine();
      
      // Prompting the user to input the policy holder's age
      System.out.print("Please enter the Policyholder's Age: ");
      int holderAge = keyboard.nextInt();
      keyboard.nextLine();
      
      // Prompting the user to input the policy holder's smoking status
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = keyboard.nextLine();
      
      // Prompting the user to input the policy holder's height
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      double holderHeight = keyboard.nextDouble();
      
      // Prompting the user to input the policy holder's weight
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      double holderWeight = keyboard.nextDouble();
      keyboard.nextLine();
      
      // Creation of a Policy object
      Policy policyOne = new Policy(providerName, firstName, lastName, smokingStatus, policyNum, holderAge, holderHeight, holderWeight);
      
      // Displaying the policy information for the user
      System.out.println("\nPolicy Number: " + policyNum);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + holderAge);
      System.out.println("Policyholder's Smoking Status: " + smokingStatus);
      System.out.println("Policyholder's Height: " + holderHeight + " inches");
      System.out.println("Policyholder's Weight: " + holderWeight + " pounds");
      System.out.printf("Policyholder's BMI: %,.2f", policyOne.getHolderBMI());
      System.out.printf("\nPolicy Price: $%,.2f", policyOne.getPolicyPrice());
   }
}