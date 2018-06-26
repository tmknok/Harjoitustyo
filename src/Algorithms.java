/*
 * Class for all five sorting algorithms:
 * Quicksort, 
 */
public class Algorithms {

	/**
	 * Method for using quicksort algorithm to sort an array to an increasing order. Takes an array
	 * as a parameter and then sorts the array and returns
	 * a new array element that has the original array's elements in a sorted order.
	 * @param table Table consisting of int elements which need to be sorted.
	 * @param first First element in the array (table). 
	 * @param last Last element in the array (table);
	 * @return Sorted array.
	 */
	public static int[] quickSort (int[] table, int first, int last) {
		int[] result = new int[table.length];
		if (first < last) {
			int pivot = partition(table, first, last);
			quickSort(table, first, last-1);
			quickSort(table, first+1, last);
		}
		for (int i = result.length - 1; i >= 0; i--) {
			result[[table[i]] - 1] = table[i];
			result[table[i]]--;
		}
		return result;
	}
	
	public static int partition(int[] table, int first, int last) {
		
		int pivot = table[last];
		int i = first - 1;
		
		for (int j = first; j < last; j++) {
			if (table[j] <= pivot) {
				i++;
				int tmp = table[j];
				table[j] = table[i];
				table[i] = tmp;
			}
		}
		
		int tmp = table[i+1];
		table[i+1]=table[last];
		table[last]=tmp;
		
		return i+1;
		
	}
	
	public static void bubbleSort(int[] table) {
		
		int l = table.length;
		
		for (int pass = 0; pass < l; pass++) {
			for (int i = 0; i < l; i++) {
				if (table[i] > table[i+1]) {
					int tmp = table[i];
					table[i] = table[i+1];
					table[i+1] = tmp;
				}
			}
		}
	}
	
	public static int[] countingSort(int[] table) {
		
		int max = 0;
		
		for (int i = 0; i < table.length; i++) {
			if (max < table[i]) {
				max = table[i];
			}
		}
		
		int[] b = new int[max+1];
		
		for (int i = 0; i < table.length; i++) {
			b[table[i]]++;
		}
		
		for (int i = 1; i < b.length; i++) {
			b[i] += b[i-1];
		}
		
		int[] result = new int[table.length];
		
		for (int i = table.length; i >= 0; i--) {
			result[b[table[i]]-1] = table[i];
		}
		
		return result;
	}
	
	public static void mergeSort(int[] table, int[] extra, int first, int last) {
		
		if (first >= last) {
			
		} else if (first + 1 == last) {
			if (first > last) {
				int tmp = table[first];
				table[first] = table[last];
				table[last] = tmp;
				
			}
		} else {
			int half = (first+last)/2;
			mergeSort(table, extra, first, half);
			mergeSort(table, extra, half+1, last);
		
		
		int f = first;
		int h = half + 1;
		int l = first;
		
		
		while (l <= last) {
			
			if (f > half) {
				while (h <= last) {
					extra[l] = table[h];
					l++;
					h++;
				}
			} else if (h > l) {
				while (f <= half) {
					extra[l] = table[f];
					l++;
					f++;
				}
			} else {
				if (table[f] > table[h]) {
					extra[l] = table[f];
					f++;
				} else {
					extra[l] = table[h];
					h++;
				}
				l++;
			}
		}
		}
		
		
		
	}
}


