package Strings;

import java.util.Scanner;

//Given a non-empty string and an int n, return a new string where the char at index n has 
//		been removed. The value of n will be a valid index of a char in the original string 
//		(i.e. n will be in the range 0..str.length()-1 inclusive).


//missingChar("kitten", 1) → "ktten"
//missingChar("kitten", 0) → "itten"
//missingChar("kitten", 4) → "kittn"

public class RemoveAndAdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="kitchen";
		System.out.println(missinachar(str, 2));

	}
public static String missinachar(String str,int n) {
	String result="";
	for(int i=0;i<str.length();i++) {
		if(i==n) {
			continue;
		}else {
			result=result+str.substring(i,i+1);
		}
	}
	return result;
}
}
