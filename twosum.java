class twosum{
    public static void main(String args[]){
        int[] arr={1,2,3,4,6};
        int target=6;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(target==arr[left]+arr[right]){
                System.out.println(arr[left]+" + " +arr[right]);
                return;
            }
            if(arr[left]+arr[right]>target){
                right--;
            }
            else{
                left++;
            }
        }
    }
}