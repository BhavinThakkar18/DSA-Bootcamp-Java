import java.util.*;
import java.lang.*;
import java.io.*;
/*

PATTERN_3

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
		pattern3(5);
	}
	public static void pattern3(int n)
	{
	    for(int row=0;row<n;row++)
	    {
	        for(int col=0;col<n-row;col++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}
