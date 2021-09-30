public class MinimumNumberOfJumps {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1,1};
        System.out.println(minmumJumps(arr));
    }

    public static int minmumJumps(int[] arr){
        int maxReach=arr[0];
        int initialReachIndex=arr[0];
        int jump=1;
        if(arr[0]==0) return -1;
        for(int i=1; i<arr.length;i++){
            if(i>maxReach) return -1;
            if(i==arr.length-1) return jump;
            if(maxReach<i+arr[i]){
                maxReach=i+arr[i];
            }
            if(initialReachIndex==i){
               initialReachIndex=maxReach; 
               jump++;
            } 
        }
         
        return jump;
    }
}
