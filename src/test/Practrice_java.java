package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practrice_java {

	public static void main(String[] args) {
		
		String k="Prashant";
		int count =0;
		for(int i=0; i<k.length(); i++)
		{
			char a = k.charAt(i);
			if(a=='a'|| a=='e' || a=='i' || a=='o' || a=='u' || a=='A'|| a=='E' || a=='I' || a=='O' || a=='U')
			{
				
			}
			else
			{
				count++;
			}
		}
		System.out.println(count);
		System.out.println(k);
		
		System.out.println("Changed happen in the letest code");
		
	}
}
