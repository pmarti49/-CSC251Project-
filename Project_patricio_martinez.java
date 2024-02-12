import java.util.Scanner;
class Project_patricio_martinez
{

   public static void main(String args[])
   {
      //creating scanner object.
      Scanner input = new Scanner(System.in);
      
      //beginning of code
      System.out.print("Please enter the Policy Number: ");
      int number = input.nextInt();
      input.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      String provider = input.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      String firstName = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      String lastName = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      int age = input.nextInt();
      input.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status: ");
      String status = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Height: ");
      double height = input.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight: ");
      double weight = input.nextDouble();
      System.out.println("");
      System.out.println("---------------------------------------------------");
      System.out.println("");
      
      //creating person1 for the Policy class and assigning each variable accordingly.
      Policy person1 = new Policy(number, provider, firstName, lastName, age, status, height, weight);
      
      //calling both calculateBMI and calculatePrice method for person 1.
      double bmi = person1.calculateBMI();
      double price = person1.calculatePrice();
      
      //rounding BMI and Price
      bmi = Math.round(bmi * 100) / 100.0;
      price = Math.round(price * 100) / 100.0;
      
      //output
      System.out.println("Policy Number: " + person1.getNumber());
      System.out.println("Provider Name: " + person1.getProvider());
      System.out.println("Policyholder's First Name: "+ person1.getFirstName());
      System.out.println("Policyholder's Last Name: " + person1.getLastName());
      System.out.println("Policyholder's Age: "+ person1.getAge());
      System.out.println("Policyholder's Smoking Status " + person1.getStatus());
      System.out.println("Policyholder's Height: "+ person1.getHeight());
      System.out.println("Policyholder's Weight: " + person1.getWeight());
      System.out.println("Policyholder's BMI: "+ bmi);
      System.out.println("Policy Price: $" + price);
   }


}