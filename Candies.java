//Kids With the Greatest Number of Candies
class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<Boolean>(candies.length);
        for(int i = 0;i<candies.length;i++){
            int max = 0,k=0;
            max = candies[i] + extraCandies;
            for(int j=0;j<candies.length;j++){
                if(max<candies[j]){
                    k=1;
                    break;
                }
            }
            if(k==1){
                list.add(false);
            }
            else{
                list.add(true);
            }
        }
        return list;
    }
}