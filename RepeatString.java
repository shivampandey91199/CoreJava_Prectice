package coreJava;
/*
 *  str1="abcabc" str2="abc"
 *  output="abc"
 *  
 *  str1="ababab" str2="abab"
 *  output="ab"
 *  
 *  str1="leet" str2="code"
 *  output="";
 */

public class RepeatString {
	
	    public static void main(String[] args) {
	        System.out.println(gcdOfStrings("abcabc", "abc"));    
	        System.out.println(gcdOfStrings("ababab", "ab"));    
	        System.out.println(gcdOfStrings("leet", "code"));      
	    }

	    public static String gcdOfStrings(String str1, String str2) {
	      
	        if (!(str1 + str2).equals(str2 + str1)) {
	            return "";
	        }
	       
	        int gcdLength = gcd(str1.length(), str2.length());
	        return str1.substring(0, gcdLength);
	    }

	    private static int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
	}
