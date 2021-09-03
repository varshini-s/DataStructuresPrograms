package com.bridgelabz.datastructuresprograms;

import java.util.Scanner;

import com.bridgelabz.datastructures.INodeIF;
import com.bridgelabz.datastructures.MyLinkedList;
import com.bridgelabz.datastructures.MyNodeImpl;

public class UnOrderedList 
{

	public static void main(String[] args) 
	{
		

		System.out.println("enter the list of words :");
		Scanner scanner = new  Scanner(System.in);
		String string=scanner.nextLine();
		
		String[] listOfWordsStrings = string.split(" ");
		
		MyLinkedList<String> linkedList = new MyLinkedList<>();
		
		
		for(int index=0;index<listOfWordsStrings.length;index++)
		{
			String currentString=listOfWordsStrings[index];
			MyNodeImpl<String> myNode= new MyNodeImpl<String>(currentString);

			linkedList.appendNode(myNode);
			
		}
		

		System.out.println("enter the key word to search");
		String key=scanner.next();
		
		MyNodeImpl<String> searchNode= new MyNodeImpl<String>(key);

				
		if(linkedList.search(key)==null)
		{
			System.out.println("given word is not found in the list, hence adding it to the list:");
			linkedList.appendNode(searchNode);
		}
		else
		{
			System.out.println("given word is  found in the list, hence removing it from the list:");
			linkedList.deleteGivenKeyNode(key);
		}
		
		System.out.println(linkedList);

		
		
		scanner.close();
		
	}

}
