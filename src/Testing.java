/**
 * Main class for testing all five algorithms. 
 *
 */
public class Testing {

	/**
	 * Main method for testing out the algorithm. Prints out the result after sort has finished.
	 */
	public static void main (String[] args) {
		
		//Initializing an array of int elements for testing and printing it out before trying the sorting algorithms. 
		int[] testarray = {6,17,44,66,2,1,90,400,5};
		for (int element: testarray){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		//Testing quicksort
		int[] result = Quicksort.quickSort(testarray, 0, testarray.length - 1);
		System.out.println("Testing quicksort and printing out sorted array: ");
		for (int element: result){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		//Testing bubblesort
		result = Quicksort.quickSort(testarray, 0, testarray.length - 1);
		System.out.println("Testing quicksort and printing out sorted array: ");
		for (int element: result){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		//Testing mergesort
		result = Quicksort.quickSort(testarray, 0, testarray.length - 1);
		System.out.println("Testing quicksort and printing out sorted array: ");
		for (int element: result){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		//Testing countingsort
		result = Countingsort.countingSort(testarray);
		System.out.println("Testing counting sort and printing out sorted array: ");
		for (int element: result){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		//Testing heapsort
		result = Heapsort.heapsort(testarray);
		System.out.println("Testing heapsort and printing out sorted array: ");
		for (int element: result){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
	}
}