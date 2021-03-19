/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to get the mirrorimage of String
 * Date=03/19/2021
  */
import java.util.Scanner;

public class MirrorImage {

	public static void main(String[] args) {
		String str;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		str=sc.next();
		
		 System.out.println(reverseString(str));
		}

	public static String reverseString(String str) {
		
		StringBuffer str1=new StringBuffer(str);
		str1.reverse( );
		return str+"|"+str1;
	}
	

}
