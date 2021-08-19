//To print new array after duplicating all the zeros
class DuplicateZero {
    public void duplicateZeros(int[] arr) {
        int l = arr.length;
        for(int i=l-2;i>=0;i--){
            if(arr[i] == 0){
                for(int j = l-2;j>i;j--){
                    arr[j+1] = arr[j];
                }
                arr[i+1]=0;
            }
        }
    }
}