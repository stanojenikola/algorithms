package geekforgeeks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Test1 {
	
	public static void main(String[] args) {
	     int arr[] = new int[]{5, 1, 3, 4, 7}; 
		sumOfTwoDimensionlArray();
		}
	
	
static void permutationOfString(String input) {
		
	generatePermutation("", input);
}

private static void generatePermutation(String con, String input) {
	
	if(input.isEmpty()) {
		System.out.println(con);
	}
	
	else {
		for(int i = 0; i <input.length(); i++) {
generatePermutation(con + input.charAt(i),
		
input.substring(0,i)+ input.substring(i+1,input.length()));
		}
	}
}
//-----------------------------------------------------------
static void allPalPartitions(String input) {
	int n = input.length();
	
	ArrayList<ArrayList<String>> allPart = new ArrayList<>();
	Deque<String> currPart = new LinkedList<String>();
	allPalPartitionUtil(allPart, currPart, 0, n, input);	
	
	for(int i = 0; i < allPart.size(); i++) {
		for(int j = 0; j < allPart.get(i).size(); j++) {
			System.out.print(allPart.get(i).get(j) + " ");
		}
		System.out.println();
	}
}

static void allPalPartitionUtil(ArrayList<ArrayList<String>> allPart,
		Deque<String> currPart, int start, int n, String input) {
	
	if(start >= n) {
		allPart.add(new ArrayList<>(currPart));
		return;
	}
 	
	for(int i = start; i < n; i++) {
		if(isPolindrom(input, start, i)) {
			currPart.addLast(input.substring(start, i+1));
			allPalPartitionUtil(allPart, currPart, start+1, n, input);
			currPart.removeLast();
		}
		
	}
}

static boolean isPolindrom(String input, int start, int end) {
	while(start < end) {
		if(input.charAt(start++) != input.charAt(end--)) {
			return false;
		}
	}
	return true;
}
//--------------------------------------------------


static void countTriepleSum(int[] array, int sum) {
	int len = array.length;
	int sumFinal =0;
	for(int i = 0; i < len-2; i++) {
		for(int j = i+1; j< len-1; j++) {
			for(int k = j+1; k < len; k++) {
				if(array[i] + array[j] + array[k] < sum) {
					sumFinal++;
					
				}
			}
		}
	}
	System.out.println(sumFinal);
}

static void swapAllOddBits() {
	
}

static void sumOfTwoDimensionlArray() {
	int[][] array = {{22,33,44},
					{2,1,5},
					{23,1,1}};
	int sum = 0;
	for(int i = 0; i < array.length; i++) {
		for(int j = 0; j < array.length; j++) {
				sum+=array[i][j];
			}
	}
	System.out.println(sum);
	
}




}
