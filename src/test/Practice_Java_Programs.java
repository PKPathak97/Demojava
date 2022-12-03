package test;

import java.util.HashSet;
import java.util.Set;

public class Practice_Java_Programs {

	public static void main(String[] args)
	{
		String l ="All Pathak Brothers";
		
		String [] words =l.split(" ");
		String revAll ="";
		for(String word :words)
		{
			String revW="";
			for(int i=word.length()-1;i>=0; i--)
			{
				revW = revW+word.charAt(i);
			}
			revAll=revAll+revW+ " ";
		}
		System.out.println(revAll+ " ");
		
		
		
 
	}
}

