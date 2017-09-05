package DailyChallenge;
import java.util.*;
public class Challenge8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(((num1!=num2)&&(num1!=num3)&&(num2!=num3)))
		{
			if((num1>num2)&&(num1>num3))
			{
			System.out.println("Arun");
			}
			else if(num2>num3)
			{
				System.out.println("Balaji");
			}
			else
			{
				System.out.println("Chandru");
			}
		}
		if((num1==num2)&&(num1>num3))
		{
			System.out.println("Arun Balaji");
		}
		else if((num2==num3)&&(num3>num1))
		{
			System.out.println("Balaji Chandru");
		}
		else
		{
			System.out.println(" Arun Chandru");
		}
		if((num1==num2)&&(num2==num3)&&(num1==num3))
		{
			System.out.println("TIE");
		}
		sc.close();
	}

}
