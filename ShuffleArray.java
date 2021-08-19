//To shuffle the arrays
public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2*n];
        int p = 0;
        for(int i = 0;i < 2*n;i+=2){
            arr[i] = nums[p];
            if(i+1 < 2*n){
                arr[i+1] = nums[p+n];
            }
            p++;
        }
        return arr;
    }
}
