package project;

import java.util.Scanner;

public class fabonicci {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("0 1 ");
		for(int i=1;i<=10;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			 a=b; 
			 b=c;
		}		
	}
}
