package DailyChallenge;
import java.util.Scanner;
public class AdjacentSum {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int col=sc.nextInt();
	int i=0;
	int j=0;
	int arr[][]=new int[row][col];
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	//interchanging cols
	int colChange=0;
	int colChange1=0;
	int sumCol=0;
	int sumCol1=0;
	int midCol=0;
	for(i=0;i<row;i++)
	{
		colChange=arr[i][1-1];
		arr[i][1-1]=arr[i][2-1];
		arr[i][2-1]=colChange;	
		colChange1=arr[i][col-1];
		arr[i][col-1]=arr[i][col-2];
		arr[i][col-2]=colChange1;
		
		}
	System.out.println();
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println();
	
	for(i=0;i<row;i++)
	{
		if(row!=col)
		{
		int sumCol2=arr[i][1]+arr[i][2];
		arr[i][1]=sumCol2;
		int sumCol3=arr[i][2]+arr[i][3];
		arr[i][3]=sumCol3;
		int midCol1=arr[i][0]+arr[i][col-1];
		arr[i][2]=midCol1;
		}
		else
		{
			sumCol=arr[i][1]+arr[i][2];
			arr[i][1]=sumCol;
			sumCol1=arr[i][1]+arr[i][2];
			arr[i][2]=sumCol1;
			midCol=arr[i][0]+arr[i][3];
			arr[i][3]=midCol;
		}
	}
/*else
{
	for(i=0;i<row;i++)
	{
		colChange=arr[i][1-1];
		arr[i][1-1]=arr[i][2-1];
		arr[i][2-1]=colChange;	
		colChange1=arr[i][col-2];
		arr[i][col-2]=arr[i][col-1];
		arr[i][col-1]=colChange1;	
		
	}
lastCol=arr[i][col-2];
		arr[i][col-2]=arr[i][col-1];
		arr[i][col-1]=lastCol;
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	int lasCol=0;
	System.out.println();
	for(i=0;i<row;i++)
	{
		sumCol=arr[i][1]+arr[i][2];
		arr[i][1]=sumCol;
		sumCol1=arr[i][0]+arr[i][3];
		arr[i][2]=sumCol1;
		midCol=arr[i][2]+arr[i][4];
		arr[i][3]=midCol;
		lasCol=arr[i][3]+arr[i][col-2];
		arr[i][4]=lasCol;	
	}
}*/
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}
}

