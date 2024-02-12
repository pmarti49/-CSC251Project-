public class Policy
{

   //creating private variables for the Policy class
   private int number;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   //default no-arg Constructor
   public Policy()
   {
      number = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;

   }
   
   //Constructor that accepts all arguments
   public Policy(int theNum, String pName, String fName, String lName, int theAge, String theStatus, double theHeight, double theWeight)
   {
      number = theNum;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      age = theAge;
      smokingStatus = theStatus;
      height = theHeight;
      weight = theWeight;
   
   }
   
   //creating GETTER Methods for each variable
   public int getNumber (){
      return number;
   }
   
   public String getProvider(){
      return providerName;
   }
   
   public String getFirstName(){
      return firstName;
   }
   
   public String getLastName(){
      return lastName;
   }
   
   public int getAge(){
      return age;
   }
   
   public String getStatus(){
      return smokingStatus;
   }
   
   public double getHeight(){
      return height;
   }
   
   public double getWeight(){
      return weight;
   }
   
   //creating SETTER Methods for each variable
   public void setNumber(int x){ //"x" is only visible inside this method and makes typing everything easier and faster.
   }
   
   public void setProvider(String x){
       providerName = x;
   }
   
   public void setFirstName(String x){
       firstName = x;
   }
   
   public void setLastName(String x){
       lastName = x;
   }
   
   public void setAge(int x){
       age = x;
   }
   
   public void setStatus(String x){
       smokingStatus = x;
   }
   
   public void setHeight(double x){
       height = x;
   }

   public void setWeight(double x){
       weight = x;
   }   
   
   //calculateBMI method
   public double calculateBMI(){
      double bmi = (weight * 703) / (height * height);
      return bmi;
   }
   
   //calculate insurance price method
   public double calculatePrice(){
      double price = 600.0;
      double BMI = calculateBMI(); //calling calculateBMI() method so that using the returned value is easier to read when calculating the additional fee.
      
      if (age > 50){
         price = price + 75.0;   
      }
      if (smokingStatus.equalsIgnoreCase("smoker")){
         price = price + 100.0;
      }
      if (BMI > 35.0){ //calculating additional BMI fee
         price = price + ((BMI - 35.0) * 20.0); 
      }
      
      return price;
   }
   
}