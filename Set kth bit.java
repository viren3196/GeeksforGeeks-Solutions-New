import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0)
		{
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    System.out.println(1<<k|n);
		    t--;
		}
	}
}
