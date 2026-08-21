class Solution {
    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int k : arr){
            if(largest < k){
                largest = k;
            }
        }
        return largest;
    }
}
