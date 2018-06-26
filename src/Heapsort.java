/**
 * Class for implementing heapsort algorithm.
 *
 */
public class Heapsort {
	
	/**
	 * Method for using heapsort algorithm to arrange elements in an array to increasing order.
	 * Takes an input array as a parameter and returns a sorted version of it.
	 * @param inputArr
	 * @return
	 */
    public static int[] heapsort (int inputArr[]) {
        int length = inputArr.length;
 
        // Build heap (rearrange array)
        for (int i = length/2 - 1; i >= 0; i--)
            heapify(inputArr, length, i);
 
        // One by one extract an element from heap
        for (int i=length-1; i>=0; i--)
        {
            // Move current root to end
            int temp = inputArr[0];
            inputArr[0] = inputArr[i];
            inputArr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(inputArr, i, 0);
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
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    private static void heapify(int arr[], int n, int i) {
    	
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
 
    /* A utility function to print array of size n */
    private static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}