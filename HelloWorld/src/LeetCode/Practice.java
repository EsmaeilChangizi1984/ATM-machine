package LeetCode;

import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {

		//Palindrome(122);
		//validParentheses("()");
		checkStrings("life","file");

	}

/////////////////////////////////////////////////////////////////////////////////

	public static void Palindrome(int num) {

		int remainder;
		int reverse = 0;
		int temp = num;

		while (num > 0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num /= 10;
		}

		if (reverse == temp) {
			System.out.println("Number is Palindrom.");
		} else {
			System.out.println("Number is not Palindrom.");
		}

	}

	////////////////////////////////////////////////////////////////////////

	public static void validParentheses(String s) {

		Stack<Character> left = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				left.push(c);
				
			} else if (c == ')' && !left.isEmpty() && left.peek() == '(') {
				left.pop();
				System.out.println("Valid Parentheses.");
			} else if (c == ']' && !left.isEmpty() && left.peek() == '[') {
				left.pop();
				System.out.println("Valid Parentheses.");
			} else if (c == '}' && !left.isEmpty() && left.peek() == '{') {
				left.pop();
				System.out.println("Valid Parentheses.");
			}else {
				System.out.println("Wrong icon.");
			}
		}

	}
	
	///////////////////////////////////////////////////////////////////////////////////
	static void checkStrings(String s1, String s2) {  
		  //s1.replaceAll("\\s", "");  
		  //s2.replaceAll("\\s", "");  
		  boolean result = true;  
		  if (s1.length() != s2.length()) {  
		   result = false;  
		  } 
		  else {  
		   char[] s1Ch = s1.toLowerCase().toCharArray();  
		   char[] s2Ch = s2.toLowerCase().toCharArray();  
		   Arrays.sort(s1Ch);  
		   Arrays.sort(s2Ch);  
		   result = Arrays.equals(s1Ch, s2Ch);  
		  }  
		        
		  if (result) {  
		   System.out.println(s1 + " and " + s2 + " are anagrams");  
		  } 
		  else {  
		   System.out.println(s1 + " and " + s2 + " are NOT anagrams");  
		  }  
		 }  

}
