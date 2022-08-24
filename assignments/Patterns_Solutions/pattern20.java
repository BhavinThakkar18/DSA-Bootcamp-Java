import java.util.*;
import java.lang.*;
import java.io.*;
/*
PATTERN_20

       ****
       *  *
       *  *
       *  *
       ****
*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		pattern20(5);
	}
	public static void pattern20(int n)
	{
	    for(int row=1;row<=n;row++)
	    {
	        for(int col=0;col<n-1;col++)
	        {
	            if(row==1 || row==n || col==0 || col==n-2)
	            {
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	            
	        }
	        System.out.println();
	    }
	    
	}
}
