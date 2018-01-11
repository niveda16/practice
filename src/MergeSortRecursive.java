import java.util.Scanner;

/**
 * 
 */

/**
 * @author is_2315
 *
 */
public class MergeSortRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner arr_size = new Scanner(System.in);
		System.out.println("Enter size of array");
        int num = arr_size.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter the " + num + " numbers");

        for (int i = 0 ; i < arr.length; i++ ) {
           arr[i] = arr_size.nextInt();
        }
		//int[] arr = new int[]{7,8,9,4,6,5,2,4,3,1,6,8,7,9,2,4,3,5,6};
		//int arr_size=arr.length;
		
        //creating object
		MergeSortRecursive arr_obj=new MergeSortRecursive();
		
		arr_obj.mergeSort(arr,0,num-1);
		arr_obj.printArr(arr,num);
		
	}

	private void printArr(int[] arr, int arr_size) {
		System.out.println("Sorted array - ");
		for(int i=0;i<arr_size;i++)
			System.out.print(" "+arr[i]);
		
	}

	private void merge(int arr[], int l, int m, int r)
	{
    int i, j, k;
    int n1 = m - l + 1;
    int n2 =  r - m;
    
    /* create temporary arrays */
    int left[]=new int[n1];
    int right[]=new int[n2];
    
    /* Copy data to temporary arrays */
    for(i = 0; i < n1; i++)
        left[i] = arr[l + i];
    for(j = 0; j < n2; j++)
       right[j] = arr[m + 1+ j];
    
    /* Compare and Merge the temporary arrays back into arr[l..r]*/
    i = 0; // Initial index of left subarray
    j = 0; // Initial index of right subarray
    k = l; // Initial index of merged subarray
    while(i < n1 && j < n2) {
       if(left[i] <= right[j]) {
          arr[k] = left[i];
          i++;
       }
       else {
          arr[k] = right[j];
          j++;
       }
    k++;
    }
    /* Copy elements of left array */
     while(i < n1) {
        arr[k] = left[i];
        i++;
        k++;
     }
     /* Copy elements of right array */
     while(j < n2) {
       arr[k] = right[j];
       j++;
       k++;
     }
}

/* l is for left index and r is right index of the sub-array of arr to be sorted*/
	private void mergeSort(int arr[], int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2;
			// recursively partition left and right halves
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			//sort the partitions
			merge(arr, l, m, r);
		}
	}
}// class