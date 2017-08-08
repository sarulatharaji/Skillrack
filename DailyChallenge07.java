package DailyChallenge;
import java.util.*;
public class DailyChallenge07 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int sum=0;
		    n=arr.length;
		    for(int i=0;i<n;i++)
		    {
		    	if(i==0)
		    	{
		    		sum=arr[i+1];
		    		System.out.print(sum+" ");
		    	}
		    	if(i==n)
		    	{
		    		System.out.println(sum);
		    	}
		    	sum=0;
		    	for(int j=i+1;j>=0;j--)
		    	{
		    	sum=arr[i]+arr[j+1];
		    	System.out.print(sum+" ");
		    	break;
		    	}
		    }
		    sc.close();
		}
	}