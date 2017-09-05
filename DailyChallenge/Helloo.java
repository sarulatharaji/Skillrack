package DailyChallenge;

	import java.util.*;
	public class Helloo{

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
			int row=sc.nextInt();
			int col=sc.nextInt();
			int i=0,j=0;
			int arr[][]=new int[row][col];
			  int arr1[][]=new int[row][col];
			for(i=0;i<row;i++)
			{
			    for(j=0;j<col;j++)
			    {
			        arr[i][j]=sc.nextInt();
			    }
			}
	        int colChange=0;
	        int colChange1=0;
	        for(i=0;i<row;i++)
	        {
	            colChange=arr[i][1-1];
	            arr[i][1-1]=arr[i][2-1];
	            arr[i][2-1]=colChange;
	            colChange1=arr[i][4-1];
	            arr[i][4-1]=arr[i][5-1];
	            arr[i][5-1]=colChange1;
	            arr1[i][col-1]=arr[i][col-3];
	        }
	        int sumCol=0;
	        int sumCol1=0;
	        int midCol=0;
	     
	        for(i=0;i<row;i++)
	        {
	            
	            sumCol=arr[i][1]+arr[i][2];
	            arr[i][1]=sumCol;
	            sumCol1=arr[i][2]+arr[i][3];
	            arr[i][3]=sumCol1;
	            midCol=arr[i][0]+arr[i][4];
	            arr[i][2]=midCol;
	          //  arr[i][col-1]=arr[i][4];
	            if(col>5)
	            {
	           int last=arr[i][4]+arr[i][col-1];
	            arr[i][4]=last;
	            int temp=arr[i][col-1];
	            arr[i][5]=arr1[i][col-1];
	            }
	        }
	        for(i=0;i<row;i++)
	        {
	            for(j=0;j<col;j++)
	            {
	                  System.out.print(arr[i][j]+" ");
	            }
	            System.out.println();
	        }		}
	}