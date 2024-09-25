class Solution {
    public int getSecondLargest(int[] arr) {
         if (arr.length < 2) {
            return -1; 
        }
        int lar1,lar2;
        lar1 = Integer.MIN_VALUE;
        lar2= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar1){
                lar1=arr[i];
            }
            
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>lar2 && arr[j]<lar1){
                lar2=arr[j];
            }
        }
        return (lar2 == Integer.MIN_VALUE) ? -1 : lar2;
    }
}
