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
            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName);
               
            Policy p = new Policy(providerName, smokingStatus, policyNum, holderAge, holderHeight, holderWeight, policyHolder);
            
            
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
            System.out.println(policies.get(i));
         }
         
         System.out.println("There were " + Policy.getNumberOfPolicies() + " Policy objects created.");
         System.out.println("\nThe number of policies with a smoker is: " + totalSmokers); // Print the total amount of smokers
         System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers); // Print the total amount of non-smokers
      } // Close the "try" block of code
      
      catch (IOException ex) //If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         // Use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file." + ex.getMessage());
      }
      
   } // Close Main Method
   
} // Close the Class Container