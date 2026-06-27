class Solution {
    public void rotate(int[][] arr) {
       int n=arr.length;
       for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            int temp = arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;

        }
       }
       for(int i=0;i<n;i++){
        int stcol=0, endcol=n-1;
        while(stcol<endcol){
       
       int temp=arr[i][stcol];
       arr[i][stcol]=arr[i][endcol];
       arr[i][endcol]=temp;
       stcol++;
       endcol--;
       }
        }
        
    }

}