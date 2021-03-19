import java.util.Scanner;

/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to check the entered string is positive or not
 * Date=03/19/2021
 */
public class PositiveString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=sc.next();
		System.out.println(checkPositive(str));

	}
	private static String checkPositive(String str) {
		int count=0;
		String temp=" ";
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)<str.charAt(i+1)) 
				count++;
			else
				break;
			
		}
		if(count==str.length()-1)
			temp+="positive";
		else 
			temp+="negative";
		return temp;
	}

}
