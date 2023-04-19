/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// X rtp - 4 credit
        // y audit - 2 credit
        // z non-rtp - 0 credit
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            int totalcredit = (x * 4) + (y * 2) + (z * 0);
            
            System.out.println(totalcredit);
        }
	}
}
