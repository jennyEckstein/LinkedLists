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

    public void addToTail(Integer value){
        if(head == null){
            head.setValue(value);
        }else{
            Node current_node = head;

            while(current_node.hasNext()){
                current_node.getNext();
            }
            Node new_node = new Node(value);
            current_node.setNode(new_node);
        }
        counter++;
    }


}
