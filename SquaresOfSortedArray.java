

import java.util.*;


class maxaterincontainer{
    public static void main(String args[]){
       int[] arr = {-4,-1,0,3,10};
       int low=0,high=arr.length-1;
       int[] result=new int[arr.length];
       int pos=arr.length-1;
       while(low<high){
        if(Math.abs(arr[low])>Math.abs(arr[high])){
            result[pos]=arr[low]*arr[low];
            low++;
        }
        else{
            result[pos]=arr[high]*arr[high];
            high--;
        }
        pos--;
       }
       System.out.println(Arrays.toString(result));
    }
}