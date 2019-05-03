package microsoftint;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		int i = 3;
	
	}
	
	static void howToCheckEqualityOfTwoArray(int[] array,int[] array2) {
		boolean isEqual = true;
		if(array.length == array2.length) {
			for(int i = 0; i <array.length; i++)  {
				if(array[i] !=array2[i]) 
					isEqual = false;
			}
		} else {
			isEqual = true;
		}
		if(isEqual) 
			System.out.println("equal");
		else 
			System.out.println("not");
	}
	
	static void anagram(String str1, String str2) {
		
		String newStr1 = str1.replaceAll("\\s", "");
		String newStr2 = str2.replaceAll("\\s", "");
		
		char[] charArray1 = newStr1.toLowerCase().toCharArray();
		char[] charArray2 = newStr2.toLowerCase().toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		
		if(Arrays.equals(charArray1, charArray2))
			System.out.println("true");
		else 
			System.out.println("false");		
	}
	
	static void amstrongNumber(int num) { 
		int temp = num;
		int ams = 0;
		while(num> 0) {
			int lastNum = num % 10;
			ams += (lastNum * lastNum* lastNum);
			num = num /10;
		}
		
		if(temp == ams)
			System.out.println("is amstrong");
		else 
			System.out.println("is not");	
	}
	
	
	static void duplicateElem(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j <array.length; j++) {
				
				if(array[i] == array[j]) {
					
					System.out.println(array[i]);
				}
			}
		}
		
	}
 	
	static void sumOfAllDigits(int num) {
		int sum = 0;
		
		while(num >0) {
			int lastNum = num % 10;
			num = num / 10;
			sum+= lastNum;
		}
		System.out.println(sum);
		
	}
	
	static void addMatrix() {
		int[][] array = { {22,33,11},{22,33,1},{22, 11,1} };
		int[][] array2 = { {22,33,11},{22,33,1},{22, 11,2} };
		
		int [][] c = new int[3][3]; 

		for(int i = 0; i <3; i++) {
			for(int j = 0; j <3; j++) {
				
				c[i][j] = array[i][j] + array2[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void secondLargesNum(int[] array) {
		int first = array[0];
		int second = array[1];
		
		for(int i = 0; i < array.length; i++) {
			
			if(first < array[i]) {
				second = first;
				first = array[i];
			} else if(second < array[i]) {
				second = array[i];
			}
		}
		System.out.println(second);	
	}
	
	
	static void findContinuousSubArray(int[] array, int inputNum) {
		int sum = array[0];
		
		int start = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			
			while(sum > inputNum && start <= i-1) {
				sum = sum - array[start];
				start++;
			}
			
			if(sum == inputNum) {
System.out.println("continuous sub array of:" + Arrays.toString(array));

				for(int j = start; j <=i;j++) {
					System.out.println(array[j]);
				}
			}
		}
		
	}
	
	static void findSubArray(int[] inputArray, int inputNumber) {
        int sum = inputArray[0];
        int start = 0;

        for (int i = 1; i < inputArray.length; i++)
        { 
            sum = sum + inputArray[i];
            while(sum > inputNumber && start <= i-1)
            { 
                sum = sum - inputArray[start]; 
                start++;
            }
 
            if(sum == inputNumber)
            {
                System.out.println("Continuous sub array of "+Arrays.toString(inputArray)+" whose sum is "+inputNumber+" is ");
 
                for (int j = start; j <= i; j++)
                {
                    System.out.print(inputArray[j]+" ");
                }
                
                System.out.println();
            }
        }
    }
	
	static void deleteDuplicateNumFromArray(int[] array) {
		
		int len = array.length;
		for(int i = 0; i < len; i++) {
			for(int j = i+1; j < len; j++) {
				if(array[i] == array[j]) {
					array[j] = array[len -1];
					len--;
					j--;
				}
			}
		}
		
		int[] newArray = Arrays.copyOf(array, len);
		System.out.println(Arrays.toString(newArray));
	}
	
	static void decimalToBinary(int num) {
		
		int[]  binary = new int[25];
		int index = 0;
		
		while(num > 0) {
			
			binary[index++]  = num % 2;
			num = num /2;	
		}
		
		for(int i = index-1; i >=0; i--) {
			System.out.print(binary[i]);
		}
		
	}
	
	static void binToDecimal(int binary) {
		
		int power = 0;
		int decimal = 0;
		
		while(true) {
			if(binary == 0) {
				break;
			} else {
				int lastNum = binary % 10;
				decimal += lastNum * Math.pow(2,power);
				binary = binary / 10;
				power++;
			}
		}
		
		System.out.println(decimal);
		
	}
	
	static void getContinuousSubArray(int[] inputArray, int num) {
		
		int sum = inputArray[0];
		
		int start = 0;
		
		for(int i = 1; i < inputArray.length; i++) {
			sum = sum + inputArray[i];
			
			while(sum> num && start <= i-1) {
				sum = sum - inputArray[start];
				start++;
			}
			
			if(sum == num) {
				System.out.println(Arrays.toString(inputArray));
				System.out.println();
				
				for(int j = start; j <= i; j++) {
					System.out.println(inputArray[j]);
				}
			}	
		}
	}
		
	static void separateZero(int [] array) {
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0) {
				array[count++] = array[i];
			}
		}
		
		while(array.length > count) {
			array[count++] = 0;
		}
		
		for(int i = 0; i < array.length; i++)
		System.out.print(array[i] + " ");
	}
	
	static void stringPermuation(String input) {
		stringPermuation("", input);
	}

	static void stringPermuation(String permutation, String input) {
		if(input.length() == 0) {
			System.out.println(permutation);
		}
		else {
			for(int i = 0; i < input.length(); i++) {
stringPermuation(permutation + input.charAt(i),
input.substring(0, i) + input.substring(i+1,input.length()));
			}
		}
	}
	
	
static void reverseContinuouseStringWithOutChangingSpaceOFWhiteSpace(String str) {
	
	char[]  charArray = str.toCharArray();
	
	char[] newCharArray = new char[charArray.length];
	
	for(int i = 0; i < charArray.length; i++) {
		if(charArray[i] == ' ') {
			newCharArray[i] = ' ';
		}
	}
	
	int j = newCharArray.length-1;
	
	for(int i = 0; i < charArray.length; i++) {
		if(charArray[i]  != ' ') {
			if(newCharArray[j] == ' ') {
				j--;
			}
			newCharArray[j]= charArray[i];
			j--;
		}
	}
	
	String string =new String(newCharArray);
	System.out.println(string);
}


static void perm(String input) {
	perm("", input);
}

static void perm(String con, String input) {
	
		if(input.length() == 0) {
			System.out.println(con);
		} 
		
		else {
			for(int i =0; i < input.length(); i++) {
				
	perm(con+ input.charAt(i)  , 
	input.substring(0, i) + input.substring(i+1,input.length()));
			}
	}
}

static String reverseArrayWithOutAffectingToSpecialChar(String str) {
	char[] charArray = str.toCharArray();
	int left =  0;
	int right = str.length()-1;
	
	while(left < right) {
		
		if(!Character.isAlphabetic(charArray[left])) {
			left++;
		} else if(!Character.isAlphabetic(charArray[right])) {
			right--;
		} else {
			char tmp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = tmp;
			left++;
			right--;
		}
	}
	
	String strnew = new String (charArray);
	return strnew;
}

static void countTriples(int[] array, int sum) {
	int tri =0;
	int len = array.length;
	for(int i = 0; i < len- 2; i++) {
		for(int j = i+1; j < len - 1; j++) {
			for(int k = j+1; k < len; k++) {
				if(array[i]+array[j]+array[k] <sum) {
					tri++;
				}
			}
		}
	}
	System.out.println(tri);
}

static void calculateEuclideanplusDistance(double[] array1, double[] array2) {
	if(array1 == null || array2 == null || (array1 == null && array2 ==null)) {
		throw new RuntimeException();
	}
	
	double sum = 0.0;
	if(array1.length == array2.length) {
		for(int i = 0; i < array1.length; i++) {
			sum = sum + Math.pow(array1[i] - array2[i], 2.0);
		}
		System.out.println("euclineans dictance: "+Math.sqrt(sum));
	}
}

static void deleteTheSameElementsInArray(int[] array) {
	int arrayLen = array.length;
	for(int i = 0; i < arrayLen; i++) {
		for(int j = i + 1; j <arrayLen; j++) {
			if(array[i] == array[j]) {
				array[i] = array[arrayLen-1];
				arrayLen--;
			}
		} 
	}
	
	int[] newArray = Arrays.copyOf(array, arrayLen);
	
	System.out.println(Arrays.toString(newArray));
}

static void reverseStringWithoutChangingWhiteSpacePlace() {
	
	String str ="Given a string, that contains special character"+
	"together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the "+
	"string in a way that special characters are not affected.";
	
	char[] charArray = str.toCharArray();
	
	char[] newArray = new char[charArray.length];
	
	for(int i = 0; i < charArray.length; i++) {
		if(charArray[i] == ' ') {
			newArray[i] = ' ';
		}
	}
	
	int j = charArray.length -1;
	
	for(int i = 0; i < charArray.length; i++) {
		if(charArray[i] != ' ') {
			if(charArray[j] == ' ') {
				j--;
			}
			newArray[j] = charArray[i];
			j--;
		}
	}
	
	System.out.println(Arrays.toString(newArray));
	System.out.println(new String(newArray));

}

static void reverseTheStringWithOutReversingTheSpecialCharacters() {
	
	String str1 ="Given a string, that contains special character"+
	"together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the "+
	"string in a way that special characters are not affected.";
	char[] str = str1.toCharArray();
	
	int l = 0;
	int r = str.length -1;
	
	while( l < r) {
		if(!Character.isAlphabetic(str[l])) {
			l++;
		} else if(!Character.isAlphabetic(str[r])) {
			r--;
		} else {
			char temp = str[l];
			str[l] = str[r];
			str[r] = temp;	
			l++;
			r--;
		}
	}
	System.out.println(new String(str));
	
}




	
}
