public class Factorial {
    public static void main(String[] args) {
        
       // Program to find the sum of natural numbers from 1 to 1000.        
      int fact = 1;
      int n = 4;
  
      // for loop
      for (int i = 1; i <= n; ++i) {
        // body inside for loop
        fact *= i;     // sum = sum * i
        System.out.println(fact);
      }
         
      System.out.println("Sum = " + fact);
    }
}