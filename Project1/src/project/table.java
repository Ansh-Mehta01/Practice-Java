package project;

import java.util.Scanner;

public class table {
	public void tab(int n) {
		for (int i=1;i<=10;i++)
		{
			int c = n*i;
			System.out.println(n+"*"+i+" = "+c);
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no.=");
	table t = new table();
	int n = sc.nextInt();
	t.tab(n);
}
}
