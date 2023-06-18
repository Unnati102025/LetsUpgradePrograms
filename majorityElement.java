import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static int findMajorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Finding the majority element
        int majorityThreshold = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > majorityThreshold) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 5, 5, 5, 5};
        int result = findMajorityElement(nums);
        System.out.println(result);
    }
}