package DailyChallenge;
import java.util.*;
public class Challenge14 {
	public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    
    Set<Integer> s=new LinkedHashSet<Integer>();
    for(int i=0;i<arr.length;i++)
    {
        s.add(arr[i]);
    }
   /* int rem[]=new int[s.size()];
    rem=Arrays.copyOf(s, s.size());*/
    int max=arr[0];
    int min=arr[0];
    int count=0;
    int counts=0;
    Iterator itr=s.iterator();
   while(itr.hasNext())
   {
	   int str=(int) itr.next();
	   System.out.println(str);
	   System.out.println("sorted");
        if(str>max)
        {
            max=str;
            System.out.println(max);
            count++;   
         }
        else if(str<min){
        	min=str;
            counts++;
            }
    }
    System.out.println(count+" "+counts);
	}
}
