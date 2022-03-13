public static int[] mergeSort(int[] arr) {
		//int[]arr =Arrays.copyOf(ar, ar.length);
		int index = 0;
		if (arr.length > 1) {
			int[]fh = new int[arr.length/2];
			for (int i = 0; i < arr.length/2;i++)
				fh[i] = arr[i];
			mergeSort(fh);
			int[] sh = new int[arr.length - arr.length / 2];
			for (int i = arr.length/2; i < arr.length; i++) {
				sh[index] = arr[i];
				index++;
			}
			mergeSort(sh);
			merge(fh,sh,arr);
		}
		return arr;
	}

	// Merges the first and second half
	public static void merge(int[] fh, int[] sh, int[] arr) {
		// TODO Auto-generated method stub
		int i = 0, j = 0, t= 0, length = fh.length;
		while (i < length && j < length) {
			if (fh[i] < sh[j]) {
				arr[t] = fh[i]; t++; i++;
			} else {
				arr[t] = sh[j]; t++; j++;
			}
		}
		while (i < length) {
			arr[t] = fh[i]; t++; i++;
		}
		while (j < length) {
			arr[t] = sh[j]; t++; j++;
		}
	}
