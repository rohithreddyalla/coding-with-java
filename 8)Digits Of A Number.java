import java.util.*;
    
    public class Main {
    
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
    
            int power = 1;
            int temp = n;234
            while (temp >= 10) //234> 23>
            {
                temp = temp/10; //23 2
                power = power*10; //10 100
            }
    
            temp = n; //again temp = 234
            while(power != 0) //100
            {
                int digit = temp / power; // 234/100=2 
                System.out.println(digit); // 2  
    
                temp = temp % power; // 34
                power = power / 10; // power=10
            }
        }
    }

 
                        
                        
                        
