package com.bridgelabz.datastructuresprograms;

import java.util.Arrays;
import java.util.LinkedList;

import com.bridgelabz.datastructures.MyNodeImpl;
import com.bridgelabz.datastructures.MyQueue;
import com.bridgelabz.datastructures.MyStack;

public class PrimeAnagramUsingQueue

{
	public static void checkAnagramsUsingQueue(LinkedList<Integer> listOfPrime)
	{
		
		MyQueue<String> queue = new MyQueue<String>();


		for(int index1=0;index1<listOfPrime.size();index1++)
		{
			for(int index2=index1;index2<listOfPrime.size();index2++)
			{
				boolean isAnagram = true;
				boolean isPalindrome = true;  

				String string1=String.valueOf(listOfPrime.get(index1));

				String string2=String.valueOf(listOfPrime.get(index2));


				if(string1.length()!=string2.length())
				{
					isAnagram=false;
				}

				char string1Characters[] = string1.toCharArray();
				char string2Characters[] = string2.toCharArray();

				String[] firstString = new String[string1Characters.length];
				String[] secondString = new String[string2Characters.length];

				for(int index=0;index<string1Characters.length;index++)
				{
					firstString[index]=String.valueOf(string1Characters[index]);

				}
				for(int index=0;index<string1Characters.length;index++)
				{
					secondString[index]=String.valueOf(string2Characters[index]);

				}

				Arrays.sort(string1Characters);
				Arrays.sort(string2Characters);

				for(int index=0;index<string1.length();index++)
				{
					if(string1Characters[index]!=string2Characters[index])
					{
						isAnagram= false;
					}

				}


				if(isAnagram==true && string1.equals(string2)==false)
				{
					
					MyNodeImpl<String> node1= new MyNodeImpl<String>(string1);
					queue.enqueue(node1);
					MyNodeImpl<String> node2= new MyNodeImpl<String>(string2);
					queue.enqueue(node2);




				}

			}

		}
		
		System.out.println(queue);


	}


	public static void main(String[] args)

	{
		LinkedList<Integer> listOfPrime=PrimeNumber.findPrimeNumbers(0, 1000);

		checkAnagramsUsingQueue(listOfPrime);



	}

}
