import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     
     int temp = n;
     while(temp != 0)
     {
         int q = temp%10;
         System.out.println(q);
         temp = temp/10;
     }
    }
   }