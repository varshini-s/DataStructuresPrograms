package com.bridgelabz.datastructuresprograms;

import java.util.Scanner;

import com.bridgelabz.datastructures.MyLinkedList;
import com.bridgelabz.datastructures.MyNodeImpl;
import com.bridgelabz.datastructures.MyOrderedList;

public class OrderedList 
{

	public static void main(String[] args) 
	
	{
		System.out.println("enter the size of numbers :");
		Scanner scanner = new  Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("enter "+size+" numbers");

		MyOrderedList<Integer> orderedLinkedList = new MyOrderedList<Integer>();
		
		//to add numbers into ordered list
		for(int index=0;index<size;index++)
		{
			Integer number=scanner.nextInt();
			MyNodeImpl<Integer> myNode= new MyNodeImpl<Integer>(number);

			orderedLinkedList.addIncreasingOrder(myNode);
			
		}
		
		
		System.out.println("enter the key number to search");
		Integer key = scanner.nextInt();
		
		MyNodeImpl<Integer> searchNode= new MyNodeImpl<Integer>(key);

		//searching for the key, and popping if present else adding it	
		if(orderedLinkedList.search(key)==null)
		{
			System.out.println("Given number is not found in the list, hence adding it to the list:");
			orderedLinkedList.addIncreasingOrder(searchNode);
		}
		else
		{
			System.out.println("Given number is  found in the list, hence removing it from the list:");
			searchNode=(MyNodeImpl<Integer>) orderedLinkedList.deleteGivenKeyNode(key);
		}
		
		
		System.out.println(orderedLinkedList);

		
		

	}

}
