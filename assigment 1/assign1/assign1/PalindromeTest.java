/* Tan Dao programer 
 * Professor: Debra Caliss
 * Csc 360 
 * Assigment 1 
 * Junit test PalindromeTest 
 * Octerber, 3,2019
 * */


package assign1;

 import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class PalindromeTest {											// create the class test case for Palindrome
	@Before
	public void before()												// create function print before to separate beginning of test from other test
	{                                    
		System.out.println("testing Git");
		System.out.println("before");
		System.out.println("");

	}
		
	@Test
	public void isPalindorme()											// create the test to check for upper case and punctuation
	{
		System.out.println("test 1");
		java.lang.String value ="aCbbcn"; 								// test case if only upper case and lower case
		
		Palindrome T = new Palindrome(value);							// create object T from Plalindrome class
		
		boolean actualOutput=T.isPalindrome(value);						// set the object T to value in isPalindrome test
		boolean expectedOutput=false;									// set up value what i expected
		
		assertEquals(expectedOutput,actualOutput);
		
	}
	
	@Test
	public void isPalindorme2() 										// create the third test with puntuation 
	{
		System.out.println("test 2");
		java.lang.String value ="AbcCbA"; 							// create the test value with punctuation 
		
		Palindrome T = new Palindrome(value);							// call the object T to test
		
		boolean actualOutput=T.isPalindrome(value);						// set value to T
		boolean expectedOutput=true;									// expected value to be true
		
		assertEquals(expectedOutput,actualOutput);						// compare test case 
		}
		
	@Test
	public void isPalindorme3() 										// create the seccound test with space, punctuation and uppercase
	{
		System.out.println("test 3");
		java.lang.String value ="A nut for a jar of tuna.";				// create the value  with space, punctuation and uppercase
		
		Palindrome T = new Palindrome(value);							// call the object T to test
		
		boolean actualOutput=T.isPalindrome(value);						// set value to T
		boolean expectedOutput=true;									// expected value to be true
		
		assertEquals(expectedOutput,actualOutput);						// compare test case 
		}
	
	@Test
	public void isPalindorme4()											// create the fourth  test with long String and all stuff
	{
		System.out.println("test 4");
		java.lang.String value ="Eva, can I _---see bees in a cave?";  // create the value  with dash
		
		Palindrome T = new Palindrome(value);					    	// call the object T to test
		
		boolean actualOutput=T.isPalindrome(value);						// set value to T
		boolean expectedOutput=true;									// expected value to be true
		
		assertEquals(expectedOutput,actualOutput);						// compare test case
		}
	@Test
	public void isPalindorme5()  										// create the fifth  test with long String and all stuff 
	{
		System.out.println("test5");
		java.lang.String value ="Dennis, Nell, Edna, "					// create the value  with long String list
				+ "Leon, Nedra, Anita, Rolf,"
				+ " Nora, Alice, Carol, Leo, Jane, "
				+ "Reed, Dena, Dale, Basil,"
				+ " Rae, Penny, Lana, Dave, Denny, "
				+ "Lena, Ida, Bernadette,"
				+ " Ben, Ray, Lila, Nina, Jo, Ira, "
				+ "Mara, Sara, Mario, Jan,"
				+ " Ina, Lily, Arne, Bette, Dan, "
				+ "Reba, Diane, Lynn, Ed, "
				+ "Eva, Dana, Lynne, Pearl, Isabel, "
				+ "Ada, Ned, Dee, Rena, Joel, Lora, "
				+ "Cecil, Aaron, Flora, Tina, Arden, "
				+ "Noel, and Ellen sinned.";
		
		Palindrome T = new Palindrome(value);							// call the object T to test
		//System.out.println(value.charAt(192)+" "+value.charAt(193));
		boolean actualOutput=T.isPalindrome(value);						// set value to T
		boolean expectedOutput=true;									// expected value to be true
		
		assertEquals(expectedOutput,actualOutput);						// compare test case
		}
	
	@Test
	public void isPalindorme6()											// create the sixth  test with number
	{
		System.out.println("test 6");
		java.lang.String value ="1234An--a b banA4321";     					// create the value  with number
		
		Palindrome T = new Palindrome(value);					    	// call the object T to test
		
		boolean actualOutput=T.isPalindrome(value);						// set value to T
		boolean expectedOutput=true;									// expected value to be true
		
		assertEquals(expectedOutput,actualOutput);						// compare test case
		}
	
	
	
	@After
	public void after()                                             // create the function print after to show the end of each test.              				
	{
		System.out.println("");
		System.out.println("after");
		System.out.println("");
	}
	

}
