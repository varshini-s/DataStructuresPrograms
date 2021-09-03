package com.bridgelabz.datastructuresprograms;

import java.util.Scanner;

import com.bridgelabz.datastructures.MyLinkedList;
import com.bridgelabz.datastructures.MyNodeImpl;
import com.bridgelabz.datastructures.MyStack;

public class BalancedParentheses 

{

	public static boolean checkForBalancedParenthese(String[] arithmeticExpression)
	{
		MyStack<String> stack = new MyStack<>();

		for(int index=0;index<arithmeticExpression.length;index++)
		{
			String currentString=arithmeticExpression[index];
			MyNodeImpl<String> myNode = new MyNodeImpl<String>(currentString);

			if (currentString.equals("{") ||currentString.equals("(") || currentString.equals("["))
			{
				stack.push(myNode);
			}
			if (currentString.equals("}") ||currentString.equals(")") || currentString.equals("]"))
			{
				if (stack.isEmpty())
					return false;
				String lastString = stack.peek().getKey();

				if (currentString.equals("}") && lastString.equals("{") || currentString.equals(")") && lastString.equals("(") ||currentString.equals("]") && lastString.equals("["))
					stack.pop();
				else 
					return false;
			}
		}
		
		


	}

	public static void main(String[] args) 

	{
		System.out.println("enter the Arithmetic expression :");
		Scanner scanner = new  Scanner(System.in);
		String string=scanner.nextLine();

		String[] arithmeticExpression = string.split("");


		boolean result=checkForBalancedParenthese(arithmeticExpression);

		if(result==true)
		{
			System.out.println("Given expression "+string+"  is balanced");
		}
		else
		{
			System.out.println("Given expression "+string+"  is not balanced");

		}



	}

}
