/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to modify the number such that each digit of the newly
 * formed number is equal to the difference between two consecutive numbers
 * Date=03/19/2021 
 */
import java.util.Scanner;

public class NumberModufication {
	static String temp;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		System.out.println( modifyNumber(n)+temp);
		
	}
	public static int modifyNumber(int n) {
		
		int output=0;
		String str=Integer.toString(n);
		int len=str.length();
		temp=Integer.toString(n%10);
		
		for(int i=0;i<len-1;i++) {
			
				int diff=str.charAt(i)-str.charAt(i+1);
				output=output*10+Math.abs(diff);
			}
			
		
		return output;
	}

}