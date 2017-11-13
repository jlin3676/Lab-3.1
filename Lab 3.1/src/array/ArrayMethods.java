package array;

import java.util.Arrays;
/**
 * 
 * @author Jacky Lin, Brandon Channer
 *
 */
public class ArrayMethods {
	
	
	public static void main(String[] args) {
	int [] intArray = {1,2,2,4,2,2,2,5,6,2};
	int [] intArray2 = {2,4,6,8,10};
	int [] copy = copyArray(intArray);
	printArray(removeDuplicates(copy));
	//System.out.println(Arrays.deepToString(productArray(intArray,intArray2)));
	int [][] triangle = pascalTriangle(5);
	printPascalTriangle(triangle);
	}
	
	
	public static int[] removeDuplicates(int[] list)
	{
		int [] copy = new int[list.length];
		copy[0] = list[0];
		for(int i = 1; i < list.length-1; i++) {
			for(int j = i+1; j < copy.length; j++) {
				if(copy[j] < list[i]) {
					
				}
			}
		}
	}
	
	// multiplies the items at each position 
	public static int[][] productArray (int [] arr1, int [] arr2){
		int [][] product = new int[arr1.length][arr2.length];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				product[i][j] = arr1[i] * arr2[j];
			}
		}
		return product;
	}
	
	public static int[][] pascalTriangle(int n)
	{
		int[][] triangle = new int[n][];
		//until it goes through each row in the 2d array
		for (int i = 0; i < triangle.length; i++)
		{
			//determines how many items are in each row.
			triangle[i] = new int [i + 1];
			for (int j = 0; j < triangle[i].length; j++)
			{
				//adds a 1 if the current position is either the first item or last.
				if (j == 0 || j == triangle[i].length - 1)
				{
					triangle[i][j] = 1;
				}
				else
				{
					triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
				}
			}
		}
		return triangle;
	}
	public static void printPascalTriangle(int[][] pTriangle)
	{
		int lastRowVal = (pTriangle[pTriangle.length-1].length);
		for(int i = 0; i < pTriangle.length-1;i++)
		{
			int index = lastRowVal - pTriangle[i].length;
			for(int k = 0; k < index; k++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j <= pTriangle[i].length-1; j++)
			{
				if(j == pTriangle[i].length-1 )
				{
					System.out.print(pTriangle[i][j]);
				}
				else
				{
				System.out.print(pTriangle[i][j]+ " ");
				}
			}
			for(int k = 0; k < index; k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
	

	public static int[] copyArray(int[] intArray) {
		int[] copy = new int[intArray.length];
		
		for(int i = 0; i < intArray.length; i++) {
			copy[i] = intArray[i];
		}
		return copy;
	}
	
}


