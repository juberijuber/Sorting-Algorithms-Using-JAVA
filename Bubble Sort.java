class Main {
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp;
		for(int i=0; i < n; i++) {
			for(int j=i+1; j <n; j++) {
				if(arr[i] > arr[j]) {
					//swap elements
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}
	public static void main(String[] args) {
		int arr[] = {15,20,9,1,22,11,9,8};

		System.out.println("Array Before Bubble Sort");
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		bubbleSort(arr);//sorting array elements using bubble sort

		System.out.println("Array After Bubble Sort");
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}