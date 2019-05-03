package microsoftint;

public class CloneLinkedList {
	
	static class Node{
		Node next, random;
		int data;
		
		Node(int d) {
			data = d;
			next = random = null;
		}
	}
	
	static void print(Node start) {
		Node pr = start;
		while(pr != null) {
			System.out.println(pr.data +" "+pr.random.data);
			pr = pr.next;
		}
	}
	
	static Node clone(Node start) {
		
		Node current = start, temp = null;
		
		while(current != null) {
			temp = current.next;
			current.next = new Node(current.data);
			current.next.next = temp;
			current = temp;
		}
		
		current = start;
		
		while(current != null) {
			if(current.next != null) 
				
current.next.random = (current.random!= null)? current.random.next:current.random;
current = (current.next != null) ? current.next.next :current.next;
		}
		
		Node original = start, copy = start.next;
		temp = copy;
		
		while(original != null && copy != null) {
			original.next = (original.next != null) ? 
					original.next.next : original.next;
			
			copy.next = (copy.next != null) ? copy.next.next : copy.next;
	
			original = original.next;
			copy = copy.next;
		}
		return temp;
	}
	
	

}
