
public class Algorithms {

	public static void quickSort(int[] table, int first, int last) {
		
		if(first < last) {
			int pivot = partition(table, first, last);
			quickSort(table, first, last-1);
			quickSort(table, first+1, last);
		}
		
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
}


