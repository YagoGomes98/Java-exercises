import java.util.PriorityQueue;

public class NthLargestElement {
    public static int findNthLargest(int[] nums, int n) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > n) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int n = 2;
        System.out.println(findNthLargest(nums, n)); // 5
    }
}
