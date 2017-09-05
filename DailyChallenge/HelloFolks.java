package DailyChallenge;
import java.util.Scanner;
public class HelloFolks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();
		int i=0,j=0;
		int arr[][]=new int[row][column];
		for(i=0;i<row;i++){  
			 for(j=0;j<column;j++){  
				 arr[i][j]=sc.nextInt();
			 }
		 }
		int E=sc.nextInt();
		int F=sc.nextInt();
		int Array[][]=new int[row][column];
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				if(arr[i][j]%2==0)
				{
					Array[i][j]=arr[i][j]*E;
				}
				else if(arr[i][j]%2!=0)
				{
					Array[i][j]=arr[i][j]*F;
				}
				System.out.print(Array[i][j]);
			}
			System.out.println();
		}
	}

}
