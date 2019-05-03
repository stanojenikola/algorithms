package geekforgeeks;

import java.util.Arrays;

public class Test2 {
	
	public static void main(String[] args) {
		int[]  a = {33,4,1,21,13,9};
		 Arrays.sort(a);
		 decimalToInteger(22);
	}
	
	static int binarySearch(int[] array, int search) {
		int left = 0;
		int right = array.length-1;
		Arrays.sort(array);
		
		while(right >= left) {
			int mid = left +(right - left) /2;
			
			if(array[mid] == search) {
				return mid;
			}
			
			if(array[mid] < search) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		
		return -1;
	}
	//---------------------------------------
static void generateAndPrintAllSortedArrays(int[] a, int[] b, int[] c, int i,
		int j, int m, int n, int len, boolean flag) {
	//flag a
	if(flag) {
		if(len!= 0) {
			printArr(c,len + 1);
		}
		
		for(int k = i; k < m; k++) {
			if(len == 0) {
				c[len] = a[k];
generateAndPrintAllSortedArrays(a, b, c, k+1, j, m, n, len, !flag);
			} else if(a[k] > c[len]) {
				c[len + 1] = a[k];
generateAndPrintAllSortedArrays(a, b, c, k+1, j, m, n, len+1, !flag);
			}
		}
	}//flag b
	else {
		for(int l = j; l < n; l++) {
			if(c[len] < b[l]) {
				c[len+1] = b[l];
generateAndPrintAllSortedArrays(a, b, c, i, l+1, m, n, len+1, !flag);
			}
		}
	}
}

static void a(int[] a, int[] b, int m, int n) {
	int[] c = new int[m + n];
generateAndPrintAllSortedArrays(a, b, c, 0, 0, m, n, 0, true);
}

static void printArr(int arr[], int n) {
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
}

static int smallestIntegerInArray(int [] arr, int n)  {
	int res = 1;
	for(int i = 0; i <n && arr[i] <= res; i++) {
		res= res+arr[i];
	}
	return res;
}

static void decimalToInteger(int num) {
	int[] binary = new int[25];
	int index = 0;
	
	while(num>0) {
		binary[index++] = num %2;
		num = num/2;
	}
	for(int i = index-1; i>=0; i--) {
		System.out.print(binary[i]);
	}	
}




}
