package week1.day2;

public class arrayLearning {
	//find duplicate numbers in an array
	public static void main(String[] args) {
		
		int[] numbers= {1,2,3,3,5,6,6};
		for (int i=0;i<numbers.length;i++)
		{
			for (int j=i+1;j<numbers.length;j++)
			{
				if (numbers[i]==numbers[j])
				{
					System.out.println("Duplicate number is"+numbers[i]);
				}
			}
		}
	}

	
}
	