import java.util.*;
import java.lang.*;
import java.io.*;
/*

PATTERN_5

*
**
***
****
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
		pattern5(5);
	}
	public static void pattern5(int n)
	{
	    for(int row=0;row<2*n;row++)
	    {
	        int totalStarsInRow = (row > n) ? 2*n - row : row;
	        for(int col=0;col<totalStarsInRow;col++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    
	}
}
