package DailyChallenge;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int fatherNetworth=sc.nextInt();
		int children=sc.nextInt();
		for(int ctr=0;ctr<children;ctr++)
		{
			int ownEarnings=sc.nextInt();
			Child child=new Child(fatherNetworth,children,ownEarnings);
					System.out.println(child.getNetworth());
		}
	}

}
