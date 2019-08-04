package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int [] []val = new int[6][2];
		val[0][0]=2;
		val[0][1]=1;
		val[1][0]=2;
		val[1][1]=1;
		val[2][0]=2;
		val[2][1]=1;
		/*for(int i=0;i<val.length;i++)
		{
			for(int j=0;j<val[i].length;j++)

			{
				System.out.println("array:"+val[i][j]);
			}
		}*/
		
		for(int[] i: val)
		{
		    for(int j:i)
		    {
		    	System.out.println(j);
		    }
		}

	}

}
