public class MissingNumberFinder {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6};
        System.out.println(findMissingNumber(nums)); // Output: 4
    }
}
