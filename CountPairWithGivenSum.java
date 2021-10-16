import java.util.*;
public class CountPairWithGivenSum {
    public static void main(String[] args) {
        int[] arr={1,5,7,1};
        int count =countPairs(arr, 6);
        System.out.println(count);
    }

    public static int countPairs(int[] arr, int sum){

        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==null){
                map.put(arr[i], 0);
            }
            map.put(arr[i], map.get(arr[i])+1);
        }
        int count=0;
        for(int j=0;j<arr.length;j++){

            if(map.get(sum-arr[j])!=null)
            count+=map.get(sum-arr[j]);

            if(arr[j]==sum-arr[j]){
                count--;
            }
        }
        return count/2;
    }
}
