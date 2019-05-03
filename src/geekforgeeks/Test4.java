package geekforgeeks;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Test4 {
	
	 public static void main(String[] args) {
			Test4 newNodes = new Test4();
			newNodes.add(1);
			newNodes.add(5);
			newNodes.add(3);
			newNodes.add(2);
			newNodes.add(6);
			
			System.out.println(newNodes.minimumDepth());
			String str = "nikola!!abc";
			reverseArray(str, 0, str.length() -1);
			deleteDuplicateInArray(new int[] {33,33, 3, 11,2,32});
			allPolindrom("akz");
			reverseStringWithOutChangingSpaceOfCharacters("niko p");
			decimalToBinary2(66);
		}

	Node root;
	static class Node {
		Node left, right;
		int value;
		Node(int val){
			value = val;
			left = right = null;
		}
	 }


static void permutation(String input) {
	generatePermutation("", input);
	
}

static void generatePermutation(String con, String input) {
	
	if(input.isEmpty()) {
		System.out.println(con);
	} else {
		for(int i = 0; i < input.length(); i++) {
			generatePermutation(con + input.charAt(i),
				input.substring(0,i) + input.substring(i+1, input.length()));
		}
	}
	
}

static void deleteDuplicateElementInArray() {
	int array[]  = {11,322,33,12,11};
	int len = array.length;
	
	for(int i = 0; i < len; i++) {
		for(int j = i + 1; j < len; j++) {
			if(array[i] == array[j]) {
				array[j] = array[len - 1];
				len--;
			}
		}
	}
	
	int[] arrayNew = Arrays.copyOf(array, len);
	System.out.println(Arrays.toString(arrayNew));
}

static void reverseWordsWithOutChanging() {
	String str = " Before Java 8, interfaces could have "
			+ "only public abstract methods. It was not "
			+ "possible to add new functionality to the "
			+ "existing interface without forcing all "
			+ "implementing classes to create an implementation "
			+ "of the new methods,"
			+ " nor it was possible to create "
			+ "interface methods with an implementation.";
	
	char[]  charArray = str.toCharArray();
	char[]  newArray = new char[charArray.length];
	
	for(int i = 0; i < charArray.length; i++) {
		if(charArray[i] == ' ') {
			newArray[i] = ' ';
		}
	}
	
	int j = newArray.length -1;
	
	for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] != ' ') {
				if(newArray[j] == ' ') {
					j--;
				}
				newArray[j] = charArray[i];
				j--;
			}
	}
	System.out.println(Arrays.toString(newArray));
}

static void pyramid(int num) {
	int count = 1;
	
	for(int i = num; i > 0; i--) {
		for(int j = 0; j < i; j++) {
			System.out.print(" ");
		}
		for(int k = 0; k < count; k++) {
			System.out.print(count + " ");
		}
		
		count++;
		System.out.println();
	}
}

static int binarySearch(int [] array, int l, int r, int x) {
	
	while(r>=l) {
		
		int mid = l + (r - l) / 2;
		
		if(array[mid] == x) {
			return mid;
		} 
		
		if(array[mid] < x) {
			return binarySearch(array, mid +1, r, x);
		} else {
			return binarySearch(array, l, mid-1, x);
		}
	}
	
	return -1;
}

static void decimalToBinary(int num) {
	int[]  binary = new int[25];
	int index = 0;
	while(num > 0) {
	binary[index++] = num% 2;
	num = num /2;
	}
	
	for(int i = index -1; i >=0; i--) {
		System.out.print(binary[i]);
	}
}

static void binaryToDecimal(int bin) {
	int decimal = 0;
	int power = 0; 
	
	while(true) {
		if(bin == 0) {
			break;
	
		} else {
		int oneNum = bin %10;
		decimal += oneNum * Math.pow(2, power);
		bin = bin / 10;
		power++;
		}
	}
	
	System.out.println(decimal);
}

public static String LetterCapitalize(String str) { 
	  StringBuilder sb = new StringBuilder();
	  for(String word: str.toLowerCase().split("\\s")) {
		  char firstLetter = word.substring(0,1).charAt(0);
sb.append(firstLetter >= 'a'
&& firstLetter <='z'? (char)(firstLetter -32) :
	firstLetter).append(word.substring(1)).append(" ");
	  }
  
    return str;
    
  } 

public static String SimpleSymbols(String str) {
    int patternCount = 0;
    Matcher patternMatch = Pattern.compile("(?=(\\+[a-z]\\+))").matcher(str.toLowerCase());
    while (patternMatch.find()) {
        patternCount++;
    }
    int letterCount = 0;
    Matcher letterMatch = Pattern.compile("[a-z]").matcher(str.toLowerCase());
    while (letterMatch.find()) {
        letterCount++;
    }
    return String.valueOf(letterCount == patternCount);
}



public static String CheckNums(int num1, int num2) { 
    return (num1 == num2 ? "-1" :String.valueOf(num2 >num1));
} 

public static String TimeConvert(int num) {
    return (num / 60 + ":" + num % 60);
}

static String sortAlphabetSoup(String str) {
	char[] charArray = str.toCharArray();
	Arrays.sort(charArray);
	return new String(charArray);
}

 int minimumDepth() {
	return minimumDeepGen(root);
}
 int minimumDeepGen(Node root) {
	 if(root == null) {
		 return 0;
	 }
	 
	 if(root.left == null && root.right == null) {
		 return 1;
	 }
	 
	 
	 if(root.left == null) {
		 return minimumDeepGen(root.right) + 1;
	 }
	 
	 if(root.right == null) {
		 return minimumDeepGen(root.left) + 1;
	 }
	 
	 return Math.min(minimumDeepGen(root.left), 
			        minimumDeepGen(root.right) + 1);
 }
 
 public Node addGen(Node current, int value) {
	 if(current == null) {
		 return new Node(value);
	 } 
	 
	 if(current.value > value) {
		 current.left = addGen(current.left, value);
	 } else if(current.value < value) {
		 current.right = addGen(current.right, value);
	 } else {
		 return current;
	 }
	 
	return current; 
 }
 
 Test4 add(int val) {
	root = addGen(root, val);
	 return this;
 }
 
 class Res{
	 int val;
 }
 
 int findMaxUtil(Node node, Res res) {
	
	 if(node == null) {
		 return 0;
	 }
	 
	 int l = findMaxUtil(node.left, res);
	 int r = findMaxUtil(node.right, res);
	 
	 int max_single = Math.max(Math.max(l, r), node.value);
	 int max_top = Math.max(max_single, l+r + node.value);
	 
	 res.val = Math.max(res.val, max_top);
	 
	 return max_single;
 }
 
 void findMin() {
	 
 }
 

 static void reverseArray(String str, int l , int r) {
	char[] array = str.toCharArray();
	
	while(l <= r) {
		 
		 if(!Character.isAlphabetic(array[l])) {
			 l++;
		 } else if(!Character.isAlphabetic(array[r])) {
			 r--;
		 } else {
			 char tmp = array[l];
			 array[l] = array[r];
			 array[r] = tmp;
			 l++;
			 r--;
		 }
	 }
	
	System.out.println(Arrays.toString(array));
 }
 
 static void allPolindrom(String str) {
	 allPolindromGen("", str);
 }
 
 static void allPolindromGen(String con, String str) {
	 if(str.isEmpty()) {
		 System.out.println(con);
	 } else {
		 for(int i  = 0; i < str.length(); i++) {
			 
			 allPolindromGen(
				con+str.charAt(i), 
				str.substring(0, i) + 
				str.substring(i+1, str.length()));
		 }
	 }
 }
 
 static void deleteDuplicateInArray(int[] array) {
	 int l = array.length-1;
	for(int i = 0; i < l; i++) {
		for(int j = i + 1; j < l; j++) {
			if(array[i] == array[j]) {
				 array[i] = array[l--];
				 l--;
			}
		}
	}
	
	int[] newArray = Arrays.copyOf(array, l);
	System.out.println(Arrays.toString(newArray));
	
 }
 
 static void reverseStringWithOutChangingSpaceOfCharacters(String str) {
	 char[] charArray = str.toCharArray();
	 char[] newArray = new char[charArray.length];
	 
	 System.out.println(charArray.length);
	 
	 for(int i = 0; i < charArray.length; i++) {
		  if(charArray[i] == ' '){
			  newArray[i] =' ';
		  }
	 }
	 
	 int j = charArray.length -1;
	 
	 for(int i =0; i < charArray.length; i++) {
		if(charArray[i] != ' ') {
			if(newArray[j] == ' ') {
				j--;
			}
			
			newArray[j] = charArray[i];
			j--;
		}
	 }
	 
	 System.out.println(Arrays.toString(newArray));
	 
 }
 
 static void decimalToBinary2(int dec) {
	 int[] binary = new int[25];
	 int index = 0;
	 while(dec> 0) {
		 binary[index++] = dec %2;
		 dec = dec / 2;
	 }
	 for(int i = index -1; i>=0; i--) {
		 System.out.println(binary[i]);
	 }
 }
 Node2 head;
 class Node2
 { 
     int data; 
     Node2 next; 
     Node2(int d) {data = d; next = null; } 
 } 
 //ll
void sortedInsert(Node2 newNode) {
	Node2 current;
	if(head == null || head.data >= newNode.data) {
		newNode.next =head;
		head = newNode;
	} else {
		current = head;
		while(current.next != null && 
				current.next.data < newNode.data) {
			current = current.next;
			
			newNode.next = current.next;
			current.next = newNode;
		}
	}
}
 


}
