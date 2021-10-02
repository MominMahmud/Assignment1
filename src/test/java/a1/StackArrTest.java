package a1;



import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackArrTest {

	StackwithArray tempo;
@SuppressWarnings("static-access")
@Before
public void initializer()
{
	tempo=new StackwithArray();
	tempo.display();
}

	@SuppressWarnings("static-access")
	@Test
	public void pushiTest()
	{

		tempo.push(1);
		assertEquals(1,tempo.size);
		for(int k=0;k<50;k++) {
			tempo.push(k);
		}
		tempo.display();
		assertEquals(49,tempo.pop());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void popiTest()
	{
		assertEquals(-1,tempo.pop());
		
			tempo.push(1);
			tempo.push(2);
			tempo.push(3);
			tempo.push(1);
		
		assertEquals(4,tempo.size);
		tempo.display();
	}
	

}
