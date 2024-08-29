package project;

import java.util.*;

public class swapno {
	public void swapusinganother(int a , int b) {
		int c ;
		c=a;
		a=b;
		b=c;
		System.out.println("After Swap Using third var");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
    public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      swapno s = new swapno();
	      int a = sc.nextInt();
	      System.out.println("a="+a);
	      int b = sc.nextInt();
	      System.out.println("b="+b);
	      s.swapusinganother(a,b);
	      
}
}
