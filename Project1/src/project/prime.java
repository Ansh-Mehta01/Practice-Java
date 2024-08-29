package project;

import java.util.Scanner;

public class prime {
	public void pri(int n) {
		int count = 0;
		for(int i=1;i<n;i++)
		{
			if (n%i==0)
			{
				count = count+1;
			}
		}
		if(count==1)
		{
			System.out.println(n+" is prime");
		}
		else 
		{
			System.out.println(n+" is not prime" );
		}
	}
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		prime pr = new prime();
		System.out.print("Enter the number:");
		int n =sc.nextInt();
		pr.pri(n);
		
	}
}
