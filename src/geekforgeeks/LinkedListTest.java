package geekforgeeks;

public class LinkedListTest {
	
	Node head;

static class Node{
	
	Node next;
	int value;
	Node(int v){
		value = v;
		next = null;
	}
}
	

static LinkedListTest insert(LinkedListTest list, int data) {
	
	Node newNode = new Node(data);
	newNode.next = null;
	
	if(list.head == null) {
		list.head = newNode;
	}
	
	else {
		Node last = list.head;
		
		while(last.next != null) {
			last = last.next;
		}
		//adding new in last
		last.next = newNode;
	}
	
	return list;
}
	
static void printLinkedList(LinkedListTest list) {
	Node currentNode = list.head;
	while(currentNode != null) {
		System.out.println(currentNode.value);
		currentNode = currentNode.next;
	}
}

public static void main(String[] args) {
	//all time added
	LinkedListTest list = new LinkedListTest();
	list = insert(list, 3);
	list = insert(list, 2);
	list = insert(list, 1);
	list = insert(list, 322);
printLinkedList(list);

deleteAtIndex(list, 1);

	
}

public static LinkedListTest deleteNodeFromList(LinkedListTest list, int value) {
	
	Node currentNode = list.head;
	Node prev = null;
	//case 111111111111111111111111111111111111111
	if(currentNode != null && currentNode.value == value) {
		list.head = currentNode.next; //delete
		//change the head
System.out.println("node with value:" + value+ "<- is deleted");

//vrati odma listu if not null point exeption throwed!!!!!!!
		return list;
	}
	//case  22222222222222222222222222222222222222
	while(currentNode != null && currentNode.value != value) {
		prev = currentNode;
		currentNode = currentNode.next;
	}
	
	if(currentNode != null) {
		//switch and delete
		prev.next = currentNode.next;//delete
		System.out.println("node with value:" + value+ "<- is deleted");
	}
	
	if(currentNode != null) {
		System.out.println("not found:" + value);		
	}
	
	return list;
}


static LinkedListTest ins(LinkedListTest list, int value) {
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


static LinkedListTest delete(LinkedListTest list, int value) {
	
	Node currentNode = list.head;
	Node prev = null;
	//if head is equal to key
	if(currentNode != null && currentNode.value == value) {
		
		list.head = currentNode.next;
		return list;
	}
	//case two - traverse
	//current new is set to one of this
	while(currentNode != null && currentNode.value != value) {
		prev = currentNode.next;
		currentNode = currentNode.next;
		System.out.println("deleted!");

	}
	
	if(currentNode != null) {
		//unlink currend node
		prev.next = currentNode.next;
	}
	
	if(currentNode == null) {
		System.out.println("Value not found!");
	}
	
	return list;
}


static LinkedListTest deleteAtIndex(LinkedListTest list, int index) {
	Node currentNode = list.head;
	Node prev = null;
	
	if(currentNode != null && index == 0 ) {
		list.head = currentNode.next;
        System.out.println(index + " position element deleted"); 

		return list;
	}
	
	int counter = 0;

	while(currentNode != null) {
		
		if(counter == index) {
			prev.next = currentNode.next;
            System.out.println(index + " position element deleted"); 
            break;
		} else {
			prev = currentNode;
			currentNode = currentNode.next;
			counter++;
		}
	}
	
	if(currentNode == null) {
        System.out.println("not found"); 
	}
	
	return list;
}


static LinkedListTest inser(LinkedListTest list, int dataValue) {
	Node newNode = new Node(dataValue);
	newNode.next = null;
	
	if(list.head == null) {
		list.head= newNode;
	}else {
		Node last = list.head;
		//till the end ++
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = newNode;
	}
	
	return list;
}

static LinkedListTest deleteNode(LinkedListTest list, int value) {
	
	Node currentNode = list.head;
	Node prev= null;
	
	if(currentNode != null && currentNode.value == value) {
		list.head = currentNode.next;
        System.out.println(value + " <- element deleted"); 
	}
	
	while(currentNode != null && currentNode.value != value) {
		prev = currentNode;
		currentNode = currentNode.next;
	}
	//null point cheching all the time
	if(currentNode != null) {
		prev.next = currentNode.next;
	}
	
	if(currentNode == null) {
        System.out.println("not found"); 

	}
	
	return list;
}

static LinkedListTest indexDeleteLinked(LinkedListTest list, int index) {
	
	Node currendList = list.head;
	Node prev = null;
	
	if(currendList != null && index == 0) {
		list.head = currendList.next;
	}
	
	int counter = 0;
	
	while(currendList != null) {
		if(counter == index) {
			prev.next = currendList.next;
		} else {
			prev = currendList;
			counter++;
			currendList = currendList.next;
		}
	}
	
	if(currendList == null) {
		System.out.println("not found");
	}
	
	return list;
}





}
