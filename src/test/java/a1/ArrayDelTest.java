package a1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class ArrayDelTest {


	private ArrayDeletion initializer;
	@Before
	public void initializeration() {
		initializer=new ArrayDeletion();
	}
	@SuppressWarnings("static-access")
	@Test
	public void testFordeletion() {

		int[] arr1= {1,2,3,4,4,4};
		int[] arr2= {1,2,3,4,4,-1};
		
		arr1=initializer.delete(arr1,4);
		initializer.display(arr1);
		//the next statement will delete nothing
		arr1=initializer.delete(arr1,18);
		assertArrayEquals(arr2,arr1);
			
	}


}