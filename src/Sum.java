public class Sum extends Thread { 
   private int max; 
   public Sum(int max) { 
      this.max = max; 
   } 
   public void run() { 
      int total = 0; 
      for (int i = 0; i <= max; i++) { 
         total += i; 
         System.out.print(getName() + ":"); 
         System.out.printf("sum(1:%d = %d %n", i, total); 
      } 
   }
} 