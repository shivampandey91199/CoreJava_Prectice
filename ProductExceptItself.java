package coreJava;

import java.util.Arrays;

public class ProductExceptItself {
	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));

	}

	private static int[] productExceptSelf(int[] nums) {
		int[] products = new int[nums.length];
		int product = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i == j) {
					continue;
				} else {
					product *= nums[j];
				}
			}
			products[i]=product;
			product=1;
		}
	//	System.out.println(Arrays.toString(products));
		return products;
	}
}
