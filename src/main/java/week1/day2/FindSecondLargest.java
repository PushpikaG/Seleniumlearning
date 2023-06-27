package week1.day2;
import java.util.Arrays;


public class FindSecondLargest {
	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7};

		for (int i=0;i<data.length;i++)
		{
			for(int j=i+1;j<data.length;j++)
			{
				if(data[i]>data[j])
				{
			int temp=0;
			temp=data[i];
			data[i]=data[j];
			data[j]=temp;
			
			
				}
			}
		}
				
		System.out.println("Elements in ascending order are as follows");
		for (int k=0;k<data.length;k++)
		{
			System.out.println(data[k]+"  ");

			
		}
		System.out.println("Second element from last"+data[4]);
		
		/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				
	}

}
