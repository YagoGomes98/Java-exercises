public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3};
        System.out.println(findMissingNumber(nums)); // Output: 2
    }
}
