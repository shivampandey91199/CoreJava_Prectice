/*
 *  intput 1
 * String s1="abc";
 * String s2=pqr
 * output=apbqcr
   
    input2 
    s1
 *
 *
 */

package coreJava;

public class MergeString {
	public static void main(String[] args) {
		String mergeString = mergeString("abcde", "pq");
		System.out.println(mergeString);
	}
	private static String mergeString(String s1, String s2) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < Math.max(s1.length(), s2.length()); i++) {
			if (i < s1.length()) {
				builder.append(s1.charAt(i));
			}
			if (i < s2.length()) {
				builder.append(s2.charAt(i));
			}
		}
		String s3 = builder.toString();
		return s3;

	}
}
