/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // 	stock value X 
        // sold at value of Y 
        // profit | loss | neutral
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            if(X > Y) {
                System.out.println("LOSS");
            } else if(X < Y) {
                System.out.println("PROFIT");
            } else {
                System.out.println("NEUTRAL");
            }
        }

	}
}
