class Solution {
    public int largestAltitude(int[] gain) {
        int maxHight =0;
        int currentHight=0;
        for(int g: gain){
               currentHight +=g;
               maxHight=Math.max(maxHight,currentHight);

        }
        return maxHight;
    }
}