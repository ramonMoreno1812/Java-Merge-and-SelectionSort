package SelectionSortAlgoritim;


public class SelectionSort {
	
	// print a generic array T is convention used for generic types
	public static <T> void printArray(T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	
	public static <T extends Comparable<? super T>> void sort(T[] arr) {
		
		// create int n to hold arr length
		int n = arr.length;
		
		// i will keep track of sorted and unsorted arrays
		// first loop all elems will be part of unsorted part so i = 0;
		for(int i = 0; i < n -1; i ++) {
			int min = i;
			
			for(int j = i +1; j < n; j++) {
				
				if(arr[j].compareTo(arr[min]) < 0) {
					min = j;
				}
			}
			T temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
	}

}
