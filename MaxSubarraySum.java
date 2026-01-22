import java.util.Scanner;

public class MaxSubarraySum {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Maximum Subarray Sum: " + maxSubArray(arr));
        sc.close();
    }
}
