public class Policy
{
   private String providerName, policyHolderFirstName, policyHolderLastName, policyHolderSmokingStatus;
   private int policyNumber, policyHolderAge;
   private double policyHolderHeight, policyHolderWeight;
   
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
   
   public void setProvName(String provName) 
   {
      providerName = provName;  
   }
   
   public void setFirstName(String firstName) 
   {
      policyHolderFirstName = firstName;  
   }
   
   public void setLastName(String lastName) 
   {
      policyHolderLastName = lastName;  
   }
   
   public void setSmokingStatus(String smokingStatus) 
   {
      policyHolderSmokingStatus = smokingStatus;  
   }
   
   public void setPolNumber(int polNumber) 
   {
      policyNumber = polNumber;  
   }
   
   public void setHolderAge(int holderAge) 
   {
      policyHolderAge = holderAge;  
   }
   
   public void setHolderHeight(double holderHeight) 
   {
      policyHolderHeight = holderHeight;  
   }
   
   public void setHolderWeight(double holderWeight) 
   {
      policyHolderWeight = holderWeight;  
   }
   
   public String getProvName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return policyHolderFirstName;
   }
   
   public String getLastName()
   {
      return policyHolderLastName;
   }
   
   public String getSmokingStatus()
   {
      return policyHolderSmokingStatus;
   }
   
   public int getPolNumber()
   {
      return policyNumber;
   }
   
   public int getHolderAge()
   {
      return policyHolderAge;
   }
   
   public double getHolderHeight()
   {
      return policyHolderHeight;
   }
   
   public double getHolderWeight()
   {
      return policyHolderWeight;
   }
   
   public double getHolderBMI()
   {
      double holderBMI;
      return holderBMI = (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
   }
   
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