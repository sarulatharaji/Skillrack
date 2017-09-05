package DailyChallenge;
import java.util.*;
public class challenge24 {
	final static int CELLCOUNT=8;
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);	
		int a[]=new int[8];
		for(int i=0;i<8;i++){
			a[i]=read.nextInt();	
		}
		int day=read.nextInt();
		a=cellComplete(a,day);
		for(int i=0;i<CELLCOUNT;i++){
			System.out.print(a[i]);
		}
	}
	static int[] cellComplete(int cells[], int days){
		int arr[]=new int[CELLCOUNT];
		for(int k=0;k<days;k++)
		{
		    for(int i=1;i<=CELLCOUNT-2;i++)
		    {
		        arr[0]=0^cells[1];
		        arr[CELLCOUNT-1]=0^cells[CELLCOUNT-2];
		        
		        if((cells[i-1]^cells[i+1])==1)
		        {
		            arr[i]=1;
		        }
		        else
		        {
		            arr[i]=0;
		        }
		    }
		    for(int j=0;j<CELLCOUNT;j++)
		    {
		        cells[j]=arr[j];
		        
		    }
		}
		return cells;
		}
}
