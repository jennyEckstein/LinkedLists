package ReverseSinglyLinkedList;

public class Node {
	Node next;
	int data;
	
	public static void printReverse(Node head){
		if (head == null){return;}
		else{
			printReverse(head.next);
			System.out.print(head.data);
		}
	}
	
	public static Node reverseList(Node head){
		if(head == null || head.next == null){
			return head;
		}else{
			Node remaining = reverseList(head.next);
			head.next.next = head;
			head.next = null;
			return remaining;
		}
		
	}
	
	public static void print(Node head){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data);
			temp = temp.next;
		}
	}
	
	public static Node printToLast(Node head, int numFromEnd){
		
		
		if(head == null){
			//System.out.print("= " + head.data);
			return head;
			 
		}else{	
			Node current = head;
			Node behind = head;
			
			for(int i = 0; i < numFromEnd; i++){
				current = current.next;
			}
			
			while(current != null){
				behind = behind.next;
				current = current.next;
			}
			return behind;
		}
		
		
		
	}
	
	public static void main(String [] args){
		Node head = new Node();
		head.data = 0;
		
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		Node node5 = new Node();
		Node node6 = new Node();
		node1.data = 1;
		node2.data = 2;
		node3.data = 3;
		node4.data = 4;
		node5.data = 5;
		node6.data = 6;
		
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		System.out.print("Before: ");
		print(head);
		
		System.out.print("\nAfter: ");
		//printReverse(head);
		//print(reverseList(head));
		Node n = printToLast(head, 2);
		System.out.print(n.data);
		
		
	}
}
