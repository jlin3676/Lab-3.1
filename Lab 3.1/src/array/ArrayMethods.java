package array;

import java.util.Arrays;
/**
 * 
 * @author Jacky Lin, Brandon Channer
 *
 */
public class ArrayMethods {
	
	
	public static void main(String[] args) {
	int [] intArray = {1,2,2,4,2,2};
	int [] intArray2 = {2,4,6,8,10};
	bubbleSort(intArray);
	//printArray(intArray);
	printArray(removeDuplicates(intArray));
	System.out.println(Arrays.deepToString(productArray(intArray,intArray2)));
	}
	
	
	public static int [] removeDuplicates(int [] list) {
		int j = 0;
        int i = 1;
        if(list.length < 2){
            return list;
        }
        while(i < list.length){
            if(list[i] == list[j]){
                i++;
            }
            else
            {
                list[++j] = list[i++];
            }    
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = list[k];
        }
         
        return output;
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
		
	}
	
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
	
	//sorts the array from least to greatest
	 public static void bubbleSort(int [] list)
	    {
	        for (int i = 0; i < list.length-1; i++)
	            for (int j = 0; j < list.length-1-i-1; j++)
	                if (list[j] > list[j+1])
	                {
	                    int temp = list[j];
	                    list[j] = list[j+1];
	                    list[j+1] = temp;
	                }
	    }
}


