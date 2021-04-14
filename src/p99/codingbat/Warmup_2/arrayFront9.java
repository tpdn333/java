package p99.codingbat.Warmup_2;

public class arrayFront9 {
	public boolean arrayFront9(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i < 4) {
				if (nums[i] == 9) {
					return true;
				}
			} else {
				return false;
			}
		}
		return false;
	}

}
