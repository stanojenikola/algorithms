package geekforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCopy {
	
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list = Arrays.asList(1,2,3,4,5,6,7,8);
	listCopy(list);
}
	
static void listCopy(List<Integer> list) {
	List<Integer> smallestThanMiddleList =new ArrayList<>();
	List<Integer> middleList = new ArrayList<>();
	List<Integer> largestThanMiddleList = new ArrayList<>();
	int left = 0;
	int right = list.size() - 1;
		
		int mid = left + (right - left) /2;
		
		for(int i = 0; i < list.size(); i++) {
			if(mid== i) {
				middleList.add(list.get(mid));
			} 
			
			if(i < mid) {
				smallestThanMiddleList.add(list.get(i));
			}
			
			if(i > mid) {
				largestThanMiddleList.add(list.get(i));
			}
		}
		
		System.out.println("smallest:" + smallestThanMiddleList);
		System.out.println("middle:" + middleList);
		System.out.println("largest" + largestThanMiddleList);
	}

}
