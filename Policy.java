/**
   The Policy class holds data which represents an insurance policy.
*/
public class Policy
{
   private String providerName;
   private int policyNumber;
   private PolicyHolder policyHolder;
   
   public static int numberOfPolicies = 0;
   
   
   /**
      No-arg constructor
   */
   public Policy()
   {
      providerName = "";
      policyNumber = 0;
      this.policyHolder = new PolicyHolder();
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
   public Policy(String providerName, int policyNumber, PolicyHolder policyHolder)
   {
      this.providerName = providerName;
      this.policyNumber = policyNumber;
      this.policyHolder = new PolicyHolder(policyHolder);
      ++numberOfPolicies;
   }
   
   /**
      Copy Constructor
      @param obj A Policy object to make a copy of
   */
   public Policy(Policy obj)
   {
      this.providerName = obj.providerName;
      this.policyNumber = obj.policyNumber;
      this.policyHolder = new PolicyHolder(policyHolder);
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
      The setPolicyNumber method sets the policy number.
      @param policyNumber Policy number
   */
   public void setPolicyNumber(int policyNumber) 
   {
      this.policyNumber = policyNumber;  
   }
   
   public void setPolicyHolder(PolicyHolder policyHolder)
   {
      this.policyHolder = new PolicyHolder(policyHolder);
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
      policyNumber method
      @return Policy number.
   */
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
      getPolicyHolderName method
      @return Name of the policy holder.
   */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder);
   }
   
   /**
      getPolicyPrice method
      @return Calculation of policy price.
   */
   public double getPolicyPrice() 
   {
      final double BASE_FEE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_FEE;
      
      if (policyHolder.getPolicyHolderAge() > AGE_THRESHOLD) {
         price += ADDITIONAL_FEE_AGE;
      }
      
      if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) {
         price += ADDITIONAL_FEE_SMOKING;
      }
      
      double holderBMI = policyHolder.getPolicyHolderBMI();
      
      if (holderBMI > BMI_THRESHOLD) {
         price += (holderBMI - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI;
      }
      
      return price;
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
             "\n" + policyHolder.toString() +
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