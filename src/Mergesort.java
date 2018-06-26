/**
 * Class for implementing mergesort algorithm.
 *
 */
public class Mergesort {

	/**
	 * Method for using mergesort algorithm to arrange elements in an array to increasing order.
	 * Takes an input array as a parameter and sorts it.
	 * @param inputArr Array of int elements which need to be sorted.
	 * @param extra An extra array of int elements to be used during sorting.
	 * @param first
	 * @param last
	 */
	public static void mergeSort(int[] inputArr, int[] extra, int first, int last) {
		
		//Check if input array has only one element.
		//If so, no need for sorting, return original array.
		if (first >= last) { 
			return;
		}
		
		//Check if input array has only two elements.
		//If so, just swap the elements into the right order, if necessary.
		if (first + 1 == last) {
			if (inputArr[first] > inputArr[last]) {
				int tmp = inputArr[first];
				inputArr[first] = inputArr[last];
				inputArr[last] = tmp;
			}
		
		//Here the array has 2+ elements, so the array is then sorted recursively by dividing the array into two parts and merging
		//the sorted parts of it until the whole array has been sorted.
		} else {
			
			int half = (first + last) / 2; //The place where the array is divided first
			mergeSort(inputArr, extra, first, half);
			mergeSort(inputArr, extra, half + 1, last);
		
			//Merging into the extra array and then copying the elements to the original array.
			int startoffirsthalf = first; 		//Index where the first half starts
			int startofsecondhalf = half + 1; 	//Index where the second half starts
			int startofMerge = first;			//Index where the merging starts
		
		
			while (startofMerge <= last) {
				
				//Check if first half has any elements
				if (startoffirsthalf > half) {
					while (startofsecondhalf <= last) {
						extra[startofMerge] = inputArr[startofsecondhalf];
						startofMerge++;
						startofsecondhalf++;
					}
				
				//Check if second half has any elements
				} else if (startofsecondhalf > last) {
					while (startoffirsthalf <= half) {
						extra[startofMerge] = inputArr[startoffirsthalf];
						startofMerge++;
						startoffirsthalf++;
					}
			
				//It seems that both half have elements
				} else {
					if (inputArr[startoffirsthalf] < inputArr[startofsecondhalf]) {
						extra[startofMerge] = inputArr[startoffirsthalf];
						startoffirsthalf++;
					} else {
						extra[startofMerge] = inputArr[startofsecondhalf];
						startofsecondhalf++;
					}
					startofMerge++;
				}
			}
		
			//Copying the result of the merge to the original array
			for (int i = first; i <= last; i++) {
				inputArr[i] = extra[i];
			}
			
		}
	}
}