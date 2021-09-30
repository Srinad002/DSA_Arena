import java.util.Arrays;

public class MinimiseTheMaximumDifference {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int res=minimiseTheMaximumDifference(arr, 2);
        System.out.println(res);
    }

    public static int minimiseTheMaximumDifference(int[] arr, int k){
        int n=arr.length;
        Arrays.sort(arr);
        int max=arr[n-1];
        int min=arr[0];
        int res=max-min;
        for(int i=1;i<n-1;i++){
            max=Math.max(arr[n-1]-k, arr[i-1]+k);
            min=Math.min(arr[0]+k,arr[i]-k);
            if(min<0) continue;
            res=Math.min(res, max-min);
        }
        return res;
    }
}
