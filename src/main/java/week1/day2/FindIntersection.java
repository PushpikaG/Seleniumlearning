package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] variableA	= {3,2,11,4,6,7};
		int[] variableB = {1,2,8,4,9,7};
		for(int i=0;i<variableA.length;i++)
		{
			for(int j=0;j<variableB.length;j++)
			{
				if (variableA[i]==variableB[j])
				{
					System.out.println("Intersection values are"+variableA[i]);
					
				}
			}
		}
		
	}
}
