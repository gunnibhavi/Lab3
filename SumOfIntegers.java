/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to find sum of integers
 * Date=03/19/2021 
 */
import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		String[] str=new String[n];
		System.out.println("Enter elments: ");
		for(int i=0;i<n;i++){
			str[i]=sc.next();}
		for(int i=0;i<n;i++) {
	System.out.println(str[i]);
		}
	int sum=0;
	for(int i=0;i<n;i++){
		sum+=(Integer.parseInt(str[i]));
	}
	System.out.println(sum);
	}
		
		
	}	
		

	


