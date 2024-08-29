package project;

import java.util.Scanner;

public class Assign17aug {

    public int ad(int a , int b) {
    	int c;
    	c =a+b;
    	return c;
	}
    public int sub(int d ,int e) {
    	int c;
    	c =d-e;
    	return c;
	}
    public int multi(int a ,int b) {
    	int c;
    	c =a*b;
    	return c;
	}
    public int div(int a ,int b) {
    	int c;
    	c =a/b;
    	return c;
	}
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Assign17aug ass= new Assign17aug();
		System.out.println("Enter the value of the variables");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int addd= ass.ad(a,b);
		int adddd= ass.ad(addd,c);
		int su = ass.sub(adddd,d);
		int mu = ass.multi(su,e);
		int di = ass.div(mu,f);
		System.out.println("((((a+b)+c)-d)/e)= "+di);
	}
}
