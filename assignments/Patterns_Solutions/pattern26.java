
import java.util.*;
import java.lang.*;
import java.io.*;
/*
PATTERN_26
      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6
*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		pattern26(6);
	}
	public static void pattern26(int n)
	{
	    for(int row=1;row<=n;row++)
	    {
	        for(int col=n-row+1;col>=1;col--)
	        {
	            System.out.print(row+" ");   
	        }
	        System.out.println();
	    }
	    
	}
}
