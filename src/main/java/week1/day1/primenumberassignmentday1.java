package week1.day1;

public class primenumberassignmentday1 {
	public static void main(String[] args) {
		int inputNum=9;
		boolean flagTest=true;
		for(int i=2;i<inputNum;i++)
		{
			if(inputNum%i==0) {
				flagTest=false;
				break;
			}
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
