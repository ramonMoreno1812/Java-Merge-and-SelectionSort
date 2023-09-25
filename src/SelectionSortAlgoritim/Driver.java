/*Main Driver class calls in both Merge Sort and Selection Sort, Merge sort code is commented out, but still works fine.
In this project I am reusing my arrays to be sorted in their respective classes (Merge and Selection)
where they will be sorted. In this project I also incorporated Generic methods so that they can take in arrays
of many types, print them, and finally sort them. The compareTo functions come from the Comparable interface which are extended
 to both my mergeSort and Selection sort methods to compare strings. */



package SelectionSortAlgoritim;

public class Driver {

	public static void main(String[] args) {
		
		// my int array
//		int arr[] = {15, 2, 54, 23, 54, 69, 1, 12, 30};
		
		// array of integers
		Integer myArray[] = {15, 2, 54, 23, 54, 69, 1, 12, 30, 25};
		// array of Strings
		String myStringArray[] = {"Zamatsu", "Ryu", "Samantha", "Choua", "Javier", "Santos", "Abraham", 
				"Beethoven", "Zedadiah", "Zeddikis", "Alan"};
		
		//print unsorted String array
		SelectionSort.printArray(myStringArray);
		System.out.println();
		//print unsorted int array
		SelectionSort.printArray(myArray);
		System.out.println();
		
		///// SELECTION SORT 
		// sorted both arrays
//		SelectionSort.sort(myArray);
//		SelectionSort.sort(myStringArray);
		
		//print both arrays
//		SelectionSort.printArray(myArray);
//		System.out.println();
//		SelectionSort.printArray(myStringArray);
//		System.out.println();
		//////////////// MERGE SORT ///////////////////////
		
		System.out.println("/////// MERGE SORT ////////");
		System.out.println();
		MergeSort.mergeSort(myArray);
		MergeSort.mergeSort(myStringArray);
		SelectionSort.printArray(myArray);
		System.out.println();
		SelectionSort.printArray(myStringArray);
		
		
	}
}
