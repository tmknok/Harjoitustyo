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
		System.out.println("Printing out the test array:");
		for (int element: testarray){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		//Testing quicksort
		System.out.println("Testing quicksort and printing out the sorted array:");
		Quicksort.quickSort(testarray, 0, testarray.length - 1);
		for(int element: testarray) {
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();		
		
		//-----------------------------------------------------------------------//
		
		//Initializing an array of int elements for testing and printing it out before trying the sorting algorithms. 
		int[] bubtest = {6,17,44,66,2,1,90,400,5};
		System.out.println("Printing out the test array:");
		for (int element: bubtest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		//Testing bubblesort
		Bubblesort.bubbleSort(bubtest);
		System.out.println("Testing bubblesort and printing out sorted array: ");
		for (int element: bubtest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		//-----------------------------------------------------------------------//
		
		//Initializing an array of int elements for testing and printing it out before trying the sorting algorithms. 
		int[] mertest = {6,17,44,66,2,1,90,400,5};
		System.out.println("Printing out the test array:");
		for (int element: mertest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		//Testing mergesort
		Mergesort.mergeSort(mertest, new int[mertest.length], 0, mertest.length-1);
		System.out.println("Testing mergesort and printing out sorted array: ");
		for (int element: mertest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		//-----------------------------------------------------------------------//
		
		//Initializing an array of int elements for testing and printing it out before trying the sorting algorithms. 
		int[] countest = {6,17,44,66,2,1,90,400,5};
		System.out.println("Printing out the test array:");
		for (int element: countest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		//Testing countingsort
		Countingsort.countingSort(countest);
		System.out.println("Testing counting sort and printing out sorted array: ");
		for (int element: countest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		//-----------------------------------------------------------------------//
		
		//Initializing an array of int elements for testing and printing it out before trying the sorting algorithms. 
		int[] heaptest = {6,17,44,66,2,1,90,400,5};
		System.out.println("Printing out the test array:");
		for (int element: heaptest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();

		//Testing heapsort
		Heapsort.heapsort(heaptest);
		System.out.println("Testing heapsort and printing out sorted array: ");
		for (int element: heaptest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
	}
}