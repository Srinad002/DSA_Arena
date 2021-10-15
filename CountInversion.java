import java.util.Arrays;

public class CountInversion {
    public static void main(String[] args) {
        long[] arr={8,3,2,1,0};
        long ans=countInversion(arr, 0, 4);
        System.out.println(ans);
    }

    public static long countInversion(long[] arr, int l, int r){
        long count=0;
        if(l<r){
            int m=l+(r-l)/2;
            count+=countInversion(arr, l, m);
            count+=countInversion(arr, m+1, r);

            count+=mergeCount(arr, l, m, r);
        }
        return count;
    }

    public static long mergeCount(long[] arr, int l, int m, int r){
        
        long[] left=Arrays.copyOfRange(arr, l, m+1);
        long[] right=Arrays.copyOfRange(arr, m+1, r+1);

        int i=0, j=0, k=l;
        long swap=0;

        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
                swap+=m+1-(l+i);
            }
        }
        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
        return swap;
    }
}
