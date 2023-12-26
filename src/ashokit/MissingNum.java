package ashokit;
public class MissingNum{

    private static int findMissingNumber(int[] nums) {
        int n = nums.length + 1; // Total numbers including the missing number
        int totalSum = (n * (n + 1)) / 2; // Sum of all numbers from 1 to n
        
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num; // Sum of numbers in the array
        }
        
        return totalSum - arraySum; // Difference is the missing number
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 3, 7, 8}; // Example array with a missing number
        int missingNumber = findMissingNumber(nums);
        
        System.out.println("The missing number is: " + missingNumber);
    }
}
