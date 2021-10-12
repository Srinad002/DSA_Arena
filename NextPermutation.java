import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr={2,1,3,7,4,5,3,2,1};
        List<Integer> list=nextPermutation(arr);
        for(int a:list){
            System.out.print(
                a+" "
            );
        }
    }

    public static List<Integer> nextPermutation(int[] arr){
        int n=arr.length;
        List<Integer> list=new ArrayList<>();

        int i=n-2, j=n-1;
        for(;i>=0;i--){
            if(arr[i]<arr[i+1]) break;
        }

        if(i>=0){

            for(;j>=0;j--){
                if(arr[j]>arr[i]) break;
            }

            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }

        int l=n-1;
        for(int k=0;k<n;k++){
            if(k<=i){
                list.add(arr[k]);
            }else{
                list.add(arr[l--]);
            } 
        }
        return list;
    }
}
