class Main {
	public static void main(String args[]) {
		int[] arr= {15,20,9,1,22,11,9,8};
		int n=arr.length;
		System.out.println("Before sort the Selection Sort");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		selection_sort(n,arr);
		System.out.println("After sort the Selection Sort");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}

	}
	public static void selection_sort(int n,int[] arr) {
		

		for(int i=0; i<n; i++) {
			int min=i;

			for(int j=i+1; j<n; j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}

			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;

		}
	}
}