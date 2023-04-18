/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    
	    while(N-- > 0) {
	        
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
	 if(a > b && a > c) {
	     if(b>c)
	     {
	         System.out.println(b);
	     }
	     else{
		    System.out.println(c);
	     }
	    
	 }
	 if(b > a && b > c ) {
	     if(a > c ) {
	         System.out.println(a);
	     } else {
	         System.out.println(c);
	     }
	   
	 }
	 if(c > a && c > b) {
	     if(a > b) {
	         System.out.println(a);
	     } else {
	         System.out.println(b);
	     }
	 }

	
		
}
}
}
