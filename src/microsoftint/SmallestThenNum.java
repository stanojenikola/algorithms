package microsoftint;

import java.lang.invoke.ConstantCallSite;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SmallestThenNum {
	
	public static void main(String[] args) {
        int array[] = {1, 2, 223, 4, 15, 136, 7, 8}; 
        Arrays.sort(array);
        int len = array.length;
        int n = 7;
        
        wordsRotating("snikol je peder");
	}
	//-------------------------------------------------------
	static int findSmallestThenNumber(int arr[], int n, int x) 
    { 
          
        int l = 0, r = n - 1; 
        int result = 0; 
      
        while (l < r) 
        { 
              
            // If current left and current 
            // right have sum smaller than x, 
            // the all elements from l+1 to r 
            // form a pair with current l. 
            if (arr[l] + arr[r] < x) 
            { 
                result += (r - l); 
                l++; 
            } 
      
            // Move to smaller value 
            else
                r--; 
        } 
      
        return result; 
    } 
	//---------------------------------------------------------
	static int findSmalsest(int[] array, int num) {
		int sum = 0;
		for(int oneNum: array) {
			while(sum < num) {
				sum+=oneNum;
			}
		}
	
		return sum;
	}
	
	//-----------------------------------------------------------------------
	static int getFirstDigit(int x) {
		while(x >=10) 
			x/=10;
			return x;
	}
		
	
	static int	getCountWihtSameStartAndEndFrom1(int x) {
		if(x < 10) 
			return x;
		
		int tens = x/ 10;
		
		int res =tens+9;
		
		int firstDigits = getFirstDigit(x);
		int lastDigits = x %10;
		
		if(lastDigits < firstDigits)
			res--;
		
		return res;
	}
	
	public static int getCountWithSameStartAndEnd(int start, int end) {	
		return getCountWihtSameStartAndEndFrom1(end)-
				getCountWihtSameStartAndEndFrom1(start -1);
	}
	
	static void kLargest(Integer[] arr, int k) {
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i = 0; i< k; i++) {
			System.out.println(arr[i] +" ");
		}
	}
	
	static void reverseArrayWithOutAffectingToSpecialChar(String str) {
		char[] charArray = str.toCharArray();
		int lengthOFArray = charArray.length;
		
		int r = lengthOFArray-1, l=0;
		
		while(l<r) {
			if(!Character.isAlphabetic(charArray[l])) {
				l++;
			} else if(!Character.isAlphabetic(charArray[r])) {
				r--;
			}
			else {
				char tmp = charArray[l];
				charArray[l] = charArray[r];
				charArray[r] = tmp;
				l++;
				r--;
			}
			
		}
		String strNew = new String(charArray);

		System.out.println(strNew);

	}
	
	static void allPalPartitions(String input) {
		int n = input.length();
		
		ArrayList<ArrayList<String>> allPart = new ArrayList<>();
		Deque<String> currPart = new LinkedList<String>();
		
		
	}
	
	static void countTriplet(int arr[],int n, int sum) {
		int ans = 0;
		
		for(int i = 0; i < n-2; i++) {
			for(int j = i +1; j < n-1; j++) {
				for(int k = j+1; k < n; k++) {
					if(arr[i] + arr[j] + arr[k] < sum) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
	
	static int  binarySearch(int[] array, int l, int r, int x) {
		
		if(r >= l) {
			int mid = l + (r - l) / 2;
			
			if(array[mid] == x) 
				return mid;
			
			if(array[mid] < x) {
				return binarySearch(array, mid+1, r, x);
			}
			else {
				return binarySearch(array,l, mid-1,x);
			}
		}
		return -1;
	}
	
	static void reverseWordWord(String str) {
		
		String[] strArray = str.split(" ");
		
		for(int i = 0; i < strArray.length; i++) {
			
		}
		
	}
	
	static void selectionSorting(int[] array) {
		int tmp = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i +1; j < array.length; j++) {
				if(array[i] > array[j]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
//	static void generatePermutation(String str) {
//		List<String> strList = new ArrayList<>();
//		permutation("", str, strList);	
//	}
//	
//	static void permutation(String consChars, String input, List<String> list) {
//		if(input.isEmpty()) {
//			list.add(consChars + input);
//			return;
//		}
//		
//		for(int i = 0; i < input.length(); i++) {
//			permutation(consChars+input.charAt(i),
//					input.substring(0, i)+input.substring(i+1),
//					list);
//		}
//	}
	
	static void prime1000() {
		int num =2;
		int count = 0;
		int sum = 0;
		
		while(count < 1000) {
			if(isPrime(num)) {
				sum+= num;
				count++;
			}
			num++;
		}
		System.out.println(sum);
	}
	
	static  boolean isPrime(int num) {
		for(int i = 2; i < num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	static void generatePermutation(String str) {
		List<String> list = new ArrayList<>();
		permutation("", str, list);
		list.stream().forEach(System.out::println);
	}
	
	static void permutation(String constChar, String input, List<String> list) {
		if(input.isEmpty()) {
			list.add(constChar + input);
			return;
		}
		
		for(int i = 0; i < input.length(); i++) {
			
			permutation(constChar+input.charAt(i), 
					input.substring(0, i)+input.substring(i+1),list);
		}
	}
	
	static int binarySearch2(int[] array, int l, int r, int x) {
		if(r>=l) {
			int mid = l + (r-l)/2;
			
			if(array[mid] == x) {
				return mid;
			}
			
			if(array[mid] > x) {
				return	binarySearch2(array, l, mid-1, x);
			}  
			
				return binarySearch2(array, mid +1, r, x);
		}
		return -1;	
	}
	
	static void binaryToDecimal(int binary) {
		int power = 0;
		int decimal = 0;
		
		while(true) {
			if(binary == 0) {
				break;
			} else {
			
			int oneNum = binary % 10;
			decimal += oneNum * Math.pow(2, power);
			binary = binary / 10;
			power++;
			
			}
		}
		System.out.println(decimal);
	}
	
	static void decimalToBinary(int num) {
		if(num == 0) {
			System.out.println(" zero!");
		}
		
		int[] binary = new int[25];
		int index = 0;
		
		while(num > 0) {
			binary[index++] = num % 2;
			num = num /2;
		}
		
		for(int i = index -1; i>=0; i--) {
			System.out.print(binary[i]);
		}
	}
	
	static void vowelRemoving(String str) {
	String newString = str.replaceAll("[aeuioAEIOU]", "");
	}
	
	static void fibonacci(int num) {
		int count = 0;
		int a = 0, b = 0, c = 1;
		
		while(count < num) {
			a = b;
			b = c;
			c = a + b;
			count++;
			System.out.println(a);
		}
		
	}
	
	static void wordsRotating(String str) {
		
		String[] strArray = str.split(" ");
		String reverseFinal = "";
		
		for(int i = 0; i < strArray.length; i++) {
			String reverse = "";
			String word = strArray[i];
			
			for(int j = word.length() - 1; j>=0; j--) {
				reverse = reverse + word.charAt(j);
			}
			reverseFinal = reverseFinal +  reverse + " ";
		}
		
		System.out.println(reverseFinal);
	}
	
	
	
	
	
	
}
