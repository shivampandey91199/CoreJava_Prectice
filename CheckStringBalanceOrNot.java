package coreJava;

public class CheckStringBalanceOrNot {

	public static void main(String[] args) {
		String str = "({[(())])(()())";
		// check this parenthesis balanced or not
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) =='(' || str.charAt(i)=='{' || str.charAt(i)=='[') {
				count++;
			}else {
				 count--;
			}
		}
		
		if(count ==0) {
			System.out.println("String is balanced");
		}else {
			System.out.println("String isn't balanced");
		}
	}
}
