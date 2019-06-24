package kavi;

public class BoxDemo {
public static void main(String args[])
{
	Box b= new Box(5,10,15);
	System.out.println("volume of b is "+b.volume());
	
	Box b1= new Box(5,10,20);
	System.out.println("volume of b1 is "+b1.volume());
	System.out.println("area of b1 is "+b1.area());
}
}
