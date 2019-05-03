package geekforgeeks;

import java.util.HashMap;


public class Geek1 {

	public static void main(String[] args) {
		
	int[] array = {33,331, 22,1};
		amstrongNumber(153);
		secondLargestNumber(array);
	}
	
	
static void reverseString(String str) {
	String reverse = "";
	for(int i = str.length() - 1 ; i >= 0; i--) {
		reverse = reverse +str.charAt(i);
		System.out.print(str.charAt(i));
	}
	System.out.println();

	System.out.println(reverse);
}

static void  pyramid(int row) {
	int count = 1;
	
	for(int i = row; i>0; i--) {
		for(int j = 0; j < i; j++) {
			System.out.print(" ");
		
		}
		for(int k = 1; k < count; k++) {
			System.out.print(count+ " ");
		}
		count++;
		System.out.println();
	}
}

static void findDuplicateCharacters(String str) {
	String strN = str.replaceAll("\\s", "");
	char[] charArray = strN.toCharArray();
	
	HashMap<Character, Integer> hashMap = new HashMap<>();
	
	for(int i = 0; i < charArray.length;i++) {
		if(hashMap.containsKey(charArray[i])) {
			int count = hashMap.get(charArray[i]);
			hashMap.put(charArray[i], count + 1);
			
		} else {
			hashMap.put(charArray[i], 1);
		}
	}
	System.out.println(hashMap);
}

static void equalityOfTwoArray(int[] array1 , int[] array2) {
	boolean isE = true;
	if(array1.length == array2.length) {
		for(int i = 0; i <array1.length; i++) {
			if(array1[i] != array2[i]) {
				isE = false;
			}
		}
	}
	if(isE) {
		System.out.println("true");
	}else 
		System.out.println("false");
}

static void amstrongNumber(int num) {
	int temp = num;
	int ams = 0;
	while(num>0) {
		int oneNum = num% 10;
		ams += (oneNum*oneNum*oneNum);
		num = num/10;
	}
	if(ams== temp)
		System.out.println("ams");
	else
		System.out.println("not ams");
}

static void duplicateInArray(int [] array) {
	for(int i = 0; i < array.length; i++) {
		for(int j = i + 1; j < array.length; j++) {
			if(array[i] == array[j]) {
				System.out.println(array[i]);
			}
		}
	}
}

static void secondLargestNumber(int[] array) {
	int first = array[0];
	int second = array[1];
	
	for(int i = 0; i < array.length; i++) {
		if(array[i] > first) {
			second = first;
			first = array[i];
		} else if(array[i] > second) {
			second  = array[i];
		}
	}
	System.out.println(second);
}



}


