import java.util.ArrayList;


public class PermutationUsingList {
public static void main(String[] args) {
	decimalToBinary(3323);
}

static void printArrayList(ArrayList<String> list) {
	for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i) + " ");
	}
}

static ArrayList<String> getPermutation(String str) {

	if(str.length() == 0) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		return list;
	}
	
	char firstChar = str.charAt(0);
	String subStr = str.substring(1);
	
	ArrayList<String> prevResult = getPermutation(subStr);
	ArrayList<String> res = new ArrayList<>();
	
	for(String val: prevResult) {
		for(int i = 0; i <= val.length(); i++) {
			res.add(val.substring(0, i) + firstChar + val.substring(i));
		}
	}
	
	return res;
}

public static void printList(ArrayList<String> list) {
	for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i) + " ");
	}
}

static ArrayList<String> permutation(String str) {
	
	
	if(str.length() == 0) {
		ArrayList<String> empty = new ArrayList<>();
		empty.add("");
		
		return empty;
	}
	
	char firstChar = str.charAt(0);
	String sub = str.substring(1);
	
	ArrayList<String> prevResult = permutation(sub);
	ArrayList<String> result = new ArrayList<>();
	
	for(String val: prevResult) {
		for(int i = 0; i <= val.length(); i++) {
			result.add(val.substring(0, i) +firstChar + val.substring(i));
		}
	}
	return result;
}

static void reversingStringWithOutChangingPlacesOfSpecialChar(String str) {
	
	int left = 0, right = str.length() -1;
	
	char[] charArray = str.toCharArray();
	
	while(left < right) {
		if(!Character.isAlphabetic(charArray[left])) {
			left++;
		} else if(!Character.isAlphabetic(charArray[right])) {
			right--;
		} else {
			char tmp = charArray[left];
			charArray[left] =charArray[right];
			charArray[right] = tmp;
			left++;
			right--;
		}
	}
	String string =new String(charArray);
	System.out.println(string);
}

static void decimalToBinary(int num) {
	int[] binary = new int[25];
	int index = 0;
	
	while(num>0) {
		binary[index++] = num % 2;
		num = num / 2;
	}
	
	for(int i = index-1; i>=0; i--) {
		System.out.println(binary[i]); 
	}	
}

}
