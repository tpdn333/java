package p99.codingbat.Warmup_2;

public class array123 {
	public static boolean array123(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 1, 2, 3 };
		boolean res = array123(nums);
		System.out.println(res);
	}
}
