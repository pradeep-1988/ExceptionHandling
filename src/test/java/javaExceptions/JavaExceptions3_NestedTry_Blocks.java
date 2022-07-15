package javaExceptions;

import org.testng.annotations.Test;

public class JavaExceptions3_NestedTry_Blocks {
	/*
	In Java, using a try block inside another try block is permitted. It is called as nested try block.
	- For example, the inner try block can be used to handle ArrayIndexOutOfBoundsException while the outer try block can handle the ArithemeticException (division by zero).
	
	Why use nested try block?
	- Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error. In such cases, exception handlers have to be nested.
	
	
	*/
	
	@Test(priority=0)
	public void NestedTryBlock1_Test() {
		
		 //outer try block  
		try {
			
			//inner try block 1  
			try {
				System.out.println("going to divide by 0");    
			    int b =39/0;  
			}
			catch(ArithmeticException e) {
				System.out.println(e); 
			}
			
			 //inner try block 2 
			try {
				 int a[]=new int[5];
				 a[5]=4;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);  
			}
			
			System.out.println("other statement");   
			
		}catch(Exception e) {
			System.out.println("handled the exception (outer catch)");  
		}
		
		System.out.println("normal flow..");  
	}
	
	/*
	- When any try block does not have a catch block for a particular exception, then the catch block of the outer (parent) try block are checked for that exception, and if it matches, the catch block of outer try block is executed.
	- If none of the catch block specified in the code is unable to handle the exception, then the Java runtime system will handle the exception. Then it displays the system generated message for that exception.
	
	*/
	
	@Test(priority=1)
	public void NestedTryBlock2_Test() {
		
		// outer (main) try block  
		try {
			//inner try block 1 
			try {
				// inner try block 2 
				try {
					 int arr[] = { 1, 2, 3, 4 }; 
					 System.out.println(arr[10]); 
					
				}catch(ArithmeticException e) {
					 System.out.println("Arithmetic exception: "+ e + " catch from inner try block 2");  
				}
				
			}catch(ArithmeticException e) {
				System.out.println("Arithmetic exception: "+ e + " catch from inner try block 1");  
			}
			
		}catch(NullPointerException e) {
			System.out.println("NullPointerException Exception: "+ e + " catch from outer (main) try block "); 
		}
		
		catch(NumberFormatException e) {
			System.out.println("NullPointerException Exception: "+ e);
		}
		
		catch (Exception e) {  
			System.out.println("Exception: "+e);  
	    }  
		
	}

}
