package javaExceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.testng.annotations.Test;

public class JavaExceptions_Handling {

	/*
	The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
	
	What is Exception in Java?
	In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.
	
	What is Exception Handling?
	Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

	Advantage of Exception Handling?
	The core advantage of exception handling is to maintain the normal flow of the application. An exception normally disrupts the normal flow of the application; that is why we need to handle exceptions.
	
	Hierarchy of Java Exception classes:
	The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by two subclasses: Exception and Error.
	
	Throwable class:
		1. Error
			a. StackOverflowError
			b. VirtualMachineError
			c. OutOfMemoryError
		2. Exception
			a. IOException
			b. SQLException
			c. ClassNotFoundException
			d. RunTimeException
				- AirthmeticException
				- NullPointerException
				- NumberFormatException
				- IndexOutOfBoundsException
					* ArrayIndexOutOfBoundsException
					* StringIndexOutOfBoundsException
	
	
	Types of Java Exceptions:
		1. Checked Exception
			- The classes that directly inherit the Throwable class except RuntimeException are known as checked exceptions.
			- For example: IOException, SQLException, ClassNotFoundException, FileNotFoundException etc.
			- Checked exceptions are checked at compile-time.
		2. Unchecked Exception
			- The classes that inherit the RuntimeException are known as unchecked exceptions. 
			- For example: AirthmeticException, NullPointerException, NumberFormatException, IndexOutOfBoundsException etc.
			- Unchecked exceptions are checked at runtime.
		3. Error
			- Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.

				 
	Java Exception Keywords: Java provides five keywords that are used to handle the exception.
		1. try: 
			- The "try" keyword is used to specify a block where we should place an exception code.
			- It means we can't use try block alone. 
			- The try block must be followed by either catch or finally.
		2. catch:
			- The "catch" block is used to handle the exception by declaring the type of exception within the parameter.
			- The declared exception must be the parent class exception (i.e., Exception) or the generated exception type.
			- However, the good approach is to declare the generated type of exception.
			- The catch block must be used after the try block only. You can use multiple catch block with a single try block.
			- It can be followed by finally block later.
		3. finally:
			- The "finally" block is used to execute the necessary code of the program
			- It is executed whether an exception is handled or not.
		4. throw:
			- The "throw" keyword is used to throw an exception.
		5. throws:
			- The "throws" keyword is used to declare exceptions.
			- It specifies that there may occur an exception in the method.
			- It doesn't throw an exception. It is always used with method signature.

	*/
	
	// A scenario where ArithmeticException occurs
	// If we divide any number by zero, there occurs an ArithmeticException.
	@Test(priority=0)
	public void AirthmeticExceptionTest() {
	
		//int a = 100/0;
		try {
			//code that may raise exception  
			int a = 100/0;
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("rest of the code... after AirthmeticExceptionTest"); 
	}
	
	
	// A scenario where NullPointerException occurs
	// If we have a null value in any variable & performing any operation on the variable, throws a NullPointerException.
	@Test(priority=1)
	public void NullPointerExceptionTest() {
	
		String s=null;  
		//System.out.println(s.length());//NullPointerException 
		try {
			//code that may raise exception  
			System.out.println(s.length());
		}catch(NullPointerException e){
			System.out.println(e);
		}
		System.out.println("rest of the code... after NullPointerExceptionTest"); 
	}
	
	
	// A scenario where NumberFormatException occurs
	// If the formatting of any variable or number is mismatched, it may result into NumberFormatException. 
	@Test(priority=2)
	public void NumberFormatExceptionTest() {
	
		String s="abc";  
		//int i=Integer.parseInt(s);//NumberFormatException 
		try {
			//code that may raise exception  
			int i=Integer.parseInt(s);
		}catch(NumberFormatException e){
			System.out.println(e);
		}
		System.out.println("rest of the code... after NumberFormatExceptionTest"); 
	}
	
	// A scenario where ArrayIndexOutOfBoundsException occurs
	// When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs.
	@Test(priority=3)
	public void ArrayIndexOutOfBoundsExceptionTest() {
	
		int a[]=new int[5];  
		//a[10]=50; //ArrayIndexOutOfBoundsException  
		try {
			//code that may raise exception  
			a[10]=50;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("rest of the code...  after ArrayIndexOutOfBoundsExceptionTest"); 
	}
	
	// Handle the exception using the parent class exception instead of generated specific type of exception.
	@Test(priority=4)
	public void HandleExceptionWithParentClass_Test() {
		
		try {
			//code that may raise exception  
			int n=50/0; //may throw exception   
		}catch(Exception e){
			System.out.println("Can't divided by zero" + e);
		}
		System.out.println("rest of the code... after HandleExceptionWithParentClass_Test"); 
	}


	// Handle the generated exception (Arithmetic Exception) with a different type of exception class (ArrayIndexOutOfBoundsException).
	@Test(priority=6)
	public void HandleExceptionWithDifferentClass_Test() {
		
		try {
			//code that may raise exception  
			int n=50/0; //may throw exception   
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Can't divided by zero" + e);
		}
		System.out.println("rest of the code...  after HandleExceptionWithDifferentClass_Test"); 
	}
	
	// Handle checked exception
	@Test(priority=5)
	public void HandleCheckedException_Test() {
		
		//PrintWriter pw = new PrintWriter("jtp.txt"); //may throw exception   
		//pw.println("saved"); 
		
		try {
			//code that may raise exception  
			PrintWriter pw = new PrintWriter("jtp.txt");  
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
		
		System.out.println("rest of the code... after HandleCheckedException_Test"); 
	}
}
