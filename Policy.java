/**
   The Policy class holds data which represents an insurance policy.
*/
public class Policy
{
   private String providerName, policyHolderSmokingStatus;
   private int policyNumber, policyHolderAge;
   private double policyHolderHeight, policyHolderWeight;
   private PolicyHolder policyHolderName;
   private static int numberOfPolicies = 0;
   
   /**
      No-arg constructor
   */
   public Policy()
   {
      providerName = "";
      policyHolderSmokingStatus = "";
      policyNumber = 0;
      policyHolderAge = 0;
      policyHolderHeight = 0.0;
      policyHolderWeight = 0.0;
      this.policyHolderName = new PolicyHolder();
      ++numberOfPolicies;
   }
   
   /**
      Constructor
      @param providerName The provider name
      @param policyHolderSmokingStatus The policy holder's smoking status
      @param policyNumber The policy number
      @param policyHolderAge The policy holder's age
      @param policyHolderHeight The policy holder's height
      @param policyHolderWeight The policy holder's weight
      @param policyHolderName The policy holder's name
   */
   public Policy(String providerName, String policyHolderSmokingStatus, int policyNumber,
                 int policyHolderAge, double policyHolderHeight, double policyHolderWeight,
                 PolicyHolder policyHolderName)
   {
      this.providerName = providerName;
      this.policyHolderSmokingStatus = policyHolderSmokingStatus;
      this.policyNumber = policyNumber;
      this.policyHolderAge = policyHolderAge;
      this.policyHolderHeight = policyHolderHeight;
      this.policyHolderWeight = policyHolderWeight;
      this.policyHolderName = new PolicyHolder(policyHolderName);
      ++numberOfPolicies;
   }
   
   /**
      Copy Constructor
      @param obj A Policy object to make a copy of
   */
   public Policy(Policy obj)
   {
      providerName = obj.providerName;
      policyHolderSmokingStatus = obj.policyHolderSmokingStatus;
      policyNumber = obj.policyNumber;
      policyHolderAge = obj.policyHolderAge;
      policyHolderHeight = obj.policyHolderHeight;
      policyHolderWeight = obj.policyHolderWeight;
      ++numberOfPolicies;
   }
   
   // Setters
   
   /**
      The setProviderName method sets the provider name.
      @param providerName Name of the provider
   */
   public void setProviderName(String providerName) 
   {
      this.providerName = providerName;
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
      The setPolicyNumber method sets the policy number.
      @param policyNumber Policy number
   */
   public void setPolicyNumber(int policyNumber) 
   {
      this.policyNumber = policyNumber;  
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
   
   public void setPolicyHolderName(PolicyHolder policyHolderName)
   {
      this.policyHolderName = new PolicyHolder(policyHolderName);
   }
   
   // Getters
     
   /**
      setProviderName method
      @return Name of the provider.
   */
   public String getProviderName()
   {
      return providerName;
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
      policyNumber method
      @return Policy number.
   */
   public int getPolicyNumber()
   {
      return policyNumber;
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
      getPolicyHolderName method
      @return Name of the policy holder.
   */
   public PolicyHolder getPolicyHolderName()
   {
      return new PolicyHolder(policyHolderName);
   }
   
   /**
      getPolicyHolderBMI method
      @return BMI of the policy holder.
   */
   public double getPolicyHolderBMI()
   {
      double holderBMI;
      return holderBMI = (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
   }
   
   /**
      getPolicyPrice method
      @return Calculation of policy price.
   */
   public double getPolicyPrice()
   {
      double baseFee = 600;
      
      if (policyHolderAge > 50)
      {
         baseFee += 75;
      }
      
      if (policyHolderSmokingStatus.equalsIgnoreCase("smoker"))
      {
         baseFee += 100;
      }
      
      double holderBMI = getPolicyHolderBMI();
      
      if (holderBMI > 35)
      {
         baseFee += (holderBMI - 35) * 20;
      }
      
      return baseFee;
   }  
   /**
      toString method
      @return - A string containing the course information
   */
  
   /** We make use of the String.format method to format the tuition cost and total cost. See Chapter 3 for information about this method.*/

   public String toString()
   {
      return 
             "Policy Number: " + policyNumber + 
             "\nProvider Name: " + providerName +
             "\n" + policyHolderName.toString() +
             "\nPolicyholder's Age: " + policyHolderAge +
             "\nPolicyholder's Smoking Status (Y/N): " + policyHolderSmokingStatus + 
             "\nPolicyholder's Height: " + String.format("%,.1f", policyHolderHeight) + " inches" + 
             "\nPolicyholder's Weight: " + String.format("%,.1f", policyHolderWeight) + " pounds" + 
             "\nPolicyholder's BMI: " + String.format("%,.2f", getPolicyHolderBMI()) + 
             "\nPolicy Price: $" + String.format("%,.2f", getPolicyPrice()) + 
             "\n";        
   }
   
   /**
      getNumberOfPolicies Static Method 
      @return numberOfPolicies The total number of policy objects created
   */
   public static int getNumberOfPolicies()
   {
      return numberOfPolicies;
   }
   
   
}