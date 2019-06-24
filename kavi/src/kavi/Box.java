package kavi;
public class Box {
	int l,b,h;
	int volume()
	{
		return l*b*h;			
	}
	Box(int len,int bre,int hei)
	{
		l=len;
		b=bre;
		h=hei;
	}
	int area()
	{
		return l*b;
	}
}
