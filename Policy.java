/**
   The Policy class holds data which represents an insurance policy.
*/
public class Policy
{
   private String providerName, policyHolderSmokingStatus;
   private int policyNumber, policyHolderAge;
   private double policyHolderHeight, policyHolderWeight;
   
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
   }
   
   /**
      Constructor
      @param provName The provider name
      @param smokingStatus The policy holder's smoking status
      @param polNumber The policy number
      @param holderAge The policy holder's age
      @param holderHeight The policy holder's height
      @param holderWeight The policy holder's weight
   */
   public Policy(String providerName, String policyHolderSmokingStatus, int policyNumber,
                 int policyHolderAge, double policyHolderHeight, double policyHolderWeight)
   {
      this.providerName = providerName;
      this.policyHolderSmokingStatus = policyHolderSmokingStatus;
      this.policyNumber = policyNumber;
      this.policyHolderAge = policyHolderAge;
      this.policyHolderHeight = policyHolderHeight;
      this.policyHolderWeight = policyHolderWeight;
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
      getHolderAge method
      @return Age of the policy holder.
   */
   public int getHolderAge()
   {
      return policyHolderAge;
   }
   
   /**
      getHolderHeight method
      @return Height of the policy holder.
   */
   public double getHolderHeight()
   {
      return policyHolderHeight;
   }
   
   /**
      getHolderWeight method
      @return Weight of the policy holder.
   */
   public double getHolderWeight()
   {
      return policyHolderWeight;
   }
   
   /**
      getHolderBMI method
      @return BMI of the policy holder.
   */
   public double getHolderBMI()
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
      
      double holderBMI = getHolderBMI();
      
      if (holderBMI > 35)
      {
         baseFee += (holderBMI - 35) * 20;
      }
      
      return baseFee;
   }  
   
   public String toString()
   {
      return "Provider Name: " + providerName + 
             "\nPolicy Holder Smoking Status: " + policyHolderSmokingStatus + 
             "\nPolicy Number: " + policyNumber +
             "\nPolicy Holder Age: " + policyHolderAge + 
             "\nPolicy Holder Height: " + policyHolderHeight +
             "\nPolicy Holder Weight: " + policyHolderWeight +
             "\nPolicy Holder BMI: " + getHolderBMI() +
             "\nPolicy Price: " + getPolicyPrice();
   }
}