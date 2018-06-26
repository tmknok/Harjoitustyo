import java.util.Random;

/**
 * Main class for testing all five algorithms. 
 *
 */
public class Testing {

	private static int[] quicktest, bubtest, countest, mergetest, heaptest;
	
	
	/**
	 * Main method for testing out the algorithm. Prints out the result after sort has finished.
	 */
	public static void main (String[] args) {
		
		//Initializing an array of int elements for testing and printing it out before trying the sorting algorithms. 
		randomize(100);
		
//		System.out.println("Printing out the test array:");
//		for (int element: qui){
//			System.out.print(element);
//			System.out.print(" ");
//		}
//		System.out.println();
		
		Timer t = new Timer();
		
		
		System.out.println("Testing quicksort and printing out the sorted array:");
		Quicksort.quickSort(quicktest, 0, quicktest.length - 1);

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
	
	/**
	 * Method for creating a randomized int[] array. 
	 * Int values will be randomly generated between values 0-99.
	 * @param The size of the array.
	 */
	private static void randomize(int size) {
		
		Random r = new Random(); 
		quicktest = new int[size]; 
		bubtest = new int[size]; 
		countest = new int[size];
		mergetest = new int[size]; 
		heaptest = new int[size];
		
		for (int i = 0; i < size; i++) {
			quicktest[i] = r.nextInt(100); 
			bubtest[i] = quicktest[i]; 
			countest[i] = quicktest[i]; 
			mergetest[i] = quicktest[i]; 
			heaptest[i] = quicktest[i]; 
			System.out.print(quicktest[i]);
			System.out.print(","); 
		}
		System.out.print("\n");
	}
}