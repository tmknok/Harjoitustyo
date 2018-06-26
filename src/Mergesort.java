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
	 * @return The sorted array.
	 */
	public static int[] mergeSort(int[] inputArr, int[] extra, int first, int last) {
		
		//Check if input array has only one element.
		//If so, no need for sorting, return original array.
		if (first >= last) { return inputArr; }
		
		//Check if input array has only two elements.
		//If so, just swap the elements into the right order, if necessary.
		if (first + 1 == last) {
			if (first > last) {
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
		int f = first; 		//Index where the first half starts
		int h = half + 1; 	//Index where the second half starts
		int l = first;		//Index where the merging starts
		
		
		while (l <= last) {
			
			//Check if first half has any elements
			if (f > half) {
				while (h <= last) {
					extra[l] = inputArr[h];
					l++;
					h++;
				}
			
			//Check if second half has any elements
			} else if (h > l) {
				while (f <= half) {
					extra[l] = inputArr[f];
					l++;
					f++;
				}
			
			//It seems that both half have elements
			} else {
				if (inputArr[f] > inputArr[h]) {
					extra[l] = inputArr[f];
					f++;
				} else {
					extra[l] = inputArr[h];
					h++;
				}
				l++;
			}
		}
		
		//Copying the result of the merge to the original array
		int index = 0;
		for (int element: extra) {
			inputArr[index] = element;
			index++;
		}
		
		}
		return extra;
	}
}