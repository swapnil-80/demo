package programs;

import java.util.Iterator;

public class strngtotalcount {

	public static void main(String[] args) {
	String S1 = "you are so smart";
	int count = 0;
	
	
for (int i = 0; i < S1.length(); i++) {
	
	if (S1.charAt(i)!=' ')
	{
		count++;
	}
	
	
}
	System.out.println("total count " + count);	
	}
		

	}


