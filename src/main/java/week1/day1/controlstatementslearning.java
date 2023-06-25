package week1.day1;

public class controlstatementslearning {
public static void main(String[] args) {
	int a=-0;
	//find whether given number is positive or negative
	if (a>0)
	{
		System.out.println(a+" is positive");
	}
		
		else if(a<0)
		{
			System.out.println(a+"is negative");
		}
		else if(a==0)
		{
			System.out.println(a+"is neutral");
		
		}
	String browserType= "Chrome";
	switch(browserType)
	{
	case "Chrome":
		System.out.println("Open chrome browser");
		break;
	case "firefox":
		System.out.println("Open firefox browser");
		break;
	default:
		System.out.println("Open safari browser");
		break;
	
	}
	}
}


