// Accept 2 double values from User (using Scanner). Check data type.
//. If arguments are not doubles , supply suitable error message & terminate.
//If numbers are double values , print its average.
//Hint : Method of Scanner to use : hasNextDouble , nextDouble 

import java.util.Scanner;
class CheckDouble
{
  public static void main(String[] args)
  {
    //Scanner sc= new Scanner(System.in);
    Scanner sc= new Scanner(System.in);
    double num1;
    double num2;
    System.out.println("Enter the number num1 :");
    if(sc.hasNextDouble())
    {  
       num1 = sc.nextDouble();
       System.out.println("Enter the number num2 :");
       if(sc.hasNextDouble())
       {  
          num2 = sc.nextDouble();   
          System.out.println("Average = "+ (num1+num2)/2.0);
       }
       else 
         System.out.println("Number is not Double"); 
    }
    else
      System.out.println("Number is not Double");
      
    sc.close();

   }
    
   
}