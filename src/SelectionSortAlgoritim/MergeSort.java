package SelectionSortAlgoritim;

// merge sort over quick sort WHEN
// data is in linked list form, you need a stable sort, you have slow comoparison functions want to
// minimize the number of compasisions. 

public class MergeSort {
	
	// print array
	public static void printIntArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static <T extends Comparable<? super T>> void mergeSort(T[] inputArray) {
		
		// get the length of array in parameter
		int inputLength = inputArray.length;
		
		// check to see if array has been broken down to 1 element
		if(inputLength < 2) {
			return;
		}
		
		// mid point is equal to full size of the array cut in half
		int midIndex = inputLength/2;
		
		// left half of the array (sorted) midIndex is also equal to half the length of origonal array.
		T[] leftHalf = (T[]) new Comparable[midIndex];/*new int[midIndex];*/
		// right half of the array (unsorted) inputLength minus mid index gives us right part of array
		T[] rightHalf = (T[]) new Comparable[inputLength - midIndex]; /*new int[inputLength - midIndex];*/
		
		//populate the arrays : remember midIndex is also equal to leftHalf length
		for(int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}
		
		// populate right half of array : start from midIndex all the way to the end of inputLength
		for(int i = midIndex; i < inputLength; i ++) {
			rightHalf[i - midIndex] = inputArray[i];
		}
		
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		// merge sorted arrays 
		merge(inputArray, leftHalf, rightHalf);
	}
	
	// take in int arr, original input array left and right arry
	private static <T extends Comparable<? super T>> void merge(T[] inputArray, T[]leftHalf, T[]rightHalf) {
		
		// need length of arrays
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		// pointers for each my arrays
		int i = 0;
		int j = 0;
		int k = 0;
		
		// loop until we run out of elements in either array
		while(i < leftSize && j < rightSize) {
			// if left half element at i is smaller or equal to element in right half array.
			if(leftHalf[i].compareTo(rightHalf[j]) <= 0) {
				
				// new array at k index is equal to element in leftHalf index
				inputArray[k] = leftHalf[i];
				// increment i to check next index
				i++;
				// else right half was bigger then left half element
			}else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			// move on to the next element in our new sorted array kth index
			k++;
		}
		// add any elements leftover that were not sorted to end of array
		while (i < leftSize) {
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while (j < rightSize) {
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}
	}
	
//	public static void sort(int[] arr, int[] temp, int low, int high) {
//		
//		// base case when low array is less than high array keep dividing array
//		if(low < high) {
//			//
//			int mid = low + (high - low)/2;
//			
//			// sort the low array
//			sort(arr, temp, low, mid);
//			//sort the right array
//			sort(arr, temp, mid + 1, high);
//			
//			//mereg both arrays ain 
//			merge(arr, temp, low, mid, high);
//		}
//	}

//	public static void merge(int[] arr, int[] temp, int low, int mid, int high) {
//		
//		// this for loop copies all elements from low part of array to high part of array
//		// then it stores the elements in the temporary array.
//		for(int i = low; i <= high; i++) {
//			// temporary array elements become original array elements
//			temp[i] = arr[i];
//		}
//		
//		int i = low; // will traverse the left sorted sub array
//		int j = mid + 1; // will traverse the right sorted sub array
//		int k = low; // will merge both arrays into original array
//		
//		// make sure both arrays have elements in them
//		while(i <= mid && j <= high) {
//			
//			if(temp[i] <= temp[j]) {
//				arr[k] = temp[i];
//				i++;
//			} else {
//				arr[k] = temp[j];
//			}
//			k++;	
//		}
//		
//		while(i <= mid) {
//			arr[k] = temp[i];
//			k++;
//			i++;
//		}
//		
//	}

}
