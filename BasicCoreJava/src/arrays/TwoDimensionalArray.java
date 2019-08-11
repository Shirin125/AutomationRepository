package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*int [] []val = new int[6][2];
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
		}
		
		for(int[] i: val)
		{
		    for(int j:i)
		    {
		    	System.out.print(j+" ");
		    }
		    System.out.println();
		}
		 System.out.println("............................");*/
		
		int [][] values=new int [3][4];
		values[0]=new int [2];
		values[1]=new int [2];
		values[2]=new int [2];
		int cnt=0;
		int k=0;
		for(int[]i:values)
		{
			for (int j: i)
			{
				System.out.println("J is "+j);
				values[cnt][k]=k;
				k++;
				
			}
			k=0;
			cnt++;
		}
		
		for(int[]i:values)
		{
			for (int j: i)
			{
				System.out.print(j);
			}
		}

	}

}
