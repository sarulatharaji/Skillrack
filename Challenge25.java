package DailyChallenge;

import java.util.Scanner;

public class Challenge25 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][] arr=new int[n][n];
	int l=n*n;
	for(int i=0;i<n;i++)
	{	
		for(int j=0;j<n;j++)
		{
		arr[i][j]=l;
		l--;
		}
	}
	if(n%2==0)
	{
	for(int i=n-1;i>=0;i--)
	{
		for(int j=n-1;j>=0;j--)
		{
			System.out.print(arr[i][j]+" ");
		}
		i--;
		System.out.println();
		
	}
	for(int i=0;i<n-1;i++)
	{
		
	for(int j=n-1;j>=0;j--)
	{
		System.out.print(arr[i][j]+" ");
		
	}
i++;
	System.out.println();
	}
	}
	else
	{
		for(int i=n-1;i>=0;i--)
		{
			for(int j=n-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			i--;
			System.out.println();
			
		}
		for(int i=0;i<n-1;i++)
		{
		i++;	
		for(int j=n-1;j>=0;j--)
		{
			System.out.print(arr[i][j]+" ");
			
		}
		System.out.println();
		}
	}
	}
	
}
