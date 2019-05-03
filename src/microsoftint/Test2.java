package microsoftint;

import java.util.Arrays;

public class Test2 {
	
	public static void main(String[] args) {
	
		amstrongNumber(153);
	}
	
static void deleteDuplicate(int [] array) {
	int len = array.length;
	for(int i = 0; i < len; i++) {
		for(int j = i + 1; j < len; j++) {
			if(array[i] == array[j]) {
				array[i] = array[len-1];
				len--;
			}
		}
	}
	
	int[] arrayNew = Arrays.copyOf(array, len);
	System.out.println(Arrays.toString(arrayNew));
}
	
static int factoriatNumber(int num) {
	return num == 1 ? 1: num * factoriatNumber(num - 1);
}
	
static void reverseWordWithOutChangingPlaceOfWhiteSpace(String str) {
	char[] charArray = str.toCharArray();
	char[] newArray = new char[charArray.length];
	
	for(int i = 0; i < charArray.length; i++) {
		if(charArray[i] == ' ') {
			newArray[i] = ' ';
		}
	}
	
	int j = newArray.length-1;
	for(int i = 0; i < charArray.length; i++) {
		if(charArray[i] != ' ') {
			if(newArray[j] == ' ') {
				j--;
			}
			
			newArray[j] = charArray[i];
			j--; //2
		}
	}
	
	System.out.println(new String(newArray));
}

static void permutationOfString(String str) {
	permutationOfStringLogic("", str);
}

private static void permutationOfStringLogic(String con, String str) {
	
	if(str.isEmpty()) {
		System.out.println(con);
	} else {
		for(int i = 0; i < str.length(); i++) {
			permutationOfStringLogic(con + str.charAt(i) , 
					str.substring(0, i) + str.substring(i+1,str.length()));
		}
	}
}

static void pyramid(int numRow) {
	int count = 1;
	for(int i = numRow; i > 0; i--) {
		for(int j = 0; j < i; j++) {
			System.out.print(" ");
		}
		for(int x = 1; x <= count; x++) {
			System.out.print(count + " ");
		}
		count++;
		System.out.println(Math.PI);
	}
}

static void reverseEachWordInString(String str) {
	String[] strArray = str.split(" ");
	String finalString = "";
	for(int i = 0; i < strArray.length; i++) {
		String oneWord = strArray[i];
		
		String tmp = "";
		for(int j = oneWord.length() -1 ; j>=0; j--) {
			tmp = tmp + oneWord.charAt(j);
		}
		
		finalString = finalString + tmp +" ";
	}
	
	System.out.println(finalString);
}

static int leastCommonMultiple(int num1 , int num2) {
	for(int i = 0; i < 1000; i++) {
		if(i % num1 == 0 && i % num2 == 0) {
			return i;
		} 
	}
	return 1;

}
static int gcd(int a, int b) {
	if(a == 0) 
		return b;
	return gcd(b %  a, a);	
}

static int findGCD(int[] arr, int n) {
	int result = arr[0];
	
	for(int i = 0; i < n; i++) {
		result = gcd(arr[i], result);
	}
	return result;
}

static void isPrime(int num) {
	boolean prime = true;

	for(int i = 2; i< num/2; i++) {
		if(num %i ==0) {
			prime = false;
		}
	}
	if(prime) {
		System.out.println("is prime");
	} else {
		System.out.println("is not");
	}
}

static void fibonnaci(int num) {
	int i = 0;
	int a = 0, b=0, c=1;
	
	while(num>i) {
		a=b;
		b=c;
		c= a+b;
		System.out.println(a);
		i++;
	}
}

static void amstrongNumber(int num) {
	
	int tmp = num;
	int ams = 0;
	while(num >0) {
		int oneNum = num%10;
		ams+=(oneNum*oneNum*oneNum);
		num = num /10;
	}
	if(tmp == ams) {
		System.out.println("is ams");

	} else {
		System.out.println("is not ams");

	}
}

static void primeFactor(int num) {
	
	while(num%2==0) {
		System.out.print(2+ " ");

		num/=2;
	}
	
	for(int i = 3; i <= Math.sqrt(num); i+=2) {
		while(num%i ==0) {
			System.out.print(i+" ");
			num= num/i;
		}
	}	
}


}
