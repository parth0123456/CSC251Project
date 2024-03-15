import java.util.*;
import java.io.*;

public class Project_parth_patel
{ // Open the Class Container  
   public static void main(String[] args) throws IOException
   { // Open the Main Method
   
      try
      {
         /*Create an instance of the File class. Pass the string "PolicyInformation.txt" to the constructor. 
         This process creates a File object that represents the file PolicyInformation.txt.*/
         File file = new File("PolicyInformation.txt");
         
         /* Pass a reference to the File object as an argument to the Scanner class constructor (i.e., file) */
         Scanner inputFile = new Scanner(file);
         
         // Declare the Variables
         int policyNum = 0, holderAge = 0, totalSmokers = 0, totalNonSmokers = 0;
         String providerName = "", firstName = "", lastName = "", smokingStatus = "", fileInput = "";
         double holderHeight = 0.0, holderWeight = 0.0; 
         
         // Create an Array List to store objects. The ArrayList will hold Policy Objects.
         ArrayList<Policy> policies = new ArrayList<Policy>();
         
         /* Use a while loop to read the file. Use the hasNext() method to determine whether 
            the file has more data to be read. Use an "if statement" to determine the end of the file and 
            to consume newline characters */
         while (inputFile.hasNext())
         { // Open Loop
         
            fileInput = inputFile.nextLine(); // Read the next line of the file as a String
            policyNum = Integer.parseInt(fileInput); // Convert the input into a Integer and assign to the policyNum variable
            
            providerName = inputFile.nextLine(); // Read the next line of the file as a String and assign the input to the providerName variable
            
            firstName = inputFile.nextLine(); // Read the next line of the file as a String and assign the input to the firstName variable
            
            lastName = inputFile.nextLine(); // Read the next line of the file as a String and assign the input to the lastName variable
            
            fileInput = inputFile.nextLine(); // Read the next line of the file as a String
            holderAge = Integer.parseInt(fileInput); // Convert the input into a Integer and assign to the holderAge variable
            
            smokingStatus = inputFile.nextLine(); // Read the next line of the file as a String and assign the input to the smokingStatus variable
            
            fileInput = inputFile.nextLine(); // Read the next line of the file as a String
            holderHeight = Double.parseDouble(fileInput); // Convert the input into a Double and assign to the holderHeight variable
            
            fileInput = inputFile.nextLine(); // Read the next line of the file as a String
            holderWeight = Double.parseDouble(fileInput); // Convert the input into a Double and assign to the holderWeight variable
            
            // Skip the blank line if we have not reached the end of the file
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
            }

            /* Create Policy objects using the Policy class type - we are still under the while loop. 
               Objects will be created as long as there are records in the file to read.*/
            Policy p = new Policy(providerName, firstName, lastName, smokingStatus, 
                                       policyNum, holderAge, holderHeight, holderWeight);
            
            /* Add Policy objects to the ArrayList (Note: policies is the reference variable for the ArrayList 
               and p is the reference variable for the Policy objects)*/                           
            policies.add(p);
            
            // Adding the total count of policy holders who are smokers and non-smokers
            if (smokingStatus.equalsIgnoreCase("smoker"))
            {
               ++totalSmokers;
            }
            else if (smokingStatus.equalsIgnoreCase("non-smoker"))
            {
               ++totalNonSmokers;
            }
                                       
         } // Close While Loop
         
         // Close the file
         inputFile.close();
         
         // Use a for loop to display the output
         for (int i = 0; i < policies.size(); ++i)
         {
            // Displaying the policy information for the user
            System.out.println("\nPolicy Number: " + policies.get(i).getPolNumber()); // Instance Method - returns the policy number
            System.out.println("Provider Name: " + policies.get(i).getProvName()); // Instance Method - returns the provider name
            System.out.println("Policyholder's First Name: " + policies.get(i).getFirstName()); // Instance Method - returns the first name
            System.out.println("Policyholder's Last Name: " + policies.get(i).getLastName()); // Instance Method - returns the last name
            System.out.println("Policyholder's Age: " + policies.get(i).getHolderAge()); // Instance Method - returns the policy holders age
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policies.get(i).getSmokingStatus()); // Instance Method - returns the policy holders smoking status
            System.out.println("Policyholder's Height: " + policies.get(i).getHolderHeight() + " inches"); // Instance Method - returns the policy holders height
            System.out.println("Policyholder's Weight: " + policies.get(i).getHolderWeight() + " pounds"); // Instance Method - returns the policy holders weight
            System.out.printf("Policyholder's BMI: %,.2f", policies.get(i).getHolderBMI()); // Method that returns BMI for each policy holder
            System.out.printf("\nPolicy Price: $%,.2f", policies.get(i).getPolicyPrice()); // Method that returns the price for each policy 
            System.out.println();
         }
         
         System.out.println("\nThe number of policies with a smoker is: " + totalSmokers); // Print the total amount of smokers
         System.out.println("\nThe number of policies with a non-smoker is: " + totalNonSmokers); // Print the total amount of non-smokers
      } // Close the "try" block of code
      
      catch (IOException ex) //If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         // Use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file." + ex.getMessage());
      }
      
   } // Close Main Method
   
} // Close the Class Container