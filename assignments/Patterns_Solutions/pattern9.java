import java.util.*;
import java.lang.*;
import java.io.*;
/*

PATTERN_9

*********
 *******
  *****
   ***
    *
*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		pattern9(5);
	}
	public static void pattern9(int n)
	{
	    for(int row=1;row<=n;row++)
	    {
	        for(int i=0;i<row-1;i++)
	        {
	           System.out.print(" ");
	        }
	        for(int col=0;col<2*(n-row)+1;col++)
	        {
	            System.out.print("*");
	        }
	        for(int i=0;i<row-1;i++)
	        {
	           System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
}
