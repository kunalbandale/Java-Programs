/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// X students join
        // y Chairs already ahet 
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>y){
            int ChairsReq = Math.abs(x-y);
            System.out.println(ChairsReq);
            }
            else{
            System.out.println(0);
           }
	}   }
}
