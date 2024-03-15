import java.util.*;
import java.io.*;

public class Project_parth_patel
{
   // Main method
   public static void main(String[] args) throws IOException
   {
   
      try
      {
         // Scanner class is needed to allow user input
         File file = new File("PolicyInformation.txt");
         
         Scanner inputFile = new Scanner(file);
         
         int policyNum = 0, holderAge = 0;
         String providerName = "", firstName = "", lastName = "", smokingStatus = "", fileInput = "";
         double holderHeight = 0.0, holderWeight = 0.0; 
         
         ArrayList<Policy> policies = new ArrayList<Policy>();
         
         /*
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
         
         */
         
         while (inputFile.hasNext())
         {
            fileInput = inputFile.nextLine();
            policyNum = Integer.parseInt(fileInput);
            
            providerName = inputFile.nextLine();
            
            firstName = inputFile.nextLine();
            
            lastName = inputFile.nextLine();
            
            fileInput = inputFile.nextLine();
            holderAge = Integer.parseInt(fileInput);
            
            smokingStatus = inputFile.nextLine();
            
            fileInput = inputFile.nextLine();
            holderHeight = Double.parseDouble(fileInput);
            
            fileInput = inputFile.nextLine();
            holderWeight = Double.parseDouble(fileInput);
            
            // Skip the blank line if we have not reached the end of the file
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
            }

         // Creation of a Policy object
            Policy p = new Policy(providerName, firstName, lastName, smokingStatus, 
                                       policyNum, holderAge, holderHeight, holderWeight);
            policies.add(p);
                                       
         } // Close While Loop
         
         // Close the file
         inputFile.close();
         
         for (int i = 0; i < policies.size(); ++i)
         {
            // Displaying the policy information for the user
            System.out.println("\nPolicy Number: " + policies.get(i).getPolNumber());
            System.out.println("Provider Name: " + policies.get(i).getProvName());
            System.out.println("Policyholder's First Name: " + policies.get(i).getFirstName());
            System.out.println("Policyholder's Last Name: " + policies.get(i).getLastName());
            System.out.println("Policyholder's Age: " + policies.get(i).getHolderAge());
            System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
            System.out.println("Policyholder's Height: " + policies.get(i).getHolderHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policies.get(i).getHolderWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %,.2f", policies.get(i).getHolderBMI());
            System.out.printf("\nPolicy Price: $%,.2f", policies.get(i).getPolicyPrice());
            System.out.println();
         }
      }
      catch (IOException ex)
      {
         System.out.println("Something went wrong reading the file.");
      }
      
   } // Close Main Method
   
} // Close the Class Container