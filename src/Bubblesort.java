/**
 * Class for implementing bubblesort algorithm.
 * 
 */
public class Bubblesort {

	/**
	 * Method for using bubblesort to arrange elements in an array to increasing order.
	 * Takes an input array as a parameter and sorts it.
	 * @param inputArr Array of int elements which will be sorted.
	 */
	public static void bubbleSort(int[] inputArr) {
		
		int length = inputArr.length;
		boolean swapped;
		//Go through the elements in the array until there is no need for any elements to swap places
		do {
			swapped = false;
			for(int i = 1; i < length; i++) {
				//Compare to elements that are next to each other in the array
				//If they are in the wrong order --> swap their places
				if(inputArr[i-1] > inputArr[i]) {
					int tmp = inputArr[i-1];
					inputArr[i-1] = inputArr[i];
					inputArr[i] = tmp;
					//A swap has taken place!
					swapped = true;
				}
			}
			length -= 1;
			
		} while (swapped);
	}
}