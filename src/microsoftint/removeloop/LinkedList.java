package microsoftint.removeloop;

public class LinkedList {
static Node head;
	static class Node{
		
		int data;
		Node next;
		Node(int item) {
			data = item;
			next = null;
		}
	}
	//remove loop
	int detectAndRemoveLoop(Node node) {
		Node slow =node, fast = node;
		
		while(slow != null && fast != null && fast.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				removeLoop(slow, node);
				return 1;
			}
		}
		return 0;
		
		
	}
	
	void removeLoop(Node loop, Node current) {
		Node prt1 = null,
			prt2 = null;
		
		prt1 = current;
		
	
		while(true) {
			prt2 = loop;
			
			while(prt2.next != loop && prt2.next != prt1) {
				prt2 = prt2.next;
			}
			
			if(prt2.next == prt1) {
				break;
			}
			
			prt1 = prt1.next;	
		}
		prt2.next = null;	
	}
	
	void printList (Node node) {
		while(node != null) {
			System.out.print(node.data  +" ");
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.head = new Node(50);
		linkedList.head.next = new Node(20);
		linkedList.head.next.next = new Node(15);
		linkedList.head.next.next.next = new Node(4);
		linkedList.head.next.next.next.next = new Node(10);
		
		head.next.next.next.next.next = head.next.next;
		
		linkedList.detectAndRemoveLoop(head);
		linkedList.printList(head);
		
	}
	

}
