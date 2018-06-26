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
		
		if (first >= last) {
			
		} else if (first + 1 == last) {
			if (first > last) {
				int tmp = inputArr[first];
				inputArr[first] = inputArr[last];
				inputArr[last] = tmp;
				
			}
		} else {
			int half = (first+last)/2;
			mergeSort(inputArr, extra, first, half);
			mergeSort(inputArr, extra, half+1, last);
		
		
		int f = first;
		int h = half + 1;
		int l = first;
		
		
		while (l <= last) {
			
			if (f > half) {
				while (h <= last) {
					extra[l] = inputArr[h];
					l++;
					h++;
				}
			} else if (h > l) {
				while (f <= half) {
					extra[l] = inputArr[f];
					l++;
					f++;
				}
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
		
		for (int i = first; first < last+1; first++) {
			inputArr[i] = extra[i];
		}
		
		}
		
	}
}