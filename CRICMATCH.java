/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// req N runs 
		// M overs
		// max 6 runs in a ball
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
		    int n = sc.nextInt(); // req runs
		    int m = sc.nextInt(); // overs
		     
		    int reqRuns = m * 36;
		    
		    if(n <= reqRuns) {
		        System.out.println("YES");
		    } else {
		        System.out.println("NO");
		    }
		}
	}
}
