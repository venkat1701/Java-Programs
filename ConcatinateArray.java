//To concatenate an array with itself
public class ConcatinateArray {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int arr[] = new int[len+len];
        for(int i = 0;i<len;i++){
            arr[i] = nums[i];
            arr[i+len] = nums[i];
        }
        return arr;
    }
}
