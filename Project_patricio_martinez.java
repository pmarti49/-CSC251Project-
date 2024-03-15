import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

class Project_patricio_martinez
{

   public static void main(String args[])
   {
      //creating scanner object.
      Scanner input = new Scanner(System.in);
      
      //Reading PolicyInformation.txt file and saving it to an array
      ArrayList<String> policyInformation = new ArrayList<String>();
      
      try (Scanner inputFile = new Scanner(new File("PolicyInformation.txt")))
      {
         //Saving each line as a String until there are no lines anymore into the policyInformation ArrayList.
         while (inputFile.hasNextLine())
         {
            policyInformation.add(inputFile.nextLine());
         }
      }
      catch(Exception e)
      {
         System.out.println("Text File Error");
      }
      
      
      //Creating ArrayList to save new Policy objects
      
      ArrayList<Policy> policyHolders = new ArrayList<Policy>();
      
      //Variables to save to Policy constructor when creating new objects
      int number;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      
      
      //spaceDiver is the amount of lines until a space is shown in the .txt file. The space separates each Policy Holder's information. 
      final int spaceDivider = 9;
      
      //For loop will run with "infoIndex" increasing in increminents of 9, which is when a new Policy Holder's information is shown.
      //For every incremint of "spaceDivider", an object will be created and saved into the policyHolders ArrayList
      for(int infoIndex = 0; infoIndex < policyInformation.size(); infoIndex = infoIndex + spaceDivider)
      {
         try
         {
            //If the string from the ArrayList is empty, it will skip creating and saving a new Object. 
            if(!policyInformation.get(infoIndex).equalsIgnoreCase(""))
            {  
               
               number = Integer.parseInt(policyInformation.get(infoIndex));
               providerName = policyInformation.get(infoIndex + 1);
               firstName = policyInformation.get(infoIndex + 2);
               lastName = policyInformation.get(infoIndex + 3);
               age = Integer.parseInt(policyInformation.get(infoIndex + 4));
               smokingStatus = policyInformation.get(infoIndex + 5);
               height = Double.parseDouble(policyInformation.get(infoIndex + 6));
               weight = Double.parseDouble(policyInformation.get(infoIndex + 7));
               
               //Creating new Policy object and saving it to the PolicyHolders ArrayList.
               policyHolders.add(new Policy(number, providerName, firstName, lastName, age, smokingStatus, height, weight));
               
            }
            
         }
         
         catch (Exception e)
         {
            System.out.println("Text File Error");
         }
         
      }
      
      //For loop displaying for each object saved in policyHolders ArrayList.
      for(int i = 0; i < policyHolders.size(); i++)
      {
         //Calculating BMI and Price
         double bmi = policyHolders.get(i).calculateBMI();
         double price = policyHolders.get(i).calculatePrice();
         
         //Rounding BMI and Price
         bmi = Math.round(bmi * 100) / 100.0;
         price = Math.round(price * 100) / 100.0;
         
         //Output
         System.out.println("Policy Number: " + policyHolders.get(i).getNumber());
         System.out.println("Provider Name: " + policyHolders.get(i).getProvider());
         System.out.println("Policyholder's First Name: "+ policyHolders.get(i).getFirstName());
         System.out.println("Policyholder's Last Name: " + policyHolders.get(i).getLastName());
         System.out.println("Policyholder's Age: "+ policyHolders.get(i).getAge());
         System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policyHolders.get(i).getStatus());
         System.out.println("Policyholder's Height: "+ policyHolders.get(i).getHeight());
         System.out.println("Policyholder's Weight: " + policyHolders.get(i).getWeight());
         System.out.println("Policyholder's BMI: "+ bmi);
         System.out.println("Policy Price: $" + price);
         System.out.println("");
      }
      
      
     
   }


}