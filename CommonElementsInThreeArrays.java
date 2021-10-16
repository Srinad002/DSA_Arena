import java.util.*;
public class CommonElementsInThreeArrays {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5,6,7,8,9,10};
        int[] array2={2,4,8,10};
        int[] array3={3,8,4};
        System.out.println(countElements(array1, array2, array3));
    }

    public static ArrayList<Integer> countElements(int[] array1, int[] array2, int[] array3){
        ArrayList<Integer> array = new ArrayList<>();
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<array1.length;i++){
            map.put(array1[i], 1);
        }
        for(int j=0;j<array2.length;j++){
            if(map.get(array2[j])==1){
                map.replace(array2[j], 1, 2);
            }
        }
        for(int k=0;k<array3.length;k++){
            if(map.get(array3[k])==2){
                map.replace(array3[k], 2, 3);
                if(!array.contains(array3[k])) array.add(array3[k]);
            }
        }
        return array;
    }
}
