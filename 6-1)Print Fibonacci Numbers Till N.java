import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int a = 0;
    int b = 1;
    for (int i = 0; i < n; i++) 
    {
      System.out.println(a);//0 //a=1 //a=1 //a=2 //a=3
      int c = a + b;//c=0+1 //c=1+1 //c=1+2 //c=2+3 //c=3+5
      a = b;//a=1 //a=1 //a=2 //a=3 //a=5
      b = c;//b=1 //b=2 //b=3 //b=5 //b=8
    }
  }
}