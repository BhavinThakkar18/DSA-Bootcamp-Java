import java.util.*;
import java.lang.*;
import java.io.*;
/*

PATTERN_6

*****
 ****
  ***
   **
    *

*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		pattern7(5);
	}
	public static void pattern7(int n)
	{
	    for(int row=0;row<n;row++)
	    {
	        for(int i=0;i<row;i++)
	        {
	           System.out.print(" ");
	        }
	        for(int col=0;col<n-row;col++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}
