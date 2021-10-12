import java.util.*;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr={{1,3},{5,6},{2,4},{3,6}};
        int[][] list=mergeIntervals(arr);
        for(int[] a:list){
            System.out.println(a[0]+" "+a[1]);
        }
    }

    public static int[][] mergeIntervals(int[][] arr){
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        List<int[]> ans=new ArrayList<>();
        int[] element=arr[0];
        ans.add(element);
        for(int[] a:arr){
            if(element[1]>=a[0]){
                element[1]=Math.max(element[1], a[1]);
            }else{
                element=a;
                ans.add(element);
            } 
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
