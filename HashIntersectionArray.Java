import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // Add elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check for intersection with nums2
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert the set to an array
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersect(nums1, nums2);
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: Intersection: 2
    }
}
