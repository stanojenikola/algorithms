package geekforgeeks;

public class LinkedListChar {
	Node head;
	static Node a;
	static Node b;
	static class Node{
		char data;
		Node next;
		
		Node(char dat){
			data = dat;
			next = null;
		}
	}
	
static LinkedListChar add(LinkedListChar list, char value) {
	
	Node newNode = new Node(value);
	newNode.next = null;
	
	if(list.head == null) {
		list.head = newNode;
	}
	else {
		Node last = list.head;
		
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = newNode;
	}
	
	return list;
}

static void printListLinked(LinkedListChar list) {
	Node currentNode = list.head;
	
	while(currentNode!=null) {
		System.out.println(currentNode.data);
		currentNode =currentNode.next;
	}
}

public static void main(String[] args) {
	  LinkedListChar list = new LinkedListChar(); 

      list.a = new Node('g'); 
      list.a.next = new Node('e'); 
      list.a.next.next = new Node('e'); 
      list.a.next.next.next = new Node('k'); 
      list.a.next.next.next.next = new Node('s'); 
      list.a.next.next.next.next.next = new Node('b'); 

      list.b = new Node('g'); 
      list.b.next = new Node('e'); 
      list.b.next.next = new Node('e'); 
      list.b.next.next.next = new Node('k'); 
      list.b.next.next.next.next = new Node('s'); 
      list.b.next.next.next.next.next = new Node('a'); 

      int value; 
      value = list.compare(a, b); 
      System.out.println(value);
	
}

//first greater 1, second greater -1, equal 0

static int compare(Node node1, Node node2) {
	
	if(node1 == null && node2 == null) {
		return 1;
	}
	
while(node1 != null && node2 != null && node1.data== node2.data) {
	node1 = node1.next;
	node2 = node2.next;
	//instantiation
}

if(node1 != null && node2 != null) {
	return (node1.data > node2.data ? 1: -1);
}

if(node1 != null && node2 == null) {
	return 1;
}

if(node1 == null && node2 != null) {
	return -1;
}

return 0;
}
}
