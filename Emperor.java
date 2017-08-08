package DailyChallenge;
import java.util.Scanner;
public class Emperor {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		    	arr[i]=sc.nextInt();
		    }
		    int output=0;
		    int len=arr.length;
		  for(int i=len-1;i>0;i--)
		  {
		   	if(len-1>2)
		   	{
		    		int sum1=arr[i/2-1]*arr[0]*arr[i/2+1];
		    		output=sum1;   	
		   	}
		   	if(len-1<=2)
		    {
		    		output=arr[0]*arr[1]+arr[1];
		    }
		  }
			System.out.println(output);   
	}
}
