package DailyChallenge;
import java.util.Scanner;
public class ChallengeOfTheDay {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			int t=0;
			for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();
			}
			for(int i=0;i<a.length;i++){
				t=0;
				if(i==0){
					b[i]=-1;
				}
				for(int j=i-1;j>=0;j--){
					if(a[i]<a[j]){
						t=1;
						b[i]=a[j];
						break;
					}
				}
					if(t==0){
						b[i]=-1;
				}
				}
			for(int i=0;i<a.length;i++){
				System.out.println(b[i]);
			}
	}}

	

