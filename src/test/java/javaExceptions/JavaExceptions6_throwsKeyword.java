package javaExceptions;

import java.io.IOException;

import org.testng.annotations.Test;

public class JavaExceptions6_throwsKeyword {
	
	/*
	 Java throws keyword:
	 - The Java throws keyword is used to declare an exception. 
	 - It gives an information to the programmer that there may occur an exception. 
	 - So, it is better to provide the exception handling code so that the normal flow of the program can be maintained.
	 
	 Note:
	 - Exception Handling is mainly used to handle the checked exceptions such as IOException, ClassNotFoundException. 
	 - If there occurs any unchecked exception such as NullPointerException, it is programmers' fault that he/she is not checking the code before it being used.
	
	 Which exception should be declared?
	 - Checked exception only.
	 - Unchecked exception are under our control so we can correct our code.
	 - error is beyond our control. For example, we are unable to do anything if there occurs VirtualMachineError or StackOverflowError.
	 
	 */
	
	
	public void m() throws IOException {
		throw new IOException("device error");//checked exception  
	}
	
	public void n() throws IOException {
		m();
	}
	
	public void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}
	
	@Test
	public void TestThrows1() {
		p();
		System.out.println("normal flow...");  
	}
	
	
	/*
	
	Difference between throw and throws in Java:
	- Java throw keyword is used to throw an exception explicitly in the code, inside the function or the block of code.
	- Java throws keyword is used to declare an exception in the method signature, which might be thrown by the function while the execution of the code.
	
	- We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions.
	- We can declare multiple exceptions using throws keyword that can be thrown by the method. For example, method m1() throws IOException, SQLException.
	*/

}
