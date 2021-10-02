package a1;
import static org.junit.Assert.*;
import java.lang.Math;

import org.junit.Before;
import org.junit.Test;




public class arrayTest {

	private Array obj;
	@Before
	public void initialise() {
		obj=new Array();
	}
	@SuppressWarnings("static-access")
	@Test
	public void insertion() {
		
		
		int size=0;
		assertEquals(size,obj.size);
		for(int i=0;i<15;i++)
		{
			obj.insert((int) (Math.random()*50) , i);
		}
		obj.insert(5, 10);
        assertEquals(16,obj.size);
		
	}
	@SuppressWarnings("static-access")
	@Test
	
	public void GetValues() {
		obj.getValues();
	}
	@SuppressWarnings("static-access")
	@Test
	public void deletion() {
		
		
		for(int i=0;i<15;i++)
		{
			obj.insert((int) (Math.random()*50) , i);
		}
       
	

		obj.display();
		assertEquals(15,obj.size);
		for(int i=0;i<7;i++)
		{
			obj.delete(i);
		}
		assertEquals(8,obj.size);
		obj.display();
	}

	@SuppressWarnings("static-access")
	@Test
	public void Search_Linear() {
		
		obj.insert(43,0);
		obj.insert(32,1);
		obj.insert(8,2);
		obj.insert(21,3);
		obj.insert(9,4);
		
	
		obj.display();
		assertEquals(true,obj.linearSearch(21));
		assertEquals(false,obj.linearSearch(66));
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void Sort_Bubble() {
		for(int i=0;i<15;i++)
		{
			obj.insert((int) (Math.random()*50) , i);
		}       
		obj.bubbleSort();
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void Search_Binary() {
		
		obj.insert(23, 0);
		obj.insert(9, 1);
		obj.insert(8, 2);
		obj.insert(21, 3);
		obj.insert(65, 4);
		assertEquals(true,obj.binarySearch(21, 0, obj.size));
		assertEquals(true,obj.binarySearch(65, 0, obj.size));
		assertEquals(false,obj.binarySearch(420, 0, obj.size));
	}

	}



