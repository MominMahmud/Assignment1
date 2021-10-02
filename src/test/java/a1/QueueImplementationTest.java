package a1;



import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unused")
public class QueueImplementationTest {


Queue objective;
@Before
public void initializer()
{
	objective=new Queue(5);
}

@Test
public void emptytest() throws Exception
{
	assertEquals(true,objective.empty());
	objective.enqueue(4);
	assertEquals(false,objective.empty());
	objective.display();
	objective.display();
}

	
	@Test
	public void sizetest() throws Exception
	{
		assertEquals(0,objective.size());	
		objective.enqueue(1);
		assertEquals(1,objective.size());	
		objective.enqueue(1);
		objective.enqueue(1);
		objective.enqueue(1);
		assertEquals(4,objective.size());
		objective.dequeue();
		objective.dequeue();
		assertEquals(2,objective.size());
		objective.display();
		objective.display();
	}
	
	@Test
	public void testenqueue() throws Exception
	{
		
		objective.enqueue(5);
		objective.enqueue(4);
		objective.enqueue(3);
		objective.enqueue(2);
		objective.enqueue(1);
		assertEquals(5,objective.sizeofQueue);
		objective.display();
		objective.display();
		Assert.assertThrows(Exception.class, () -> objective.enqueue(45));
	}
	
	@Test
	public void testdequeue() throws Exception
	{
		Assert.assertThrows(Exception.class, () -> objective.dequeue());
		for(int i=0;i<5;i++)
		{
			objective.enqueue(i);
		}
		
		assertEquals(0,objective.dequeue());
		objective.display();
	
	}

}

