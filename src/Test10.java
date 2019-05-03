import java.util.Arrays;

public class Test10 {
	
public static void main(String[] args) {
	int [] array = {33,44,55,6,22,33};
	deleteDuplicateFromArray(array);
	reverseStringWithOutChangingWhiteSpace("nikola sta pe");
}

static void deleteDuplicateFromArray(int [] array) {
	int len = array.length;
	
	for(int i = 0; i <len; i++) {
		for(int j = i+1; j <len; j++) {
			if(array[i] == array[j]) {
				array[i] = array[len-1];
				len--;
			}
		}
	}
	
	int[] newArrays = Arrays.copyOf(array, len);
	System.out.println(Arrays.toString(newArrays));
}

static void reverseStringWithOutChangingWhiteSpace(String str) {
	char[] charArray = str.toCharArray();
	
	char[] newCharArray = new char[charArray.length];
	
	for(int i = 0; i < charArray.length; i++) {
		if(charArray[i] == ' ') {
			newCharArray[i] = ' ';
		}
	}
	
	int j = newCharArray.length -1;
	
	for(int i = 0 ; i <charArray.length; i++) {
		if(charArray[i] != ' ' ) {
			if(newCharArray[j] == ' ') {
				j--;
			}
			newCharArray[j] = charArray[i];
			j--;
		}
	}
	System.out.println(Arrays.toString(newCharArray));
}


}
