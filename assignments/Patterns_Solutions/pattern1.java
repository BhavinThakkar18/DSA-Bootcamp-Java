import java.util.*;
import java.lang.*;
import java.io.*;
/*

PATTERN_1

*
* *
* * *
* * * *

*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		pattern1(4);
	}
	public static void pattern1(int n)
	{
	    for(int row=0;row<n;row++)
	    {
	        for(int col=0;col<=row;col++)
	        {
	            System.out.print("*"+" ");
	        }
	        System.out.println();
	    }
	}
}
