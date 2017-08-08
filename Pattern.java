package DailyChallenge;
import java.util.Scanner;
public class Pattern extends Thread{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j=0;	
	Pattern p=new Pattern();
		for(int i=1;i<=n/2+1;i++)
		{	
			for(j=n/2+1;j>i;j--)
			{
				System.out.print("!");
			}	
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			for(j=n/2+1;j>i;j--)
			{
				System.out.print("!");
			}
			System.out.println();
		}
	}
}
