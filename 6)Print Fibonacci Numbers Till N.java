import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      System.out.println("Enter a number num=no.of fibonacci nums");
      Scanner scn = new Scanner(System.in);
      int n= scn.nextInt();
      int a=0,b=0,c=0;
      int next;
      for(int i=0;i<n;i++)
      {
          if(a==0)
          {
              System.out.println(a);//0
              a=1;//1
          }
          else
          {
              
              next = a + b; //1+0=1
              System.out.println(next);//1
              a=b;//a=0
              if(b == 0)
              {
                  System.out.println(next);//1
                  a=1;
              }
              b=next;//b=1
          }
      }
   }
  }