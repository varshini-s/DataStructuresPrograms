package com.bridgelabz.datastructuresprograms;

import com.bridgelabz.datastructures.MyNodeImpl;

import java.util.Scanner;

import com.bridgelabz.datastructures.MyDeque;

public class PalindromeChecker 
{

	public static boolean checkForPalindrome(String[] arrayOfCharacters)
	{
		
		MyDeque<String> deque = new MyDeque<String>();
		for(int index=0;index<arrayOfCharacters.length;index++)
		{
			MyNodeImpl<String> myNode = new MyNodeImpl<String>(arrayOfCharacters[index]);
			deque.addRear(myNode);
		}
		
		//check till size of queue becomes 0 or 1
		while(deque.size()!=0 && deque.size()!=1)
		{
			String firstCharacter=deque.removeFront().getKey();
			String lastCharacter=deque.removeRear().getKey();
			//if both the ends of queue are equal continue
			if(firstCharacter.equals(lastCharacter))
			{
				continue;
			}
			else
			{
				return false;
			}
			
		}
		
		
		return true;
		


	}

	public static void main(String[] args) 
	{

		System.out.println("enter the  expression :");
		Scanner scanner = new  Scanner(System.in);
		String string=scanner.nextLine();

		String[] arrayOfCharacters = string.split("");


		boolean result=checkForPalindrome(arrayOfCharacters);
		
		if(result==true)
		{
			System.out.println("Given expression "+string+"  is a palindrome");
		}
		else
		{
			System.out.println("Given expression "+string+"  is not palindrome");

		}
			

		scanner.close();

	}

}
