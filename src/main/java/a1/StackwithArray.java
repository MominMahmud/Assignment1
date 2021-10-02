package a1;

//Program to implement StackwithArray using an array.

public class StackwithArray{
	static int [] array; //array to store numbers.
	static int size; //stores the number of elements in the array.
	static int addPointer; //points to the position, where new number is to be added.

	public StackwithArray(){
		array=new int[100]; //length = 100
		size=0;  //initial size = 0.
		addPointer=0; //initially points to position = 0;
	}
	
	//function to add elements in the stack.
	static public void push(int number){
		//if stack is full.
		if(addPointer>=array.length){
			System.out.println("StackwithArray is Full!");
			return;
		}
		
		System.out.println("Push Operation : " + number);

		//else just add the element.
		array[addPointer]=number;
		addPointer++;
		size++;
	}
	
	//function to remove the top element.
	static public int pop(){
		//if stack is empty.
		if(addPointer==0){
			System.out.println("StackwithArray is Empty!");
			return -1;
		}
		
		System.out.println("Pop Operation.");

		//else just return and remove the element.
		addPointer--;
		size--;
		return array[addPointer];
		
	}

	//function to display the stack.
	static public void display(){
		if(addPointer==0){
			System.out.println("Empty StackwithArray.");
			return;
		}
		System.out.print("StackwithArray : ");
		for(int i=0;i<size;i++){
			System.out.print(array[i] + " " );
		}
		System.out.println();
	}
}
	/*
	//main function to run the program.
	@SuppressWarnings("static-access")
	public static void main(String [] args){
		//create a StackwithArray.
		System.out.println("STACK");
		StackwithArray stack = new StackwithArray();
		
		stack.push(10); //push num=10
		stack.push(20); //push num=20
		stack.push(30); //push num=30
		stack.display();//display stack.

		stack.pop();    //pop element.
		stack.display();//display stack.
		stack.push(40); //push num=40
		stack.display();//display stack.
		stack.pop();    //pop num.
		stack.display();//display stack.
		stack.pop();    //pop element 
		stack.display();//display stack
	}
}*/