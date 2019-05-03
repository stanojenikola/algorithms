import java.util.Arrays;
import java.util.HashMap;

public class NewTest {
	
	public static void main(String[] args) {
		
		removeDuplicated("geekforgeeks");
	}

	static boolean checkIfArrayContainsTwoNumbersEqualToSum(int[] array, int sum) {
		
		Arrays.sort(array);
		
		int left = 0;
		int right = array.length-1;
		
		while(left < right) {
			if(array[left] + array[right] == sum) {
				return true;
			} else if(array[left] + array[right] < sum) {
				left++;
			} else {
				right--;
			}
		}
		return false;
	}
	
	static void printPermutationOfString(String str, String ans) {
		
		if(str.length() == 0) {
			System.out.println(ans+ " ");
			return;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			String ros = str.substring(0, i)+str.substring(i+1);
			
			printPermutationOfString(ros, ans+ch);
		}
 	}
	
	static void permutationS(String str, String ans) {
		if(str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i+1);
			
			permutationS(ros, ans +ch);
		}
	}
	
	
	
	
	static boolean checkIfArrayContainsTwoNumbersEqualToTheSum(int[] array, int sum) {
		Arrays.sort(array);
		int left = 0;
		int right = array.length-1;
		
		while(right > left) {
			if(array[left] + array[right] == sum) {
				return true;
			} else if(array[left] + array[right] < sum) {
				left++;
			} else {
				right--;
			}
		}
		return false;
	}
	
	static void getDuplicatOfTheString(String str) {
		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < charArray.length; i++) {
			if(hashMap.containsKey(charArray[i])) {
				int count = hashMap.get(charArray[i]);
				hashMap.put(charArray[i], count + 1);
				System.out.println(charArray[i]);
			} else {
				hashMap.put(charArray[i], 1);
			}
		}
		
		
	}
	
	
	static void removeDuplicated(String str) {
		
		char[] charArray = str.toCharArray();
		
		int lengthoFcHAR = charArray.length;
		
		for(int i = 0; i < lengthoFcHAR; i++) {
			for(int j = i +1; j < lengthoFcHAR; j++) {
				if(charArray[i] == charArray[j]) {
					charArray[j] = charArray[lengthoFcHAR -1];
					lengthoFcHAR--;
					j--;
				}
			}
		}
		
		char[] charNew =Arrays.copyOf(charArray, lengthoFcHAR);
		
		String string = new String(charNew);
		System.out.println(string);
	}
	
	
	
		
	
}
