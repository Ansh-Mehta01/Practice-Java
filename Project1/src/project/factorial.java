package project;

import java.util.Scanner;

public class factorial {
      public void fact(int n) {
    	  int c=1;
		for(int i=n;i>0;i--)
		{
			c = c*i;
			
		}
    	  System.out.println("Factorial of "+n+" is="+c);
	}
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no.=");
		factorial t = new factorial();
		int n = sc.nextInt();
		t.fact(n);
	}
}
