package project;

import java.util.Scanner;

public class ansh {
	public void sum(int a , int b) {
		int c = a+b;
		System.out.println("Sum of A+B = "+c);

	}
    
    public static void main(String[] args) {
    	ansh an= new ansh(); 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the value");
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	an.sum(a, b);
	}
}
