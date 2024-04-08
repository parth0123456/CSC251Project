/**
   The PolicyHolder class represents a person that is associated with an insurance policy
*/
public class PolicyHolder
{
   private String policyHolderFirstName, policyHolderLastName, policyHolderSmokingStatus;
   private int policyHolderAge;
   private double policyHolderHeight, policyHolderWeight;
   
   /**
      No-arg constructor
   */
   public PolicyHolder()
   {
      policyHolderFirstName = "";
      policyHolderLastName = "";
      policyHolderSmokingStatus = "";
      policyHolderAge = 0;
      policyHolderHeight = 0.0;
      policyHolderWeight = 0.0;
   }
   
   /**
      Constructor
      @param policyHolderFirstName The policy holder's first name
      @param policyHolderLastName The policy holder's last name
   */
   public PolicyHolder(String policyHolderFirstName, String policyHolderLastName, int policyHolderAge, 
                       String policyHolderSmokingStatus, double policyHolderHeight, double policyHolderWeight)
   {
      this.policyHolderFirstName = policyHolderFirstName;
      this.policyHolderLastName = policyHolderLastName;
      this.policyHolderSmokingStatus = policyHolderSmokingStatus;
      this.policyHolderAge = policyHolderAge;
      this.policyHolderHeight = policyHolderHeight;
      this.policyHolderWeight = policyHolderWeight;
   }
   
   /**
      Copy Constructor
      @param obj A PolicyHolder object to make a copy of
   */
   public PolicyHolder(PolicyHolder obj)
   {
      this.policyHolderFirstName = obj.policyHolderFirstName;
      this.policyHolderLastName = obj.policyHolderLastName;
      this.policyHolderSmokingStatus = obj.policyHolderSmokingStatus;
      this.policyHolderAge = obj.policyHolderAge;
      this.policyHolderHeight = obj.policyHolderHeight;
      this.policyHolderWeight = obj.policyHolderWeight;
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
   
   /**
      The setSmokingStatus method sets the smoking status of the policy holder.
      @param smokingStatus Smoking status of the policy holder
   */
   public void setPolicyHolderSmokingStatus(String policyHolderSmokingStatus) 
   {
      this.policyHolderSmokingStatus = policyHolderSmokingStatus;  
   }
   
   /**
      The setHolderAge method sets the age of the policy holder.
      @param holderAge Age of the policy holder
   */
   public void setPolicyHolderAge(int policyHolderAge) 
   {
      this.policyHolderAge = policyHolderAge;  
   }
   
   /**
      The setHolderHeight method sets the height of the policy holder.
      @param holderHeight Height of the policy holder
   */
   public void setPolicyHolderHeight(double policyHolderHeight) 
   {
      this.policyHolderHeight = policyHolderHeight;  
   }
   
   /**
      The setHolderWeight method sets the weight of the policy holder.
      @param holderWeight Weight of the policy holder
   */
   public void setPolicyHolderWeight(double policyHolderWeight) 
   {
      this.policyHolderWeight = policyHolderWeight;  
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
      getSmokingStatus method
      @return Smoking status of the policy holder.
   */
   public String getSmokingStatus()
   {
      return policyHolderSmokingStatus;
   }
   
   /**
      getPolicyHolderAge method
      @return Age of the policy holder.
   */
   public int getPolicyHolderAge()
   {
      return policyHolderAge;
   }
   
   /**
      getPolicyHolderHeight method
      @return Height of the policy holder.
   */
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   
   /**
      getPolicyHolderWeight method
      @return Weight of the policy holder.
   */
   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   
   /**
      getPolicyHolderBMI method
      @return BMI of the policy holder.
   */
   public double getPolicyHolderBMI()
   {
      final double CONVFACTOR = 703;
      return (policyHolderWeight * CONVFACTOR) / (policyHolderHeight * policyHolderHeight);
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
             "\nPolicyholder's Last Name: " + policyHolderLastName +
             "\nPolicyholder's Age: " + policyHolderAge +
             "\nPolicyholder's Smoking Status (Y/N): " + policyHolderSmokingStatus + 
             "\nPolicyholder's Height: " + String.format("%,.1f", policyHolderHeight) + " inches" + 
             "\nPolicyholder's Weight: " + String.format("%,.1f", policyHolderWeight) + " pounds" + 
             "\nPolicyholder's BMI: " + String.format("%,.2f", getPolicyHolderBMI()));        
   }

}

