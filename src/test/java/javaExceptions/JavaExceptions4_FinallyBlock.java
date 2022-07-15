package javaExceptions;

import org.testng.annotations.Test;

public class JavaExceptions4_FinallyBlock {
	/*
	Java finally block
	- Java finally block is a block used to execute important code such as closing the connection, etc.
	- Java finally block is always executed whether an exception is handled or not.
	- The finally block follows the try-catch block.
	
	 For each try block there can be zero or more catch blocks, but only one finally block.
	 The finally block will not be executed if the program exits (either by calling System.exit() or by causing a fatal error that causes the process to abort).
	
	*/
	
	// Case 1: When an exception does not occur.
	@Test(priority=0)
	public void TestFinallyBlock1() {
		try {
			//below code do not throw any exception 
			System.out.println("Executing try block"); 
			int n=25/5;
			 
			//catch won't be executed 
		}catch(Exception e) {
			System.out.println(e);
			
			//finally executed regardless of exception occurred or not 
		}finally {
			System.out.println("finally block is always executed");  
		}
		
		System.out.println("rest of the code..."); 
		System.out.println("========================================================="); 
	}
	
	// Case 2: When an exception occurs and is handled by the catch block
		@Test(priority=1)
		public void TestFinallyBlock2() {
			try {
				System.out.println("Executing try block"); 
				//below code throws divide by zero exception i.e. ArithmeticException
				int n=25/0;
				 
				//Below catch block can handles the ArithmeticException
			}catch(ArithmeticException e) {
				System.out.println(e);
				
				//finally executed regardless of exception occurred or not 
			}finally {
				System.out.println("finally block is always executed");  
			}
			
			System.out.println("rest of the code...");  
			System.out.println("========================================================="); 
		}
		
	
	// Case 3: When an exception occur but not handled by the catch block
	@Test(priority=2)
	public void TestFinallyBlock3() {
		try {
			System.out.println("Executing try block"); 
			//below code throws divide by zero exception i.e. ArithmeticmeticException
			int n=25/0;
			 
			//Below catch block can only handles NullPointerException, not ArithmeticmeticException
		}catch(NullPointerException e) {
			System.out.println(e);
			
			//finally executed regardless of exception occurred or not 
		}finally {
			System.out.println("finally block is always executed");  
		}
		
		System.out.println("rest of the code...");  
		System.out.println("========================================================="); 
	}
	

}
