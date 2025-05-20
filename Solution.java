//code for finding the type of triangle
// based on the lengths of its sides
// The code checks if the sides can form a triangle and determines its type
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public String triangleType(int[] nums) {
        // Sort the sides to simplify triangle inequality check
        Arrays.sort(nums);

        // Check triangle inequality
        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        }

        // Determine triangle type
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        } else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            nums[i] = scn.nextInt();
        }

        Solution tt = new Solution(); // Correct class name
        String result = tt.triangleType(nums); // Correct method name
        System.out.println(result);
    }
}


//program to check if an array can be transformed into a zero array
// by applying a series of operations defined by the queries
public class ZeroArrayTransformer {
    public boolean canTransformToZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];

        // Build difference array from queries
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            diff[l] += 1;
            if (r + 1 < n) {
                diff[r + 1] -= 1;
            }
        }

        // Convert difference array to actual coverage count
        int[] coverage = new int[n];
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += diff[i];
            coverage[i] = curr;
        }

        // Check if each index in nums can be decremented enough
        for (int i = 0; i < n; i++) {
            if (coverage[i] < nums[i]) {
                return false;
            }
        }
        return true;
    }

    // Test case
    public static void main(String[] args) {
        ZeroArrayTransformer transformer = new ZeroArrayTransformer();
        int[] nums = {1, 0, 1};
        int[][] queries = {{0, 2}};

        boolean result = transformer.canTransformToZeroArray(nums, queries);
        System.out.println(result);  // Output: true
    }
}

