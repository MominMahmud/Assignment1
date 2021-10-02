package a1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayInsertionTest {
	
	private ArrayInsertion obji;
	@Before
	public void initializer() {
		obji=new ArrayInsertion();
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testOfSize() {
		int [] testingarray=new int[0];
		for(int i=0;i<5;i++) {
		obji.insert(testingarray,i+1,i);
		}
		assertNotEquals(5,testingarray.length);
		assertEquals(0,testingarray.length);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void Insertiontest() {
		int [] testingarray=new int[10];
		int[] expectedArray= {0,0,0,5,0,7,0,9,0,0};
		for(int i=7;i>1;i=i-2) {
			obji.insert(testingarray,i+2,i);
		}
		assertArrayEquals(testingarray,expectedArray);
		obji.insert(testingarray,5,5);
		obji.insert(testingarray,5,5);
		
	}
	
	

}