package week1.day2;

public class DuplicatePrint {
	public static void main(String[] args) {
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// print the matching value
					
			
			
			int count;
			int a=arr.length;
			for(int i=0;i<a-1;i++)
			{
				count=0;
				for (int j=i+1;j<a;j++)
				{
					if (arr[i]==arr[j])
					{
						System.out.println("Duplicate values are "+arr[i]);
					}

				}
			}
	}

}
