import java.util.*;
import java.lang.*;
import java.io.*;
/*

PATTERN_6

    *
   **
  ***
 ****
*****

*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		pattern6(5);
	}
	public static void pattern6(int n)
	{
	    for(int row=0;row<n;row++)
	    {
	        for(int col=0;col<n;col++)
	        {
	            if(col>=n-1-row)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	    
	}
}
