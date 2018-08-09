
public class Quicksort {
	int partition(int a[], int l, int r) {
		int pivot = a[r];
		int i = l - 1;

		for (int j = l; j < r; j++) {
			if (a[j] < pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[r];
		a[r] = temp;

		return i + 1;
	}

	void Qsort(int a[], int l, int r) {
		if (l < r) {
			int part = partition(a, l, r);

			Qsort(a, l, part - 1);
			Qsort(a, part + 1, r);
		}
	}

	public static void main(String args[]) {
		int array[] = { 2, 4, 6, 7, 8, 5,-1,3,10,-3,9 };
		
		int r = array.length;

		Quicksort sorting = new Quicksort();
		sorting.Qsort(array, 0, r - 1);

		System.out.println("THE SORTED ARRAY IS::");
		for (int i = 0; i < r; i++) {
			System.out.print(array[i]);
			System.out.println();
		}
	}
}
