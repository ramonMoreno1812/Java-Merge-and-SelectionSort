package SelectionSortAlgoritim;

public class MergeS {

	public static <T extends Comparable<? super T>> void mergeSort(T[] inputArray) {

		int inputLength = inputArray.length;

		if (inputLength < 2) {
			return;
		}

		int midIndex = inputLength / 2;

		@SuppressWarnings("unchecked")
		T[] leftHalf = (T[]) new Comparable[midIndex];
		
		T[] rightHalf = (T[]) new Comparable[inputLength - midIndex];

		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}

		for (int i = midIndex; i < inputLength; i++) {
			rightHalf[i - midIndex] = inputArray[i];
		}

		mergeSort(leftHalf);
		mergeSort(rightHalf);

		merge(inputArray, leftHalf, rightHalf);
	}

	private static <T extends Comparable<? super T>> void merge(T[] inputArray, T[] leftHalf, T[] rightHalf) {

		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < leftSize && j < rightSize) {

			if (leftHalf[i].compareTo(rightHalf[j]) <= 0) {

				inputArray[k] = leftHalf[i];
				i++;

			} else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}

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

}
