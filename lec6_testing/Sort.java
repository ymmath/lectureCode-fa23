package lec6_testing;

public class Sort {
	/** Sort the strings in alphabetical order. */
	public static void sort(String[] x) {
		sort(x, 0);
	}

	/* Sorts the array starting at index start */
	private static void sort(String[] x, int start) {
		if (start >= x.length) {
			return;
		}
		int smallest = findSmallest(x, start);
		swap(x, start, smallest);
		sort(x, start + 1);
	}

	/** Returns index of smallest string. */
	public static int findSmallest(String[] x, int start) {
		int smallest = start;
		for (int i = start; i < x.length; i++) {
			if (x[smallest].compareTo(x[i]) > 0) {
				smallest = i;
			}
		}
		return smallest;
	}

	public static void swap(String[] input, int a, int b) {
		String temp = input[a];
		input[a] = input[b];
		input[b] = temp;
	}
}