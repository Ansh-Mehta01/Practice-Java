package project;

import java.util.Scanner;

public class Assign172aug {
	public int ad(int a , int b) {
    	int c;
    	c =a+b;
    	return c;
	}
    public int sub(int d ,int e) {
    	int g;
    	g =d-e;
    	return g;
	}
    public int multi(int a ,int b) {
    	int e;
    	e =a*b;
    	return e;
	}
    public int div(int a ,int b) {
    	int f;
    	f =a/b;
    	return f;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Assign172aug ass= new Assign172aug();
		System.out.println("Enter the value of the variables");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int mu= ass.multi(a,b);
		int adddd= ass.ad(mu,c);
		int su = ass.multi(adddd,d);
		int me = ass.sub(su,e);
		int di = ass.div(me,f);
		System.out.println("((((a*b)+c)*d)/e)= "+di);	
	}

}
