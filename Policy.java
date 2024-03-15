/**
   The Policy class holds data which represents an insurance policy.
*/
public class Policy
{
   private String providerName, policyHolderFirstName, policyHolderLastName, policyHolderSmokingStatus;
   private int policyNumber, policyHolderAge;
   private double policyHolderHeight, policyHolderWeight;
   
   /**
      No-arg constructor
   */
   public Policy()
   {
      providerName = "";
      policyHolderFirstName = "";
      policyHolderLastName = "";
      policyHolderSmokingStatus = "";
      policyNumber = 0;
      policyHolderAge = 0;
      policyHolderHeight = 0.0;
      policyHolderWeight = 0.0;
   }
   
   /**
      Constructor
      @param provName The provider name
      @param firstName The policy holder's first name
      @param lastName The policy holder's last name
      @param smokingStatus The policy holder's smoking status
      @param polNumber The policy number
      @param holderAge The policy holder's age
      @param holderHeight The policy holder's height
      @param holderWeight The policy holder's weight
   */
   public Policy(String provName, String firstName, String lastName, String smokingStatus, int polNumber, int holderAge, double holderHeight, double holderWeight)
   {
      providerName = provName;
      policyHolderFirstName = firstName;
      policyHolderLastName = lastName;
      policyHolderSmokingStatus = smokingStatus;
      policyNumber = polNumber;
      policyHolderAge = holderAge;
      policyHolderHeight = holderHeight;
      policyHolderWeight = holderWeight;
   }
   
   /**
      The setProvname method sets the provider name.
      @param provName Name of the provider
   */
   public void setProvName(String provName) 
   {
      providerName = provName;  
   }
   
   /**
      The setFirstName method sets the first name of the policy holder.
      @param firstName First Name of the policy holder
   */
   public void setFirstName(String firstName) 
   {
      policyHolderFirstName = firstName;  
   }
   
   /**
      The setLastName method sets the last name of the policy holder.
      @param lastName Last Name of the policy holder
   */
   public void setLastName(String lastName) 
   {
      policyHolderLastName = lastName;  
   }
   
   /**
      The setSmokingStatus method sets the smoking status of the policy holder.
      @param smokingStatus Smoking status of the policy holder
   */
   public void setSmokingStatus(String smokingStatus) 
   {
      policyHolderSmokingStatus = smokingStatus;  
   }
   
   /**
      The setPolNumber method sets the policy number.
      @param polNumber Policy number
   */
   public void setPolNumber(int polNumber) 
   {
      policyNumber = polNumber;  
   }
   
   /**
      The setHolderAge method sets the age of the policy holder.
      @param holderAge Age of the policy holder
   */
   public void setHolderAge(int holderAge) 
   {
      policyHolderAge = holderAge;  
   }
   
   /**
      The setHolderHeight method sets the height of the policy holder.
      @param holderHeight Height of the policy holder
   */
   public void setHolderHeight(double holderHeight) 
   {
      policyHolderHeight = holderHeight;  
   }
   
   /**
      The setHolderWeight method sets the weight of the policy holder.
      @param holderWeight Weight of the policy holder
   */
   public void setHolderWeight(double holderWeight) 
   {
      policyHolderWeight = holderWeight;  
   }
   
   /**
      getProvName method
      @return Name of the provider.
   */
   public String getProvName()
   {
      return providerName;
   }
   
   /**
      getFirstName method
      @return First name of the policy holder.
   */
   public String getFirstName()
   {
      return policyHolderFirstName;
   }
   
   /**
      getLastName method
      @return Last name of the policy holder.
   */
   public String getLastName()
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
      getPolNumber method
      @return Policy number.
   */
   public int getPolNumber()
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
}