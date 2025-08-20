package coreJava;

import java.util.Arrays;

// reverse vowels in String 
public class ReverseVowels {
	public static void main(String[] args) {
		String s = "IceCreAm";
  
		
		char[] arr = s.toCharArray();
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A'
					|| arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
				builder.append(arr[i]);
			}

		}
		String vowels = builder.reverse().toString();
		int count = 0 ; 
		int length = vowels.length();
		char[] vowelsArr = vowels.toCharArray(); 	//aiee
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A'
					|| arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
				while(count!= length) {
					System.out.println(vowelsArr[count]);
					arr[i] = vowelsArr[count];
					count++;
				}
			}
			System.out.println(arr[i]);
		}
		
//		System.out.println(Arrays.toString(arr));


	}

}
