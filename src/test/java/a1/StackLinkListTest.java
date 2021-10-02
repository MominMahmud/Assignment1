package a1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackLinkListTest {
	
	StackLinkList tempo;
@Before
public void constructor()
{
	tempo=new StackLinkList();
}

	@SuppressWarnings("static-access")
	@Test
	public void StackNodeTest()
	{
		StackLinkList.Node temponode=new StackLinkList.Node(2);
		assertEquals(2,temponode.key);
		assertFalse(temponode.key!=2);
		tempo.display();
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void pushtest()
	{
		assertEquals(0,tempo.size);
		
		tempo.push(1);
		tempo.push(1);
		tempo.push(9);
		tempo.display();
		assertEquals(9,tempo.top());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void Testtop()
	{
		assertEquals(-1,tempo.top());
		
		tempo.push(67);
		tempo.push(32);
		tempo.push(56);
		tempo.push(4);
		tempo.display();
		assertEquals(4,tempo.top());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void poptest()
	{
		assertEquals(-1,tempo.pop());
		
		tempo.push(0);
		tempo.push(1);
		tempo.pop();
		tempo.push(2);
		tempo.pop();
		tempo.push(3);
		tempo.pop();
		tempo.push(4);
		tempo.pop();
		tempo.display();
		assertEquals(0,tempo.top());
	}

	@SuppressWarnings("static-access")
	@Test
	public void SizeTest()
	{
		
		tempo.push(6);
		tempo.push(6);
		tempo.push(6);
		assertEquals(3,tempo.getSize());
		tempo.display();
	}

}


