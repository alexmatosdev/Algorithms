public class MergeSort {
	public static int[] quickSort(int[] arr, int f, int l) {
		if (l > f) {
			int pi = partition(arr,f,l);
			quickSort(arr,f,pi-1);
			quickSort(arr,pi+1,l);
		}

		return arr;
	}

	// Finds numbers bigger and  smaller than pivot and swaps them
	private static int partition(int[] arr, int f, int l) {
		// TODO Auto-generated method stub
		int p = arr[f], li = f + 1, hi = l;
		while (hi > li) {
			while (li <= hi && arr[li] <= p)
				li++;
			while (li <= hi && arr[hi] > p)
				hi--;

			if (hi > li) {
			//Collections.swap(arr, arr[right], arr[left]);
			int t = arr[hi];
			arr[hi] = arr[li];
			arr[li] = t;
			}
		}
		while (hi > f && arr[hi] >= p)
			hi--;
		if (p > arr[hi]) {
			arr[f] = arr[hi];
			arr[hi] = p;
			return hi;
		}
		else {
			return f;
		}
	}
}
