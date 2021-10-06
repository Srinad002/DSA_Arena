import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1={1,3,8};
        int[] nums2={2,4,7};
        // mergeArray(nums1, nums2);
        merge(nums1, nums2, 3, 3);
        for(int a: nums1){
            System.out.print(a+" ");
        }
        System.out.println(" ");;
        for(int b:nums2){
            System.out.print(b+" ");
        }
        

    }

    // This is with O(m*n) time complexity
    public static void mergeArray(int[] nums1, int[] nums2){
        for(int j=nums2.length-1;j>=0;j--){
            int i,last=nums1[nums1.length-1];
            for(i=nums1.length-2;i>=0 && nums1[i]>nums2[j];i--){
                nums1[i+1]=nums1[i];
            }
            if(i!=nums1.length-2||last>nums2[j]){
                nums1[i+1]=nums2[j];
                nums2[j]=last;
            }
        }
    }

    // This is with O(m+n)log(m+n) time complexity
    public static void merge(int[] ar1,int[] ar2, int m, int n){
        int i=0,j=0,k=m-1;
        while(i<=k&&j<n){
            if(ar1[i]<ar2[j]){
                i++;
            }else{
                int temp=ar1[k];
                ar1[k]=ar2[j];
                ar2[j]=temp;
                j++;
                k--;
            }
        }
        Arrays.sort(ar1);
        Arrays.sort(ar2);
    }
} 