/**
 * Class for implementing countingsort algorithm.
 *
 */
public class Countingsort {

	/**
	 * Method for using counting sort to arrange an array of int elements to increasing order.
	 * Takes an input array as a parameter and returns a sorted version of it.
	 * @param inputArr Array of int elements which will be sorted.
	 * @return Array of int elements that has the original array's elements in an increasing order.
	 */
	public static int[] countingSort (int[] inputArr) {
		
		int max = 0;
		
		for (int i = 0; i < inputArr.length; i++) {
			if (max < inputArr[i]) {
				max = inputArr[i];
			}
		}
		
		int[] b = new int[max +1 ];
		
		for (int i = 0; i < inputArr.length; i++) {
			b[inputArr[i]]++;
		}
		
		for (int i = 1; i < b.length; i++) {
			b[i] += b[i - 1];
		}
		
		int[] result = new int[inputArr.length];
		
		for (int i = inputArr.length; i >= 0; i--) {
			result[b[inputArr[i]]-1] = inputArr[i];
		}
		
		return result;
	}
}