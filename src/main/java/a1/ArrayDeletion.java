package a1;


import java.util.*;
@SuppressWarnings("unused")
public class ArrayDeletion{
	//this function takes two arguments - array to delete in and index of the element to delete.
	static int [] delete(int [] array, int indextodeleteAt){
		//check if index is valid.
		if(indextodeleteAt<0 || indextodeleteAt>array.length-1){
			return array;
		}
		
		//shift elements towards left from last element till indextodeleteAt.	
		for(int i=indextodeleteAt; i<array.length-1; i++){
			array[i]=array[i+1];
		}
		array[array.length-1] = -1;
		return array;
	}

	//function to display the array.
	public static void display(int [] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}

