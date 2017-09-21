import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		while(t>0)
		{
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    while(k>0)
		    {
		        n>>=1;
		        k--;
		    }
		    if((n&1) == 1) System.out.println("Yes");
		    else    System.out.println("No");
		    t--;
		}
	}
}
