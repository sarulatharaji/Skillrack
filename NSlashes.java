package DailyChallenge;

import java.util.Scanner;

public class NSlashes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=n-1;j>0;j--)
			{
				System.out.print("*");
			if(j==i+1)
			{
			for(int k=0;k<1;k++)
			{
				System.out.print("/");
			}
			}
			}
			for(int j=n-1;j>0;j--)
			{
				if(j==n-i-1)
				{
				for(int k=0;k<1;k++)
				{
					System.out.print("\\");
				}
				}
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<2;i++)
		{
			System.out.print("/");
			for(int j=n-1;j>0;j--)
			{
				System.out.print("*");
			}
			for(int j=n-1;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.print("\\");
			System.out.println();
		}
		for(int i=1;i<2;i++)
		{
			System.out.print("\\");
			for(int j=n-1;j>0;j--)
			{
				System.out.print("*");
			}
			for(int j=n-1;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.print("/");
			System.out.println();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=n-1;j>0;j--)
			{
				System.out.print("*");
				if(j==n-i-1)
				{
			for(int k=0;k<1;k++)
			{
				System.out.print("\\");
			}
				}
			}
			for(int j=n-1;j>0;j--)
			{
				if(j==i+1)
				{
				for(int k=0;k<1;k++)
				{
					System.out.print("/");
				}
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
