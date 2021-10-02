package a1;

import static org.junit.Assert.*;
import java.lang.Math;
import org.junit.Test;
import java.lang.Exception;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import java.lang.Exception;

@SuppressWarnings("unused")
public class MyStackTest {

	MyStack stacker;
@Before
public void initializer()
{
	stacker=new MyStack(3);
}


	
	
	@Test
	public void PushStackTest() throws Exception
	{
		
		stacker.push(76);
		stacker.push(354);
		assertEquals(2,stacker.size());
		stacker.push(87);
		Assert.assertThrows(Exception.class, () -> stacker.push(300));
	}
	@Test
	public void TopStackTest() throws Exception
	{
		
		Assert.assertThrows(Exception.class, () ->stacker.top());
		stacker.push(76);
		stacker.push(354);
		assertEquals(354,stacker.top());
		
		
		
	}
	
	@Test
	public void SizeStacktest() throws Exception
	{
		stacker.push(76);
		stacker.push(354);
		
		assertEquals(2,stacker.size());
	}

	@Test
	public void PopStacktest() throws Exception
	{
		
		Assert.assertThrows(Exception.class, () -> stacker.pop());
		stacker.push(76);
		stacker.push(354);
		stacker.displayStack();
		stacker.pop();
		assertEquals(76,stacker.top());
	}

}