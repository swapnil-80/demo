package programs;

import java.util.Iterator;

public class arrduplicate {

	public static void main(String[] args) {
	int [] arr = {1,2,3,4,5,3,2,1,8,9,7,8};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				System.out.println(arr[j]);
				
			}
			
		}
		
	}
		
	}
		
		
	}
		

	

