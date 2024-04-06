/**
   The PolicyHolder class represents a person that is associated with an insurance policy
*/
public class PolicyHolder
{
   private String policyHolderFirstName, policyHolderLastName;
   
   /**
      No-arg constructor
   */
   public PolicyHolder()
   {
      policyHolderFirstName = "";
      policyHolderLastName = "";
   }
   
   /**
      Constructor
      @param policyHolderFirstName The policy holder's first name
      @param policyHolderLastName The policy holder's last name
   */
   public PolicyHolder(String policyHolderFirstName, String policyHolderLastName)
   {
      this.policyHolderFirstName = policyHolderFirstName;
      this.policyHolderLastName = policyHolderLastName;
   }
   
   /**
      Copy Constructor
      @param obj A PolicyHolder object to make a copy of
   */
   public PolicyHolder(PolicyHolder obj)
   {
      policyHolderFirstName = obj.policyHolderFirstName;
      policyHolderLastName = obj.policyHolderLastName;
   }
   
   // Setters
   
   /**
      @param policyHolderFirstName The policy holder's first name
   */
   public void setPolicyHolderFirstName(String policyHolderFirstName)
   {
      this.policyHolderFirstName = policyHolderFirstName;
   }
   
   /**
      @param policyHolderLastName The policy holder's last name
   */
   public void setPolicyHolderLastName(String policyHolderLastName)
   {
      this.policyHolderLastName = policyHolderLastName;
   }
        
   // Getters
   
   /**
      @return The policy holder's first name
   */
   public String getPolicyHolderName()
   {
      return policyHolderFirstName;
   }
   
   /**
      @return The policy holder's last name
   */
   public String getPolicyHolderLastName()
   {
      return policyHolderLastName;
   }
   
   /**
      toString method
      @return - A string containing the course information
   */
  
   /** We make use of the String.format method to format the tuition cost and total cost. See Chapter 3 for information about this method.*/
   public String toString()
   {
      return String.format(
             "Policyholder's First Name: " + policyHolderFirstName +
             "\nPolicyholder's Last Name: " + policyHolderLastName);         
   }

}

