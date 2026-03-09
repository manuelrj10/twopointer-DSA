
import java.util.Arrays;

class Reverse{
    public static void main(String[] args){
       int[] Input={1,2,3,4,5};
       int left=0;
       int right=Input.length-1;
       while(left<right){
            int temp=Input[right];
            Input[right]=Input[left];
            Input[left]=temp;
            right--;
            left++;

        }
        System.out.println("reversed array is"+Arrays.toString(Input));
    }
}