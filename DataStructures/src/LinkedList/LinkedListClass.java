package LinkedList;


class Node{
	int value;
	Node newRef;
	
	Node(int value){
		this.value = value;
	}
	Node(int value , Node next){
		this.value = value ;
		this.newRef = next;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNewRef() {
		return newRef;
	}
	public void setNewRef(Node newRef) {
		this.newRef = newRef;
	}
}

class LinkedList{
	Node head ;
	int count ;
	public LinkedList(Node newNode) {
		this.head = newNode;
		count= 1;
	}
	
	
	// add function 
	public void addItem(int value) {
		Node newNode = new Node(value);
		Node current = head ;
		while(current.getNewRef() != null) {
			current = current.getNewRef();
		}
		current.setNewRef(newNode);
		count ++;
	}
	
	// retrieve 
	public int getData(int index) {
		Node current = head ;
		if(index < 0) {
			return -1;
		}
		
		for(int i =0 ; i< index-1 ;i++) {
			current = current.getNewRef();
		}
		return current.getValue();
	}
	
}
public class LinkedListClass {
	public static void main(String[] args) {
		
	}
}
