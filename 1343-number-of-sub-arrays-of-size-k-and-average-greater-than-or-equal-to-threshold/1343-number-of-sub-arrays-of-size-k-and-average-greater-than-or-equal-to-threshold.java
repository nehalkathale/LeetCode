class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int average = 0, count = 0, sum =0, tempSum =0;;
        for(int i =0;i<k;i++){
            sum += arr[i];
        }    
        average = sum/k;
        if(average >= threshold){
            count++;
        }
         
        for(int i = k; i<arr.length ;i++){
            sum = sum - arr[i-k] + arr[i];
            average = sum /k;
            if(average >= threshold){
                count++;
            }
        }
        return count;
    }
}