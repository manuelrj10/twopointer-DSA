class MostWaterContainer{
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int water=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int width=right-left;
            int area=Math.min(arr[left],arr[right])*width;
            water=Math.max(water,area);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }

        }
        System.out.println(water);
        
    }
}