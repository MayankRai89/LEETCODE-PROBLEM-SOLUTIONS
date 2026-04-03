import java.util.*;

public class Threesumclosest {
    public static int closestSum(int nums[], int target) {
        Arrays.sort(nums);
        int ClosestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int currentsum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - currentsum) < Math.abs(target - ClosestSum)) {
                    ClosestSum = currentsum;
                }
                if (currentsum < target) {
                    left++;
                } else if (currentsum > target) {
                    right--;
                } else {
                    return currentsum;
                }
            }

        }
        return ClosestSum;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Enter the elements in array
        System.out.print("Enter elements in array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // printing elements in an array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int closest = closestSum(nums, target);
        System.out.println(closest);

    }
}
