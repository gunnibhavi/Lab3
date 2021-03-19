import java.util.Scanner;

/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to display number of characters,line and words in a string
 * Date=03/19/2021
 */
public class DisplayNumber {
	

	public static void main(String[] args) {
		 int count=0;
		int count1=0;
		int count2=0;
		String str="i am priti \n i love playing \n";
		for(int i=0;i<str.length();i++) {
			
		if(str.charAt(i)=='\n') {
			count++;
			
		}
		else if(str.charAt(i)==' ') {
			count1++;
		}
		else if(str.charAt(i)!=' ') {
			count2++;
		}
			
	}
		
		System.out.println("numer of lines: "+count);
		System.out.println("numer of words: "+count1);
		System.out.println("numer of characters: "+count2);
	
	
}
}
