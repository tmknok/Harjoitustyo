/**
 * Class for implementing quicksort algorithm.
 * 
 */
public class Quicksort {
	
	/**
	 * Method for using quicksort algorithm to arrange elements in an array to increasing order.
	 * Takes an input array as a parameter and sorts it.
	 * @param inputArr Table consisting of int elements which need to be sorted.
	 * @param first Lower bound index value. This index has the first element of the array that is sorted next.
	 * @param last Higher bound index value. This index has the last element of the array that is sorted next.
	 */
	public static void quickSort (int[] inputArr, int first, int last) {
		
		//Return if the array is empty or has only one element.
		if (inputArr == null || inputArr.length < 2) {
			
		//Else start sorting by calling partition() method and quickSort() recursively until array is sorted.
		} else if (first < last) {
			int pivot = partition (inputArr, first, last);
			quickSort (inputArr, first, pivot - 1);
			quickSort (inputArr, pivot + 1, last);
		}
	}
	
	/**
	 * Method implementing partition part of quicksort. Partition will move all elements that are less than the pivot element
	 * to the left side of the array and all elements that are greater than the pivot to the right side.
	 * @param inputArr Array of int elements.
	 * @param first Lower bound index value. This index has the element that starts the new partition on the left side of the array.
	 * @param last Higher bound index value. This index has the element that ends the new partition on the left side of the array.
	 */
	private static int partition(int[] inputArr, int first, int last) {
		
		//Save the last element in the array as the pivot element and decrease the first element's index by 1.
		int pivot = inputArr[last];
		int i = first - 1;
		
		//In each iteration increase the value of j
		for (int j = first; j < last; j++) {
			//Check if the element in index j is less than or equal than pivot element.
			//If so, increase i by 1 and change the position of the elements in indexes j and i.
			if (inputArr[j] <= pivot) {
				i++;
				int tmp = inputArr[j];
				inputArr[j] = inputArr[i];
				inputArr[i] = tmp;
			}
		}
		int tmp = inputArr[i + 1];
		inputArr[i + 1] = inputArr[last];
		inputArr[last] = tmp;
		
		return i+1;
	}
}