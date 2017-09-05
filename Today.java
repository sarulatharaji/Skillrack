package DailyChallenge;
import java.util.*;
public class Today {
	 public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
			
			int n=in.nextInt();
			String str[][]=new String[n][3];
			for(int i=0;i<n;i++){
				for(int j=0;j<3;j++)
				{
					str[i][j]=in.next();
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<3;j++)
				{
			    String s[]=str[i][j].split(" ");
			   int p1=Integer.parseInt(s[0]);
			   int p2=Integer.parseInt(s[1]);
			   int th=Integer.parseInt(s[2]);
			   if(Math.abs(p1-th)<Math.abs(p2-th))
			   System.out.println("Police1");
			   else if(Math.abs(p1-th)>Math.abs(p2-th))
			   System.out.println("Police2");
			   else
			   System.out.println("Both");
			    
			}
			}
	 }
}
