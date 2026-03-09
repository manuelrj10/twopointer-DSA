
import java.util.ArrayList;
import java.util.List;

class RemoveDuplicates{
    public static void main(String[] args){
        int[] arr={1,1,2,2,3,4,4};
        int left=0;
        for(int right=0;right<arr.length;right++){
            if(arr[left]!=arr[right]){
                left++;
                arr[left]=arr[right];
            }
        }
        List<Integer> arr1=new ArrayList<>();
        for(int i=0;i<left+1;i++){
            arr1.add(arr[i]);
        }
        System.out.println(arr1);
    }
}

