package javaExceptions;

import org.testng.annotations.Test;

public class JavaExceptions7_final_finally_finalize {
	/*
	Difference between final, finally and finalize:
	- The final, finally, and finalize are keywords in Java that are used in exception handling.
	- Each of these keywords has a different functionality.
		* final is an access modifier which is used to apply restrictions on a class, method or variable.
		* finally is the block in Exception Handling to execute the important code whether the exception occurs or not.
		* finalize is the method of object class which is used to perform clean up processing just before object is garbage collected.
		
		
		* Final keyword is used with the classes, methods and variables.
		* Finally block is always related to the try and catch block in exception handling.
		* finalize() method is used with the objects. 
		
		
		* Once declared, final variable becomes constant and cannot be modified. final method cannot be overridden by sub class. final class cannot be inherited.
		* finally block runs the important code even if exception occurs or not. finally block cleans up all the resources used in try block
		* finalize method performs the cleaning activities with respect to the object before its destruction.
		 
		
		* Final method is executed only when we call it.
		* Finally block is executed as soon as the try-catch block is executed. It's execution is not dependent on the exception.
		* finalize method is executed just before the object is destroyed. 


	*/
	
	
	// Java final Example:
	// Let's consider the following example where we declare final variable age. Once declared it cannot be modified.
	// Similarly, we can declare the methods and classes final using the final keyword.
	
	//declaring final variable  
    final int age = 18;
    
    public void display() {
    	// reassigning value to age variable   
        //age = 55;   // gives compile time error as final variables can't be updated/modified.
    	System.out.println("Executing display method");
    }
	
	@Test(priority=0)
	public void FinalExample_Test() {
		display();
		System.out.println("===============================================");
	}
	
	
	
	
	
	
	// Java finally Example:
	// Let's see the below example where the Java code throws an exception and the catch block handles that exception. 
	// Later the finally block is executed after the try-catch block. 
	// Further, the rest of the code is also executed normally.
	
	@Test(priority=1)
	public void FinallyExample_Test() {
		
		try {
			System.out.println("Inside try block");
			// below code throws divide by zero exception  
		    int data=25/0;    
		    System.out.println(data);  
		}
		// handles the Arithmetic Exception / Divide by zero exception  
		catch(ArithmeticException e) {
			System.out.println("Exception handled");  
		    System.out.println(e);  
		}
		// executes regardless of exception occurred or not  
		finally {
			System.out.println("finally block is always executed");  
		}
		
		System.out.println("rest of the code...");
		System.out.println("===============================================");
	}
	
	
	
	
	
	// Java finalize Example
	
	@Test(priority=2)
	public void FinalizeExample_Test() {
		JavaExceptions7_final_finally_finalize obj = new JavaExceptions7_final_finally_finalize();
		// printing the hashcode   
        System.out.println("Hashcode is: " + obj.hashCode()); 
        obj = null;   
        // calling the garbage collector using gc()   
        System.gc();     
        System.out.println("End of the garbage collection"); 
		
	}
	
	// defining the finalize method 
	protected void finalize()     
    {     
        System.out.println("Called the finalize() method");     
    }  
	
	
}
