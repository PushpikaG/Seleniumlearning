package week1.day2;

public class calculator {

	public int addMethod(int a,int b,int c)
	{
		return a+b+c;

	}
	public float subtractMethod(int c, float d)
	{
		return c-d;
	}
	public int divMethod(int c,int d)
	{
		return c/d;
	
	}
	public static void main(String[] args) {
	calculator c= new calculator();
	System.out.println("add"+c.addMethod(9,10,11));
	System.out.println("add"+c.subtractMethod(10,1.5f));
	System.out.println("division"+c.divMethod(10,5));
	
	}
}
