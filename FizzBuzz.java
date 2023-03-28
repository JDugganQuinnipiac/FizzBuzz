public class FizzBuzz 
{
  public static void main(String[] args) 
  {

    //FizzBuzz Algorithm
    for (int i = 1; i <= 100; i++) 
    {
      if (((i % 3) == 0) && ((i % 5) == 0)) // Checks if divisible by BOTH 3 and 5
        System.out.println("FizzBuzz");
      else if ((i % 3) == 0) // Check if divisible by 3
        System.out.println("Fizz");
      else if ((i % 5) == 0) // Check if divisible by 5
        System.out.println("Buzz");
      else
        System.out.println(i); // Print out number if neither are true
    }
  }
}