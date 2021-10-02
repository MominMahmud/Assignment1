package a1;


import static org.junit.Assert.*;

import org.junit.Test;

public class QueueLinkListTest {

private QueuewithLinkedList objective;
	
	
	@SuppressWarnings("static-access")
	@Test
	public void testingdequeue()
	{
		objective=new QueuewithLinkedList();
		
		objective.enqueue(1);
		objective.enqueue(3);
		objective.dequeue();
		objective.dequeue();
		assertEquals(-1,objective.dequeue());
		objective.enqueue(7);
		assertEquals(1,objective.size);
		objective.display();
		objective.display();
		objective.display();
	}
	@SuppressWarnings("static-access")
	@Test
	public void testingnode()
	{
		QueuewithLinkedList.Node objectivenode=new QueuewithLinkedList.Node(8);
		assertEquals(8,objectivenode.key);
		objective.display();
		objective.display();
	}
	@SuppressWarnings("static-access")
	@Test
	public void testingenqueue()
	{
		objective=new QueuewithLinkedList();
		
		objective.enqueue(2);
		objective.enqueue(2);
		objective.enqueue(2);
		objective.enqueue(2);
		objective.enqueue(2);
		objective.enqueue(2);
		objective.enqueue(2);
		objective.display();
		assertEquals(7,objective.size);
		objective.display();
	}


}
