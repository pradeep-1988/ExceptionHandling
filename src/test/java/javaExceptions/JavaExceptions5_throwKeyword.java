package javaExceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.annotations.Test;

public class JavaExceptions5_throwKeyword {
	
	/*
	Java throw keyword:
	- The Java throw keyword is used to throw an exception explicitly.
	- We specify the exception object which is to be thrown. The Exception has some message with it that provides the error description. 
	- These exceptions may be related to user inputs, server, etc.
	- We can throw either checked or unchecked exceptions in Java by throw keyword.
	- It is mainly used to throw a custom exception.
	- We can also define our own set of conditions and throw an exception explicitly using throw keyword.
	*/
	
	
	
	
	// Example 1: Throwing Unchecked Exception
	// In this example, we have created a method named validate() that accepts an integer as a parameter. 
	// If the age is less than 18, we are throwing the ArithmeticException otherwise print a message welcome to vote.
	
	@Test(priority=0)
	public void TestThrow1() {
		 //calling the method  
        validate(18);  
        System.out.println("rest of the code..."); 
        System.out.println("===============================================");
	}
	
	
	//method to check if person is eligible to vote or not   
	public static void validate(int age) {
		 if(age<18) {
			  //throw Arithmetic exception if not eligible to vote  
	          throw new ArithmeticException("Person is not eligible to vote");  
		 }else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	}
	
	
	// Example 2: Throwing Checked Exception
	// If we throw a checked exception using throw keyword, it is must to handle the exception using catch block or 
	// the method must declare it using throws declaration.
	@Test(priority=1)
	public void TestThrow2() throws FileNotFoundException {
		//calling the method
		readFile();
		System.out.println("===============================================");
	}
	
	@Test(priority=2)
	public void TestThrow3() {
		//calling the method
		try {
			readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("===============================================");
	}
	
	//method to read the file
	public static void readFile() throws FileNotFoundException {
		FileReader file = new FileReader("/Users/pradeep/Documents/NewStarting_Workspace/ExceptionHandling/jtp.txt");  
        BufferedReader fileInput = new BufferedReader(file); 
        throw new FileNotFoundException();  
	}
	
	
	
	// Example 3: Throwing User-defined Exception
	
	// class represents user-defined exception  
	class UserDefinedException extends Exception  
	{  
	    public UserDefinedException(String str)  
	    {  
	        // Calling constructor of parent Exception  
	        super(str);  
	    }  
	}  
	
	@Test(priority=3)
	public void TestThrow4() {
		
		try {
			 // throw an object of user defined exception  
            throw new UserDefinedException("This is user-defined exception");  
		}catch(UserDefinedException ude) {
			 System.out.println("Caught the exception");  
			 // Print the message from MyException object  
	         System.out.println(ude.getMessage());  
		}
		System.out.println("===============================================");
		
	}

}
