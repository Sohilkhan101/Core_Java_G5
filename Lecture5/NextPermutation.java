package Lecture5;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 3,2,1 };

		int p = 0;

		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				p = i;
				break;
			}
		}
		System.out.println(p);

		int q = 0;

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[p] < nums[i]) {
				q = i;
				break;
			}
		}
		System.out.println(q);

		if (p == q) {
			reverse(0, nums.length - 1, nums);
			System.out.println(Arrays.toString(nums));
			return;
		}

		int t = nums[p];
		nums[p] = nums[q];
		nums[q] = t;
		reverse(p + 1, nums.length - 1, nums);
		System.out.println(Arrays.toString(nums));

	}

	public static void reverse(int start, int end, int[] nums) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
