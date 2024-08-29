package project;

import java.util.Scanner;

public class Singledigit {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	
	if(n>9) {
	   int b=0;
	   int d=0;
	   while(n>9)
	   {
		int a = n%10;
		b = b+a;
		n = n/10;
	   }
	        if(b>9) {
	            while (b>9)	
	            {
		          int c=b%10;
		          d=d+c;
		          b=b/10;   
	            }
	            System.out.println(d+"Single Digit no.");
	        }
             else {
		         System.out.println(b+"Single Digit no.");
	            }
	
	   }
	else
	{
		System.out.println(n+"Single Digit no.");
	}
}
}
