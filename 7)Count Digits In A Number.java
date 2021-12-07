import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();//3456
    int digit = 0;
    while(n !=0)
    {
        n = n/10;//n=3456 divide by 10 = 345 2nd time n=34 3rd n=3                       4th time n= 0 now will not enter into loop.
        digit++;// 1digit  2digits  3digits  4digits
    }
    
    System.out.println(digit);
    
   }
  }
