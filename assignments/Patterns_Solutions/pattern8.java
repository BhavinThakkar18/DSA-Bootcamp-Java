import java.util.*;
import java.lang.*;
import java.io.*;
/*

PATTERN_8
    *
   ***
  *****
 *******
*********
*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		pattern8(5);
	}
	public static void pattern8(int n)
	{
	    for(int row=1;row<=n;row++)
	    {
	        for(int i=0;i<n-row;i++)
	        {
	           System.out.print(" ");
	        }
	        for(int col=0;col<2*row-1;col++)
	        {
	            System.out.print("*");
	        }
	        for(int i=0;i<n-row;i++)
	        {
	           System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
}
