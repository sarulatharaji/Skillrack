package DailyChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending3AtEnd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int search=sc.nextInt();
		int arr=0;
		for(int i=start;i<end;i++)
		{
			
			arr=i;
			if(arr%10==search)
			{
				System.out.print(arr+" ");
			}
			}
		
	}

}
