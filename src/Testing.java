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
		
		Timer t = new Timer();
		
		
		System.out.println("Testing quicksort and printing out the sorted array:");
		//Start the timer
		t.start();
		//Testing quicksort
		Quicksort.quickSort(testarray, 0, testarray.length - 1);
		//End the timer
		t.stop();
		for(int element: testarray) {
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println("\nTime to sort the array with quicksort took " + t.getTime() + " ms");
		
		//-----------------------------------------------------------------------//
		
		//Initializing an array of int elements for testing and printing it out before trying the sorting algorithms. 
		int[] bubtest = {6,17,44,66,2,1,90,400,5};
		System.out.println("Printing out the test array:");
		for (int element: bubtest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		t.start();
		//Testing bubblesort
		Bubblesort.bubbleSort(bubtest);
		t.stop();
		System.out.println("Testing bubblesort and printing out sorted array: ");
		for (int element: bubtest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println("\nTime to sort the array with bubblesort took " + t.getTime() + " ms");
		
		//-----------------------------------------------------------------------//
		
		//Initializing an array of int elements for testing and printing it out before trying the sorting algorithms. 
		int[] mertest = {6,17,44,66,2,1,90,400,5};
		System.out.println("Printing out the test array:");
		for (int element: mertest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		t.start();
		//Testing mergesort
		Mergesort.mergeSort(mertest, new int[mertest.length], 0, mertest.length-1);
		t.stop();
		System.out.println("Testing mergesort and printing out sorted array: ");
		for (int element: mertest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println("\nTime to sort the array with mergesort took " + t.getTime() + " ms");
		
		//-----------------------------------------------------------------------//
		
		//Initializing an array of int elements for testing and printing it out before trying the sorting algorithms. 
		int[] countest = {6,17,44,66,2,1,90,400,5};
		System.out.println("Printing out the test array:");
		for (int element: countest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
		
		t.start();
		//Testing countingsort
		Countingsort.countingSort(countest);
		t.stop();
		System.out.println("Testing counting sort and printing out sorted array: ");
		for (int element: countest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println("\nTime to sort the array with counting sort took " + t.getTime() + " ms");
		
		//-----------------------------------------------------------------------//
		
		//Initializing an array of int elements for testing and printing it out before trying the sorting algorithms. 
		int[] heaptest = {6,17,44,66,2,1,90,400,5};
		System.out.println("Printing out the test array:");
		for (int element: heaptest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();

		t.start();
		//Testing heapsort
		Heapsort.heapsort(heaptest);
		t.stop();
		
		System.out.println("Testing heapsort and printing out sorted array: ");
		for (int element: heaptest){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println("\nTime to sort the array with heapsort took " + t.getTime() + " ms");
	}
}