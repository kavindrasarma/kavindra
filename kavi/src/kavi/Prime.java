package kavi;
import java.util.*;
public class Prime {

public static void main(String args[])
{
	Scanner p=new Scanner(System.in);
	int n=p.nextInt();
	int sum=0,a,r;
	a=n;
	while(a!=0)
	{
		r=a%10;
		sum=sum*10+r;
		a=a/10;
		
	}
		if(sum==n)
		{
			System.out.println("palindrome");
			
		}
		else
	System.out.println("not a palindrome");
		}
}

