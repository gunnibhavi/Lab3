import java.util.Scanner;

/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to replace an consonents in a String to its next alphabet
 * Date=03/19/2021
 */
public class StringReplace {

	public static void main(String[] args) {
String str;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		str=sc.next();
		System.out.println(alterString(str));
	}
public static String alterString(String str) {
		
		String str1="";
		int len=str.length();
		
		for(int i=0;i<len;i++) {
			if(str.charAt(i)=='a' || 
					str.charAt(i)== 'e' || 
					str.charAt(i)=='i' || 
					str.charAt(i)=='o' ||
					str.charAt(i)=='u'||str.charAt(i)=='A' || 
					str.charAt(i)== 'E' || 
					str.charAt(i)=='I' || 
					str.charAt(i)=='O' ||
					str.charAt(i)=='U') 
				str1=str1+str.charAt(i);
			else
			{
				char ascii=(char)((char)str.charAt(i)+1);
				str1=str1+ascii;
			}
			}
		return str1;
		
}
}
