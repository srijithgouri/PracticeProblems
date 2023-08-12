package Strings;

public class ReverseAstring {

	public static void main(String[] args) {
		String str="Srijith";
		System.out.println(reverse(str));
//		by using string buffer also we can reverse the string
	StringBuffer sb=new StringBuffer(str);
	System.out.println(sb.reverse());
	StringBuilder sb1=new StringBuilder(str);
	System.out.println(sb1.reverse());
	}
	public static String reverse(String str) {
		String result="";
		char[] chAr=str.toCharArray();
		for(int i=chAr.length-1;i>=0;i--) {
			result+=chAr[i];
		}
		return result;
}
	
}
