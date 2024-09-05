import java.util.Arrays;

public class ClosestPairFinder {
    public static int[] findClosestPair(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[2];
        int closestSum = Integer.MAX_VALUE;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                closestSum = sum;
                result[0] = arr[left];
                result[1] = arr[right];
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 10};
        int target = 15;
        int[] pair = findClosestPair(arr, target);
        System.out.println("Pair: " + pair[0] + ", " + pair[1]);
    }
}
