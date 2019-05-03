package geekforgeeks;

import java.util.Arrays;
import java.util.Random;

public class Test3 {
public static void main(String[] args) {
	String str = "nikol!!!a";
	int len = str.length();
Test3 t = new Test3();
t.mmainn();

	
}

static void permutation(String input) {
	permutationOfString("", input);
}

static void permutationOfString(String con, String input) {
	if(input.isEmpty()) {
		System.out.println(con);
	} else {
		for(int i = 0; i < input.length(); i++) {
		permutationOfString(con+input.charAt(i),
input.substring(0,i) + input.substring(i+1, input.length()));
		}
	}
}

static void deleteDuplicateElementInArray(int[] array) {
int len = array.length;
	for(int i = 0; i< len; i++) {
		for(int j = i+1; j <len; j++) {
			if(array[i] == array[j]) {
				array[i] = array[len-1];
				len--;
			}
		}
	}
	
	int[] newArray = Arrays.copyOf(array, len);
	System.out.println(Arrays.toString(newArray));
}

static void reverseWithOutChangingWhiteSpace() {
	String str = "nikola sstr b ccess";
	char[] charArray = str.toCharArray();
	char[] newCharArray = new char[charArray.length];
	
	for(int i = 0; i < charArray.length;i++) {
		if(charArray[i] == ' ') {
			newCharArray[i] = ' ';
		}
	}
	
	int j = newCharArray.length-1;
	
	for(int i = 0; i< charArray.length; i++) {
		if(charArray[i] != ' ') {
			if(newCharArray[j] == ' ') {
				j--;
			}
			newCharArray[j]= charArray[i];
			j--;
		}
	}
System.out.println(new String(newCharArray));
}

static int binarySearch(int [] num, int l , int r, int x) {
	if(r >= l) {
		int mid = l + (r - l)/2;
		
		if(num[mid] == x) {
			return mid;
		}
		
		if(num[mid] > x) {
			binarySearch(num, l, mid-1, x);
		} 
		
		return binarySearch(num, mid+1, r, x);	
	}
	
	return -1;
}

static void reverseWithOutChangingSpaceOfSpecialChar( String str, int l, int r) {
	char[] charArray = str.toCharArray();
	while(r >= l) {
		
		if(!Character.isAlphabetic(charArray[l])) {
			l++;
		} else if(!Character.isAlphabetic(charArray[r])) {
			r--;
		} else {
			char temp = charArray[l];
			charArray[l] = charArray[r];
			charArray[r] = temp;
			l++;
			r--;
		}
	}
	
	System.out.println(new String(charArray));
}

void mmainn() {

    A a1 = new A();
    A a2 = new A();

    System.out.println(a1 == a2);
    System.out.println(a1.equals(a2));
}
public class A {
}






}
