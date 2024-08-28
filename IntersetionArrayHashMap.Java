import java.util.HashMap;
import java.util.Map;

public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        // Fill the map with counts of nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find intersection
        int[] temp = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                temp[index++] = num;
                map.put(num, map.get(num) - 1);
            }
        }

        // Trim the result array
        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] result = intersect(nums1, nums2);
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: Intersection: 4 9
    }
}
