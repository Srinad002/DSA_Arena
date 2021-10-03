import java.util.LinkedHashSet;
import java.util.Set;


public class FindDuplicateElements{
    public static void main(String[] args) {
        
    }

    // This is my own algorithm
    public static int findDuplicateElements(int[] arr){
        Set<Integer> set= new LinkedHashSet<>();
        for(int a:arr){
            boolean flag=set.add(a);
            if(!flag) return a;
        }
        return 0;
    }

    // This is Learned one
    public static int duplicate(int [] arr){
        boolean [] trueOrFalse = new boolean[arr.length+1];
        int index=0;
        while(!trueOrFalse[arr[index]]){
            trueOrFalse[arr[index++]]=true;
        }
        return arr[index];
    }
}