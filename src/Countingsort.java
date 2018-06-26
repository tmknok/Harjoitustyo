/**
 * Class for implementing countingsort algorithm.
 *
 */
public class Countingsort {

	/**
	 * Method for using counting sort to arrange an array of int elements to increasing order.
	 * Takes an input array as a parameter and returns a sorted version of it.
	 * @param inputArr Array of int elements which will be sorted.
	 */
	public static void countingSort (int[] inputArr) {
		
		//Initialize result array that is the same size as the original array
		int[] result = new int[inputArr.length];
		
		//Here we find the maximum element of the input array and initialize
		//the array c (frequency vector c) that is the size of the maximum element's value increased by 1.
		int max = 0;
		for (int i = 0; i < inputArr.length; i++) {
			if (max < inputArr[i]) {
				max = inputArr[i];
			}
		}
		int[] c = new int[max + 1];
		for (int i = 0; i < c.length; i++) {
			c[i] = 0;
		}
		
		//Count the occurences of each element in the input array and store the counts to the array c
        for (int i = 0; i < inputArr.length; i++) {
        	c[inputArr[i]]++;
        }
		
		//Cumulate each value of vector c: add the previous vector c to the current one
		for (int i = 1; i < c.length; i++) {
			c[i] = c[i] + c[i - 1];
		}
		
		//According to the array c save the elements from the original array to result array.
		for (int i = 0; i < inputArr.length; i++) {
			result[c[ inputArr[i] ]- 1 ] = inputArr[i];
			c[ inputArr[i] ]--;
		}
		
		//Change the input array to the sorted one
		int index = 0;
		for (int element: result) {
			inputArr[index] = element;
			index++;
		}
	}
}