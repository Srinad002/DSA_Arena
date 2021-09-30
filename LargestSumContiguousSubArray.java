public class LargestSumContiguousSubArray {
    public static void main(String[] args) {
        
    }

    public static int largestSumContiguousSubArray(int[] arr) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            maxSum=Math.max(maxSum, currentSum);
            if(currentSum<0) currentSum=0;
        }
        return maxSum;
    }
}
