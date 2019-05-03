
public class PerfectMakePractice {

	
	
	public static String stringOneWord = "";
	

	
	public static String split(char[] charArray) {
		String str = new String(charArray);
		String [] strArray = str.split(" ");
		String reverse = "";
		for(int i = strArray.length -1; i>= 0; i--) {
			reverse = reverse + strArray[i] + " ";
		}
		
		String reverseNew = reverse.substring(0, reverse.length() - 1);
		return reverseNew;
	}
	
	
	
	public static void main(String[] args) {
		char [] inputArray = {'p', 'e', 'r', 'f', 'e', 'c', 't', ' ',
				'm', 'a', 'k', 'e', 's', 
			  	' ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'};
		
	System.out.println(split(inputArray));
		
	}
}
