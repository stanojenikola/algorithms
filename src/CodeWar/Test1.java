package CodeWar;

import java.util.Arrays;
import java.util.HashMap;


public class Test1 {
	
	public static void main(String[] args) {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	System.out.println(WhoIsNext3(names, 20));
	
	}
	static int maxSubArray(int [] arr) {
		 int max = Integer.MIN_VALUE, max_ending_here = 0;
		 
		 for(int i = 0; i < arr.length; i++) {
			 max_ending_here = max_ending_here +arr[i];
			 System.out.println(max_ending_here);
			 
			 if(max < max_ending_here) {
				 max = max_ending_here;
			 }
			 
			 if(max_ending_here < 0) {
				 max_ending_here = 0;
			 }
		 }
		 return max;
	 }
	
	public static String order(String word) {
		String[] strArray = word.split(" ");
		char [] numbers = {'1','2','3','4','5','6','7','8','9'};
		String str = "";
		
		if(word.isEmpty()) {
			str = "";
		} else {
			for(int i = 0; i < numbers.length; i++) {
				for(int j = 0; j < strArray.length; j++) {
					char [] charArray = strArray[j].toCharArray();
					for(int k = 0; k < charArray.length; k++) {
						if(charArray[k] == numbers[i]) {
							String oneWord= new String(charArray);
							str = str + oneWord +" ";	
							}
					}
				}
			}
			
			if(str.charAt(str.length()-1) == ' ') {
				str = str.substring(0, str.length()-1);
			}
		}
		
		return str;		
	}
	
	public static String toJadenCase(String phrase) {
		String[] pharasesArray = phrase.split(" ");
		String newString = "";
		
		if(!phrase.isEmpty()) {
			for(int i = 0; i < pharasesArray.length; i++) {
				String oneWord = 
		pharasesArray[i].substring(0, 1).toUpperCase()
		+pharasesArray[i].substring(1, pharasesArray[i].length());
				newString = newString + oneWord +" ";
				
			}
			newString = newString.substring(0, newString.length()-1);
		}else{
			newString = "";
		}
		
		return newString;
	}


	public static int countThVowelInSentence(String str) {
		char[] charArray = str.toCharArray();
		int counter= 0;
		for(int i = 0; i <charArray.length; i++) {
			if(		charArray[i] == 'a' ||
					charArray[i] == 'o' || 
					charArray[i] == 'u' || 
					charArray[i] == 'e' || 
					charArray[i] == 'i')
			{
				
				counter++;
			}
		}
		return counter;
	}
	
	public static String countTheLongesWordInString(String str) {
		String[] strArray = str.split(" ");
		String firstWord = strArray[0];
		
		for(int i = 0; i< strArray.length; i++) {
			if(strArray[i].length() > firstWord.length()) {
				firstWord = strArray[i];
			}
		}
		
		return firstWord;
	}
	
	public static void sortOnliyEvenNumber(int[] array) {
		
		for(int i =0; i< array.length; i++) {
			
			if(array[i] % 2 !=0)
				continue;
			
			for(int j = i+1; j < array.length; j++) {
				
				if(array[i] %2 ==0) {
					
					if(array[i] > array[j]) {
							int tmp = array[i];
							array[i] = array[j];
							array[j] = tmp;
					}
				}
			}			
		}
		
		System.out.println(Arrays.toString(array));

	}
	
	static void evenSorting(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			//odd
			if(array[i] %2 != 0) 
				continue;
			
			for(int j = i +1 ; j <array.length; j++) {
				if(array[i] % 2 ==0) {
					if(array[i] > array[j]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
public static String createPhoneNumber(int[] numbers) {
		    // Your code here! 10 num
		 //returns "(123) 456-7890"
		 //123456788
	StringBuilder sb = new StringBuilder();
	for(int i =0; i< numbers.length; i++) {
		sb.append(numbers[i]);
	}
	String str = sb.toString();
	System.out.println(str);
	String newString = "(" + str.substring(0, 3) +") "
	+str.substring(3,6)+ "-"+ str.substring(6, 10);
	//first number is beginning, its not  used
 return newString;
}

public static String spinWords(String sentence) {
    String[] strArray = sentence.split(" ");
    String finaleString = "";
    
    for(int i =0; i <strArray.length; i++) {
    	String oneWord = strArray[i];
    	String localReverse = "";
    	
    	if(oneWord.length() >=5) {
    		for(int j = oneWord.length() -1; j>=0; j--) {
    			localReverse = localReverse + oneWord.charAt(j);
    		}
    	} else {
    		// if is now greater than 5
    		localReverse= oneWord;
    	}
    	
    	finaleString = finaleString + localReverse +" ";
    	
    }
    
    if(finaleString.charAt(finaleString.length()-1) == ' ') {
    	finaleString = finaleString.substring(0, finaleString.length()-1);
    }
	return finaleString;

  }

 public static double evoluate(String expr) {
		
	 String firstNumber = expr.substring(0, 1);
	 String secondNumber = expr.substring(2,3);
	 String operator = expr.substring(4,5);
	 
	
	 double a = Integer.parseInt(firstNumber);
	 double b = Integer.parseInt(secondNumber);
	 double solution = 0.0;
	 if(expr.isEmpty()) {
		 return 0;
	 }else {
		 if(operator.contains("+")) {
			 solution = a + b;
		 } else if(operator.contains("-")) {
			 solution = a-b;
		 } else if(operator.contains("*")) {
			 solution = a*b;
		 } else if(operator.contains("/")) {
			 solution = a/b;
		 }
		 
		 return solution;
	 }
 }
 
 static int sequence(int a[]) {
	 int size= a.length;
	 
	 int max = Integer.MIN_VALUE, max_ending_here = 0;
	 int negativValue = 0;
	 for(int i = 0; i <size; i++) {
		 if(a[i] < 0) {
			 negativValue++;
		 } 
	 }
	 
	 if(negativValue == size) {
		 max =  0;
	 } else {
	 
	 for(int i = 0; i < size; i++) {
		 max_ending_here = max_ending_here + a[i];
		 
		 if(max < max_ending_here) {
			 max = max_ending_here;
		 }
		 if(max_ending_here < 0) {
			 max_ending_here = 0;
		 }
	 }
	 }
	 return max;
 }

 public static int TripleDouble(long num1, long num2) {
	 String str1 = Long.toString(num1);
	 String str2 = Long.toString(num2);
	 
	 for(int i = 0; i < str1.length(); i++) {
		 if(str1.length() -i < 3) {
			 return 0;
		 }
		 
		 if(str1.substring(i, i+1).equals(str1.substring(i+1,i+2))&& str1.substring(i, i+1).equals(str1.substring(i+2,i+3))) {	 
			 if(checkSecond(num2, str1.substring(i,i+1))) {
				 return 1;
			 }
		 }

	 }
	return 0;
 }
 
public static boolean checkSecond(long num2, String target) {
	String str1 = Long.toString(num2);
	
	int count = 0; 
	
	for(int i = 0; i < str1.length(); i++) {
		if(str1.substring(i, i+1).equals(target)) {
			count++;
		}
	}
	
	if(count >=2) {
		return true;
	}else {
		return false;
	}
	
}
 
public static int TripleDouble2(long num1, long num2) {
    
    if ((num1 + "").matches(".*(\\d)\\1{2,}.*") && (num2 + "").matches(".*(\\d)\\1{1,}.*")) {
      return 1;
    } else {
      return 0;
    }
  }

//1294
public static String solution(int num) {
	System.out.println("Number is :" +num);
	System.out.println("And roman number is:" +num);

	int numberM = num /1000; //1
	int numberD = (num%1000)/500;//0
	int numberC = ((num%1000)%500)/100;//2
	int numberL = ((((num%1000)%500) % 100) /50);//1
	int numberX = ((((num%1000)%500) % 100) %50) /10;//4
	int numberV = (((((num%1000)%500) % 100) %50) %10)/5; //0
	int numberI = ((((((num%1000)%500) % 100) %50) %10)%5)/1;//4
	String str ="";
	
	str = str + printLater(numberM, "M");
	str= str+ printLater(numberD, "D");
	str= str+ printLater(numberC, "C");
	str= str+ printLater(numberL, "L");
	str= str+ printLater(numberX, "X");
	str= str+ printLater(numberV, "V");
	str= str+ printLater(numberI, "I");
	return str;	
}

static String printLater(int num, String later) {
	String finalString = "";
	if(num > 0) {
		for(int i = 0; i< num; i++) {
			finalString = finalString + later;
		}
	}
	return finalString;
}
 
enum Numeral {
    I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);
    int weight;

    Numeral(int weight) {
        this.weight = weight;
    }
};

public static String roman(long n) {

    if( n <= 0) {
        throw new IllegalArgumentException();
    }

    StringBuilder buf = new StringBuilder();

    final Numeral[] values = Numeral.values();
    for (int i = values.length - 1; i >= 0; i--) {
        while (n >= values[i].weight) {
            buf.append(values[i]);
            n -= values[i].weight;
        }
    }
    return buf.toString();
}
 
public String solution2(int number) {
    String romanNumbers[] = {"M", "CMXC", "CM", "D", "CDXC", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    StringBuilder result = new StringBuilder();
    int i = 0;
    while (number > 0 || arab.length == (i - 1)) {
        while ((number - arab[i]) >= 0) {
            number -= arab[i];
            result.append(romanNumbers[i]);
        }
        i++;
    }
    return result.toString();
}

enum RomanNumbers{
    I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);

	int weight;
	
	 RomanNumbers(int w) {
		 weight = w;
	}
}

public String romanNumberTest(int num) {
	
	if(num<0) {
		throw new NullPointerException();
	}
	StringBuilder sb = new StringBuilder();
	RomanNumbers[] romanValue = RomanNumbers.values();
	
	for(int i = romanValue.length -1; i>=0;i--) {
		while(num >= romanValue[i].weight){
			sb.append(romanValue[i]);
			num-= romanValue[i].weight;
		}
	}
	
	return sb.toString();
}

public static int zeros(int n) {
	int factoriat = 1;
  
	for(int i = n;i>0; i--){
	  factoriat*=i;
    }
	String num = Integer.toString(factoriat);
	int count = 0;
	while(count< num.length() && num.charAt(num.length()-1 - count) == '0') {
		count++;
	}

   return count;
}

public static String WhoIsNext(String[] names, int n){
  HashMap<Integer,String> hashMap = new HashMap<>();
//sheldon,sheldon,leonard,leonard,penny,penny,rajesh,howard
  
  for(int i = 1; i<= n; i++){
	  if(i==1 || i== 2){
	 hashMap.put(i, "Sheldon");
	 } else if(i % 9 ==0 || i % 10 ==0) {
		 hashMap.put(i, "Sheldon");
	 } else if(i % 8 == 0) {
		 hashMap.put(i, "Howard");
	 } else if(i % 7 ==0) {
		 hashMap.put(i, "Rejesh");
	 } else if(i % 5 ==0 || i % 6==0) {
		 hashMap.put(i, "Panny"); 	 
	 } else if(i % 3 ==0 || i % 4 == 0 || i==11 || i ==12) {
		 hashMap.put(i, "Leonard");
	 } 
	  
  }
  String finalString ="";
  System.out.println(hashMap);
return "";
}

public static String WhoIsNext2(String[] names, int n) {
    int length = names.length;
    int[] counts = new int[length];
    
    Arrays.fill(counts, 1);
    for (int i = 0; ; counts[i] <<= 1, i = (i + 1) % length) {
      n -= counts[i];
      if (n <= 0) {
        return names[i];
      }
    }
  }

public static void fill(int[] a, int val) {
    for (int i = 0, len = a.length; i < len; i++)
        a[i] = val;
}

public static String WhoIsNext3(String[] names, int n){
    while ( n > names.length){
      n = (n - (names.length - 1)) / 2;
      System.out.println(n);
    }
    return names[n-1];
  }
}


