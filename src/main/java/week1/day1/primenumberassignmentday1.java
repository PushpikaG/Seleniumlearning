package week1.day1;

public class primenumberassignmentday1 {
	public static void main(String[] args) {
		int inputNum=13;
		boolean flagTest=false;
		for(int i=2;i<7;i++)
		{
			int x=inputNum%i;
			flagTest=true;
		}
		if (flagTest==true)
		{
			System.out.println("Prime number"+inputNum);
		
		}
		else 
		{
			System.out.println("Not a prime number"+inputNum);
		}
	}

}
