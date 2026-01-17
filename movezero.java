import java.util.*;

class movezero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int low=0;
        for(int high=0;high<arr.length;high++){
            if(arr[high]!=0){
                arr[low]=arr[high];
                low++;
            }
        }
        for(int i=low;i<arr.length;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));

    
    }
}
