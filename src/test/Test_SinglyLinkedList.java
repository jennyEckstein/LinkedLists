package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import SinglyLinkedList.LinkedList;
import SinglyLinkedList.Node;

public class Test_SinglyLinkedList {
	private LinkedList list;

	@Before
	public void setUp() throws Exception {
		this.list = new LinkedList();
	}

	@After
	public void tearDown() throws Exception {
		this.list = null;
	}

	@Test
	public void test_addItemsToList() {
		// O(n)
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Assert.assertTrue(list.getHead().getValue() == 5);
		Assert.assertTrue(list.getHead().getNext().getValue() == 4);
		Assert.assertTrue(list.getHead().getNext().getNext().getValue() == 3);
		Assert.assertTrue(list.getHead().getNext().getNext().getNext().getValue() == 2);
		Assert.assertTrue(list.getHead().getNext().getNext().getNext().getNext().getValue() == 1);
		Assert.assertTrue(list.getCounter() == 5);
	}
	
	@Test
	public void test_printAllItems(){
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Assert.assertEquals("54321", list.toString());
	}
	
	@Test
	public void test_deleteHead(){
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Assert.assertEquals("54321", list.toString());
		list.deleteFirstOccurence(5);
		Assert.assertEquals("4321", list.toString());
		
	}
	
	@Test
	public void test_deleteFromMiddle(){
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Assert.assertEquals("54321", list.toString());
		list.deleteFirstOccurence(3);
		Assert.assertEquals("5421", list.toString());
		
	}
	@Test
	public void test_deleteLast(){
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Assert.assertEquals("54321", list.toString());
		list.deleteFirstOccurence(1);
		Assert.assertEquals("5432", list.toString());
		
	}
	
	@Test
	public void test_deleteNonExistantValue(){
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Assert.assertEquals("54321", list.toString());
		boolean deleted = list.deleteFirstOccurence(6);
		Assert.assertTrue(!deleted);
		Assert.assertEquals("54321", list.toString());
		
	}
	
	@Test
	public void test_deleteMultipleDuplicateValues(){
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		Assert.assertEquals("12121", list.toString());
		boolean deleted = list.deleteAllOccurences(1);
		Assert.assertTrue(deleted);
		Assert.assertEquals("22", list.toString());
		
	}
	
	@Test
	public void test_reverse(){
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Assert.assertEquals("54321", list.toString());
		//boolean deleted = 
		Node node = list.reverse(list.getHead());
		//Assert.assertTrue(deleted);
		Assert.assertEquals("12345", list.toString());
		
	}

}
