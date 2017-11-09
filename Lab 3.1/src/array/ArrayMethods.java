package array;

public class ArrayMethods {
	public static void main(String[] args) {
		int[] intArray = new int [10];
		for(int i =0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random()*10);
		}
		printArray(intArray);
		System.out.println(removeDuplicates(intArray));
	}
	public static int removeDuplicates(int [] list) {
		int count = 0;
		
		for(int i = 0; i < list.length-1; i++) {
			for(int j = i+1; j < list.length; j++)
			if(list[i] == list[j]) {
				count++;
			}
		}
		int [] copy = new int[list.length-count];
		return count;
	}
	
	public static int[][] productArray (int [] arr1, int [] arr2){
		
	}
	
	public static int [][] pascalTriangle(int n){
		
	}
	
	public static void printPascalTriangle(int [][] triangle) {
		
	}
	
	public static int[] copyArray(int[] intArray) {
		
		int[] copy = new int[intArray.length];
		
		for(int i = 0; i < intArray.length; i++) {
			copy[i] = intArray[i];
		}
		return copy;
	}
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
	 public void bubbleSort(int [] list)
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


