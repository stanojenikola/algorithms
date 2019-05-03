package CoderByte;

import java.util.Arrays;

public class KarperkarsConstant {

	public static void main(String[] args) {
		longestWord();
		fristReverse("string");
	}
	  public static int KaprekarsConstant(int num) { 
		  int tmp = num;
		  int tmp2 = num;
	
		  if(num == 6174) {
			  return 0;
		  }
		       int index = 0;
		       int n =0;
		       
		       while(num > 0) {
		            index++;
		             num = num /10;
		       }
		       
		       int[] array = new int[index];
		       
		       while(tmp2>0){
		           int oneNum = tmp2% 10;
		           array[n++] = oneNum;
		           tmp2 =	tmp2/ 10;
		       }
		       
		       for(int i = 0; i < array.length; i++) {
		           for(int j = i + 1; j < array.length; j++) {
		               if(array[i] > array[j]) {
		                   int temp = array[i];
		                   array[i] = array[j];
		                   array[j] = temp;
		               }
		           }
		       }
		       
		      String strASC = "";
		      
		      for(int i = 0;  i < array.length; i++) {
		    	  strASC = strASC +array[i];
		      }
		      
		       int minASC = Integer.parseInt(strASC);
		       
		       String strDESC = "";
		       for(int i = strASC.length() - 1; i>=0; i--) {
		    	   strDESC = strDESC + strASC.charAt(i);
		       }
		       
		       int maxDESC = Integer.parseInt(strDESC);
		       
		       
		    return 1+ KaprekarsConstant(maxDESC - minASC);
		    
		 
	  } 

static int kaperkasKonstantBestSolution(int num) {
	  if(num == 6174) {
		  return 0;		
		  }
	  
	  int [] numArray = {num / 1000, 
		 num % 1000/100, 
		 num % 1000 % 100 / 10, 
		 num % 1000 % 100 % 10};
 System.out.println(Arrays.toString(numArray));
 
 int ascNum = 0; 
 int descNum = 0;
 
 Arrays.sort(numArray);
 
 for(int i = 0; i <4; i++) {
	 descNum += (numArray[i] * (int) Math.pow(10, i));
	 ascNum += (numArray[i] * (int) Math.pow(10, 3-i));
 }
 return  1 + kaperkasKonstantBestSolution(descNum-ascNum);
 }


							//(x y)(a b)
static int chessboardTraveling(String str) {
	long x1 = Long.parseLong(str.substring(1,2));
	long y1 = Long.parseLong(str.substring(3,4));
	long x2 = Long.parseLong(str.substring(6,7));
	long y2 = Long.parseLong(str.substring(8,9));
	
	long n = (x2 -x1) + (y2 -y1);
	long r = x2 - x1;
	
	return (int)(factorial(n) / (factorial(r) * factorial(n-r)));
}

static long factorial(long n) {
	return (n < 2 ? 1 : n * factorial( n - 1));
	
}

static void stringSquareMaximal() {
	String [] bittSequence = {"0,1,1,1","1,1,1,0","0,0,1,1", "1,1,1,1"};
	
	String str = Arrays.toString(bittSequence);
	String newString = str.replaceAll("\\s", "");
	String [] finalString = newString.split(",");
	
	int[] intArray = new int[finalString.length];
	
	for(int i = 0; i <finalString.length; i++) {
		intArray[i] = Integer.parseInt(finalString[i]);
	}
}

public static int MaximalSquare(String[] strArr) {
    int[][] matrix = new int[strArr.length][];
    int index = 0;
    for (String row : strArr) {
        matrix[index++] = Arrays.stream(row.split("(?<=([01]))")).mapToInt(Integer::parseInt).toArray();
    }
    for (int i = 1; i < matrix.length; i++) {
        for (int j = 1; j < matrix[i].length; j++) {
            if (matrix[i][j] == 1) {
                matrix[i][j] = 1 + Arrays.stream(
                        new int[]{matrix[i - 1][j], matrix[i - 1][j - 1], matrix[i][j - 1]})
                        .min().getAsInt();
            }
        }
    }
    int max = Arrays.stream(matrix).flatMapToInt(Arrays::stream).max().getAsInt();
    return max * max;
}

static void longestWord() {
	String str= "nikola pe peeeder";
	String strArray[] = str.split(" ");
	String first = strArray[0];
	
	for(int i = 0; i < strArray.length; i++) {
		if(first.length() < strArray[i].length()) {
			first = strArray[i];
		}
	}
	System.out.println(first);
}

static int firstFactoriat(int num) {
	return num == 1 ? 1: num * firstFactoriat(num-1);
}
	
static  String fristReverse(String str) {
	return  new StringBuffer().reverse().toString();
}

static int simpleAdding(int num) {
	return (num == 0) ? 0 : num + ( simpleAdding(num));
}

}
