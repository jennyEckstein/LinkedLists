package SinglyLinkedList;

/**
 * Created by Jenny on 7/26/2016.
 */
public class LinkedList {

    private Node head;
    private Integer counter;

    public LinkedList(){
        this.head = null;
        this.counter = 0;
    }

    public void add(int value){
    	Node new_node = new Node(value);
    	
    	if(head == null){
    		this.head = new_node;
    	}else{
    		new_node.setNode(this.head);
    		this.head = new_node;
    	}
    	counter++;
    }
    
    public boolean deleteFirstOccurence(int value){
    	//System.out.println("here");
    	if (head == null){
    		return false;
    	}else{
    		if(head.getValue() == value){
    			head = head.getNext();
    			return true;
    		}
    		Node prev = head;
    		Node curr = head.getNext();
    		
    		while(curr != null){
    			if (curr.getValue() == value){
    				prev.setNode(curr.getNext());
    				return true;
    			}
    			else{
    				prev = prev.getNext();
    				curr = curr.getNext();
    			}
    		}
    	}
    	return false;
    }
    
    public boolean deleteAllOccurences(int value){
    	//check if head is null - empty list
    	boolean deleted = false;
    	if (head == null){
    		return false;
    	}else{
    		Node curr = head;
    		while(curr != null && curr.getValue() == value){
    			
    				deleted = true;
    				curr = curr.getNext();
    				head.setNode(curr);
    				
    			
    		}
    		
    			//set current and previous
    			curr = head.getNext();
    			Node prev = head;
    			
    			while (curr != null && curr.getValue() == value){
    				    					
					prev.setNode(curr.getNext());			
					curr = curr.getNext();
					prev = prev.getNext();
					deleted = true;
    			}
    		
    	}
    	return deleted;
    }
    
    public String toString(){
    	String str = "";
    	Node temp = head;
    	
    	while(temp != null){
    		str += temp.getValue();
    		temp = temp.getNext();    		
    	}
    	return str;
    }
    
    public Node reverse(Node head){
    	if(head == null || head.getNext() == null){
    		return head;
    	}else{
    		Node remaining = reverse(head.getNext());
    		System.out.println(remaining.toString());
    		head.getNext().getNext().setNode(head);
    		head.setNode(null);
    		return remaining;
    	}
    }

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}
	
	   

}
