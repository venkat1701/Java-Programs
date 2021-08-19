//To create a new array with running sum of elements in a given array
public class RunningSum {
    public int[] runningSum(int[] nums) {
        int arr[]=new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
