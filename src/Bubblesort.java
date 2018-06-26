/**
 * Class for implementing bubblesort algorithm.
 * 
 */
public class Bubblesort {

	/**
	 * Method for using bubblesort to arrange elements in an array to increasing order.
	 * Takes an input array as a parameter and returns a sorted version of it.
	 * @param inputArr Array of int elements which will be sorted.
	 * @return Array of int elements that has the original array's elements in an increasing order.
	 */
	public static int[] bubbleSort(int[] inputArr) {
		
		int length = inputArr.length;
		
		for (int pass = 1; pass < length; pass++) {
			for (int i = 0; i < length-pass; i++) {
				if (inputArr[i] > inputArr[i + 1]) {
					int tmp = inputArr[i];
					inputArr[i] = inputArr[i + 1];						
					inputArr[i+1] = tmp;
				}
			}
			
		}
		
		//Save the sorted array to a new array and return it.
		int[] result = new int[inputArr.length];
		int i = 0;
		for (int element: inputArr) {
			result[i] = element;
			i++;
		}
		return result;
	}
}