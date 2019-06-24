
package kavi;
import java.util.*;
public class Chandra {
	public static void main(String args[])
	{
		Scanner e =new Scanner(System.in);
		int n=e.nextInt();
		for(int i= 0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
		}
	}

}
