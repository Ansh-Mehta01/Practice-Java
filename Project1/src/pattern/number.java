package pattern;

import java.util.Scanner;

public class number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value:");
	int n=sc.nextInt();
	int c=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++,c++)
		{
			System.out.print(c+" ");
		}
		System.out.println();
	}
}
}
