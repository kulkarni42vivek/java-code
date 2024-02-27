package test;

class Node {
	int value ;
	Node next ;
}
class LinkedListClass{
	Node head ;
	Node tail ;
	int size ;
	
	Node pushValue(int value) {
		Node newNode = new Node();
		newNode.value = value ;
		newNode.next = null;
		if(head == null) {
			head  = new Node();
			head = newNode ;
			tail = newNode ;
			size = 1 ;
		}
		else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
		return head;
	}
	
	
	void display() {
		Node temp = head ;
		while(temp!= null) {
			System.out.print(temp.value + " --> ");
			temp = temp.next;
		}
	}
	
	void rotate() {
		Node temp = head ;
		head = head.next;
		tail.next = temp;
		tail = tail.next;
		tail.next  = null ;
	}
	
	void rotateList(int rValue) {
		while(rValue!= 0) {
			rotate();
			rValue--;
		}
	}
	void rotateList2(int rValue) {
		Node temp = head ;
		while(rValue != 1 ) {
			temp= temp.next;
			rValue--;
		}
		
		tail.next = head;
		head = temp.next;
		tail = temp;
		tail.next = null;
	}
}
public class TestClass {
	public static void main(String[] args) {
		LinkedListClass ll = new LinkedListClass();
		ll.pushValue(1);
		ll.pushValue(2);
		ll.pushValue(3);
		ll.pushValue(4);
		ll.pushValue(5);
		
		ll.display();
		
		ll.rotateList2(3);
		System.out.println();
		ll.display();
	}
}
