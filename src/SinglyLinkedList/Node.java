package SinglyLinkedList;

/**
 * Created by Jenny on 7/26/2016.
 */
public class Node {
    private Node node;
    private Integer value;
    
    public String toString(){
    	return "Value: " + value;
    }

    public Node(int value){
        this.value = value;
    }

    public boolean hasNext(){
        return this.node != null;
    }

    public Node getNext(){
        return this.node;
    }

    public void setNode(Node node){
        this.node = node;
    }

    public void setValue(Integer value){
        this.value = value;
    }

	public Integer getValue() {
		return value;
	}
    
    
   
}
