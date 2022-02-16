public class Print2DArray {
	public static void print2DArray(int[][] arr) {
		for(int i =0; i<arr.length; i++)
		{
			if(i==0)
			{
				System.out.print("[");
			}
			for(int j =0; j<arr[i].length; j++)
			{
				if(j==arr[i].length-1 && i==arr.length-1)
				{
					System.out.print(arr[i][j]+"]");
				}
				else if(j==arr[i].length-1)
				{
					System.out.print(arr[i][j]+"], ");
				}
				else if(j==0)
				{
					System.out.print("["+arr[i][j]+", ");
				}
				else
				{
					System.out.print(arr[i][j]+", ");
				}
				
			}
			if(i==arr.length-1)
			{
				System.out.print("]");
			}
		}
	}
}