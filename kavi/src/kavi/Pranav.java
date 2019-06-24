package kavi;
import java.util.Scanner;
public class Pranav {
		public static void main(String args[])
		{
			Scanner e =new Scanner(System.in);
			int n=e.nextInt();
			for(int i= 0;i<n;i++)
			{
				for(int j=0;j<n-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<=i;k++)
				{
					System.out.print("* ");
				}
				System.out.println(" ");
			}
			for(int i=n-2;i>=0;i--)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<=i;k++)
				{
					System.out.print("* ");
				}
				System.out.println(" ");
			}
		}

	}

