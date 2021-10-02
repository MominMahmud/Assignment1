package a1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;





public class LinkedListTest {
	 private LinkedList arrayObj;

	@Before
	public void initialise() {
		arrayObj = new LinkedList();

	}
	@SuppressWarnings("static-access")
	@Test
	public void popping() {
		arrayObj.pop(0);
		arrayObj.pushFront(21);
		arrayObj.pushFront(2);
		arrayObj.pushFront(42);
		arrayObj.pushBack(30);
		arrayObj.pushBack(10);
		arrayObj.pushBack(9);

		arrayObj.pop(4);
		
		assertEquals(42, arrayObj.head.key);
		assertEquals(2, arrayObj.head.next.key);
		assertEquals(5, arrayObj.size);

		arrayObj.pop(0);
		assertEquals(4, arrayObj.size);
		assertEquals(2, arrayObj.head.key);
		arrayObj.pop(0);
		arrayObj.display();
	}

	@SuppressWarnings("static-access")
	@Test
	public void poppingBack() {
		assertEquals(null,arrayObj.head);
		arrayObj.popBack();
		arrayObj.pushBack(100);
		arrayObj.popBack();
		assertEquals(0, arrayObj.size);
		assertEquals(null, arrayObj.head);
for(int i=0;i<10;i++)
{
	arrayObj.pushFront(i+1);
}
for(int i=0;i<5;i++)
{
	arrayObj.popBack();
}
		assertEquals(5, arrayObj.size);
		assertEquals(10,arrayObj.head.key);
	}

	@SuppressWarnings("static-access")
	@Test
	public void DCtest() {
	
		arrayObj.display();
		assertEquals(0, arrayObj.size);
		assertEquals(null, arrayObj.head);
	}

	@SuppressWarnings("static-access")
	@Test
	public void frontPushing() {
	for(int i=1;i<=5;i++)
		{
		arrayObj.pushFront(i);
		}
		

		assertEquals(4,arrayObj.head.next.key);
		assertEquals(3,arrayObj.head.next.next.key);
		assertEquals(2,arrayObj.head.next.next.next.key);
		assertEquals(1,arrayObj.head.next.next.next.next.key);
		assertEquals(arrayObj.size, 5);
	}

	@SuppressWarnings("static-access")
	@Test
	public void Backpushing() {
	for(int i=1;i<5;i++)
		{
		arrayObj.pushBack(i);
		}
	
		
			assertEquals(1,arrayObj.head.key);
			assertEquals(2,arrayObj.head.next.key);
			assertEquals(3,arrayObj.head.next.next.key);
			assertEquals(4,arrayObj.head.next.next.next.key);
		
	
		assertEquals(arrayObj.size, 4);
	}

	
	@SuppressWarnings("static-access")
	@Test
	public void Frontpopping() {

		arrayObj.popFront();
		assertEquals(0, arrayObj.size);
for(int i=1;i<5;i++)
{
	arrayObj.pushFront(i);
}

		arrayObj.pushFront(69);
		arrayObj.popFront();
		assertEquals(4, arrayObj.size);
		assertEquals(4,arrayObj.head.key);
	}
}
