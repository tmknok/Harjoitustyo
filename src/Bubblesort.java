/**
 * Class for implementing bubblesort algorithm.
 * 
 */
public class Bubblesort {

	/**
	 * Method for using bubblesort to arrange elements in an array to increasing order.
	 * Takes an input array as a parameter and returns a sorted version of it.
	 * @param inputArr Array of int elements which will be sorted.
	 * @return Array of int elements that has the original array's elements in an increasing order.
	 */
	public static void bubbleSort(int[] inputArr) {
		
		int length = inputArr.length;
		boolean swapped;
		// kay taulukon lapi niin kauan kunnes ei enaa vaihdeta yhtatakaan perakkaista alkiota paittain
		do {
			swapped = false;
			for(int i=1; i < length; i++) {
				// vertaa kahta perakkaista alkiota toisiinsa, jos epajarjestyksessa -> vaihda paittan
				if(inputArr[i-1] > inputArr[i]) {
					int tmp = inputArr[i-1];
					inputArr[i-1] = inputArr[i];
					inputArr[i] = tmp;
					// tallennetaan tieto, etta on tapahtunut vaihdos
					swapped = true;
				}
			}
			length -= 1;
			
		} while (swapped);
	}
}