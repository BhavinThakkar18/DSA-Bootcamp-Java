import java.util.*;
import java.lang.*;
import java.io.*;
/*
PATTERN_10
    *
   * *
  * * *
 * * * *
* * * * *
*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		pattern10(5);
	}
	public static void pattern10(int n)
	{
	    for(int row=1;row<=n;row++)
	    {
	        for(int i=0;i<n-row;i++)
	        {
	           System.out.print(" ");
	        }
	        for(int col=0;col<row;col++)
	        {
	            System.out.print("* ");
	        }
	        for(int i=0;i<n-row;i++)
	        {
	           System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
}
