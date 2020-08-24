 /* Tan Dao Progreamer 
 * professor: Debra Caliss
 * CSE 360 
 * Assigment 1
 *  Class Palindrome 
 *  Octorber. 3,2019
 * 
 */

package assign1;
import java.lang.String;


public class Palindrome {                   											 // create the class Palindrome ()
	private String testString;            		 										 // private String 
	
	 public Palindrome(String text)       		 										 // fuction Palindrome (String) 
	 {
		testString =text;                 												 // declare testString to public 
	}
	
	 								// create the class to check if the String is Palindome !
	public boolean isPalindrome(String text) { 
		
		//char c[]=text.toCharArray();
		int length = text.length();     	 											// declare the length of the string 
		int forwards =0;               	 	 											// declare the beginning of the index of the String is 0
		int backwards = length-1;       	 											// declare the end of the index of the String 
		int loa=9;
		boolean a= true;                	 											// default boolean valua a as true, so if it pass all the test it return true      
		//boolean b= false;
		//String s="";
		//int i=0;
		char forwardsChar,backwardsChar; 	 											// declare the character of beginning of the String and the end of the String
		
		
		while (backwards> 1)             	 											// create the condition for the loops to stop when backwards check all the String 
		{
			 //System.out.println("forwards: "+forwards+" "+"backwards: "+backwards+"");
			
			int ascii1=text.charAt(forwards);											// declare the ascii1 as the ascii number of String(index forward) 
			int ascii2=text.charAt(backwards);  										// declare the ascii2 as the ascii number of String(index backward)
			
			
			if (text.charAt(forwards) ==' ')   											 // if the String (forwards) is a space condition
			{
				forwardsChar=text.charAt(forwards++); 									// ignore the space by increase index forward by 1
				
				//System.out.println("if space forwards");
				
			}
			else if (text.charAt(backwards)==' ') 										// if the String (backwards) is a space condition 
			{
				backwardsChar=text.charAt(backwards--); 								// ignore the space by increase the index of backwards by 1 
				
				//System.out.println("if space backwards");
			}
			/*else if (!Character.isLetter(text.charAt(forwards))) 						// condition if the String (forwards) is a punctuation or number that is not a letter 
			{
				forwardsChar=text.charAt(forwards++); 									// ignore the punctuation or number by increase the forwards index by 1
				
				//System.out.println("if letter forwards");
			}
			else if (!Character.isLetter(text.charAt(backwards))) 						// condition if  the String (backwards) is a punctuation or number that is not a letter
			{
				backwardsChar=text.charAt(backwards--); 								// ignore the punctuation or number by increase the backwards index by 1
				
				//System.out.println("if letter backwards");l
			}*/
			
			else if (!Character.isLetterOrDigit(text.charAt(forwards))||!Character.isLetterOrDigit(text.charAt(backwards))) 						// condition if the String (forwards) is a punctuation or number that is not a letter 
			{
													
				 if(Character.isDigit(text.charAt(forwards))&& Character.isDigit(text.charAt(backwards)))
						
				{
					 char forwardsChar2=text.charAt(forwards);
					 char backwardsChar2=text.charAt(backwards);
					 if(forwardsChar2!=backwardsChar2) 
					{
						a=false;
					}
					
					else 
					{
						forwards++;
						backwards--;
					}
				}
				 else if ((!Character.isLetterOrDigit(text.charAt(forwards))))
						 
				{
					 forwardsChar=text.charAt(forwards++);
					 
					 
				}
				 else if (!Character.isLetterOrDigit(text.charAt(backwards)))
						 
				{
					 
					 backwardsChar=text.charAt(backwards--);
					 
				}
				
			}
	//---------------------------------------------------------------------------------------------------		
			else if ((text.charAt(forwards)> 64 && text.charAt(forwards)< 91)) 			// condition if the String (forwards) is uppercase then compare with 2 condition of String(backwards)
			{
				if(text.charAt(backwards)> 64 && text.charAt(backwards)< 91) 			// first condition that String(backwards) is also upper case than just compare 2 String 
				{
					char forwardsChar1=text.charAt(forwards); 							// declare a String(forwards) to a character
					char backwardsChar1=text.charAt(backwards); 						// declare a String(backward) to a character
					
					if(forwardsChar1!=backwardsChar1) 									// condition of compare if the forward character is not equal the backwards character then return false 
					{
						a=false; 														// return a is false 
					}
					else 																// condition of forward character and backwards character is equal then increade both index by 1
					{
						forwards++; 													// increase the forwards index by 1
						backwards--; 													// decrease the backwards index by 1 
						int ui =9;
					}
					
				}
				else if (text.charAt(backwards)> 96 && text.charAt(backwards)< 123) 	// condition if the String(forwards) is upercase but the String(backwards) is lower case 
				{                                                                   	// then convert both if the String to acii number and plush the upper case String to 32 to convert back to lower
					ascii1=text.charAt(forwards)+32; 									// plush 32 to the ascii number of String(forwards) for upper become lower
					if(ascii1!=ascii2) 													// compare 2 ascii number if it not equal set a is false 
					{
						a=false; 														// set a is flase 
					}
					else 																// condition when both ascii number is euqal skip to the next String
					{
						forwards++; 													// skip by increase index forward by 1 
						backwards--; 													// skip by decrease index backward by 1 
					}
				}
				
			
			}
			else if (text.charAt(backwards)> 64 && text.charAt(backwards)< 91) 			// condition if String(backwards) is uppercase then check other 2 condition could happen for String(forwards)
			{
				
				if(text.charAt(forwards)> 64 && text.charAt(forwards)< 91)				// first condition when String(forwards) is upper then compare with upper String(backwards)
				{
					forwardsChar=text.charAt(forwards); 								// put the String(forwards) to a forward character 
					backwardsChar=text.charAt(backwards); 								// set the Strong(backwards) to a backward character
					if(forwardsChar!=backwardsChar)										// condition when 2 character is not equal then set a is false 
					{
						a=false; 														// set a is false         
					}
					else 																// condition if both character is equal then set it go to the next index 		
					{
						forwards++;                                                     // skip to the next index by increase forwards by 1
						backwards--; 													// skip by decrease index by 1
					}
					
				}
				else if(text.charAt(forwards)> 96 && text.charAt(forwards)< 123)		// condition when String(backwards) is upper but String(forwards) is lower 
				{
					ascii2=text.charAt(backwards)+32;									// add the ascii number of String(backwards) to convert it to lower case
					if(ascii1!=ascii2) 													// compare 2 ascii number this condition when they are not equal then set a is false
					{
						a=false; 														// set a is false
					}
					else 																// condition when 2 ascii number is qual the skip to the next String
					{
						forwards++; 													// skip to the next index
						backwards--;													// skip to the next index
					}
				}
				
				
			
			}
			/*else if (text.charAt(backwards) != text.charAt(backwards)) {
				a=false;
				 forwards++;
				 backwards--;
			}*/
			
			
			/*else if((text.charAt(backwards)> 47 && text.charAt(backwards)< 58)&&
					(text.charAt(forwards)> 47 && text.charAt(forwards)< 58))
			{
				ascii1=text.charAt(forwards);
				ascii2=text.charAt(backwards);
				if(ascii1!=ascii2)
				{
					a=false;
				}
				else 
				{
					forwards++;
					backwards--;
				}
			}*/
			
			
			
			
			
			
			
			
			
			
			
			
				
			else 																		// condition when it pass all the test condition about the increase both index 
			{
				 
			
			 forwardsChar=text.charAt(forwards++);										// increase index forward by1
			 backwardsChar=text.charAt(backwards--); 									// decease index backwards by 1
			 //forwards++;
			 //backwards--;
				
			/*forwardsChar=c[forwards++];
			backwardsChar=c[backwards--];*/
			 
			 //System.out.println(backwardsChar+" "+ forwardsChar+" coi array "+ c[forwards]+" "+c[backwards]);
			
			 
			 if(forwardsChar != backwardsChar) 											// condition when it pass all the test above but not euqal then set a to false 
				a=false;																// set a is flase
			}
			
					
		}
		
		return a;    																	// return boolean value a
	}


}
