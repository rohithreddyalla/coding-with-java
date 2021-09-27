import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here 
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int count = 0;
      int temp = n;
      while(temp != 0)
      {
          temp = temp/10;
          count++;
      }
      
      int div = (int)Math.pow(10, count-1);
      while(div != 0)
      {
          int q = n/div;
          System.out.println(q);
          
          n = n % div;
          div = div/10;
      }
     }
    }