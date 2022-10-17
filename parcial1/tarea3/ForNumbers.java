public class ForNumbers {
    // Program to print numbers from 1 to 5
    public static void main(String[] args) {
    
      int n = 50;
      // for loop  
      System.out.println("Tabla del 2");
      for (int i = 9; i <= n; i=i+9) {
        System.out.println(i);
      }
      System.out.println("Pares menores de 100");
      for (int i = 2; i <= n; i=i+2) {
        System.out.println(i); 
      }
      System.out.println("Impares entre 10 y 50");
      for (int i = 10; i <= n; i=i+3) {
        System.out.println(i); 
      }
      System.out.println("Pares menores de 100 en descendente");
      n=100;
      for (int i = n; i >= 2; i=i-2) {
        System.out.println(i); 
      }
      System.out.println("Impares entre 18 y 50 en descendente");
      n=50;
      for (int i = n; i >= 18; i=i-3) {
        System.out.println(i); 
      }
    }
} 