package project;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int n=sc.nextInt();
	int check = n;
	int b=0;
	while (n>0)
	{
		int a =n%10;
		b =b+a*a*a;
		n = n/10;
	}
	if (check == b)
	{
		System.out.println(check+" is an armstrong number");
	}
	else {
		System.out.println(check+" is not an armstrong number");
	}
}
}
