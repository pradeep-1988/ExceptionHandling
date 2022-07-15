package javaExceptions;

import org.testng.annotations.Test;

public class JavaExceptions2_MultiCatch_Blocks {
	/*
	Java MultiCatch block:
		- A try block can be followed by one or more catch blocks. 
		- Each catch block must contain a different exception handler. 
		- So, if you have to perform different tasks at the occurrence of different exceptions, use java MultiCatch block.
		- At a time only one exception occurs and at a time only one catch block is executed.
		- All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before catch for Exception.
	
	*/
	
	
	@Test(priority=0)
	public void MultipleCatchBlock1() {
		int a[]=new int[5]; 
		
		try{       
              a[3]=30/0;    
           } 
		catch(ArithmeticException e)  
        {  
         System.out.println("Arithmetic Exception occurs");  
        }  
		catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
		 catch(Exception e)  
        {  
         System.out.println("Parent Exception occurs");  
        } 
		System.out.println("rest of the code after exception inside MultipleCatchBlock1 Test");   
	}
	
	@Test(priority=1)
	public void MultipleCatchBlock2() {
		int a[]=new int[5]; 
		
		try{       
              a[10]=30;    
           } 
		catch(ArithmeticException e)  
        {  
         System.out.println("Arithmetic Exception occurs");  
        }  
		catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
		 catch(Exception e)  
        {  
         System.out.println("Parent Exception occurs");  
        } 
		System.out.println("rest of the code after exception inside MultipleCatchBlock2 Test");   
	}
	
	// In this example, we generate NullPointerException, but didn't provide the corresponding exception type. 
	// In such case, the catch block containing the parent exception class Exception will invoked.
	@Test(priority=2)
	public void MultipleCatchBlock3() {
		 String s=null; 
		
		try{       
			System.out.println(s.length());    
           } 
		catch(ArithmeticException e)  
        {  
         System.out.println("Arithmetic Exception occurs");  
        }  
		catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
		 catch(Exception e)  
        {  
         System.out.println("Parent Exception occurs");  
        } 
		System.out.println("rest of the code after exception inside MultipleCatchBlock3 Test");   
	}
	
	// Handle the exception without maintaining the order of exceptions (i.e. from most specific to most general).
	// In this scenario, we would get compile-time error. Remove the comment from below code:
	/*
	@Test(priority=3)
	public void MultipleCatchBlock4() {
		 String s=null; 
		
		try{       
			System.out.println(s.length());    
           } 
		 catch(Exception e)  
        {  
         System.out.println("Parent Exception occurs");  
        } 
		catch(ArithmeticException e)  
        {  
         System.out.println("Arithmetic Exception occurs");  
        }  
		catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
		System.out.println("rest of the code after exception inside MultipleCatchBlock3 Test");   
	}
	*/
}
