package DailyChallenge;

import java.util.*;

public class Challenge9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int n=sc.nextInt();
		List<String> list=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.next());
		}
		int c=sc.nextInt();
		List<String> list1=new ArrayList<String>();
		
		for(int i=0;i<c;i++)
		{
			list1.add(sc.next());
		}
		list.removeAll(list1);
		Iterator itr=list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
