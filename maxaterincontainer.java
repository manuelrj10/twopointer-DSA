



class maxaterincontainer{
    public static void main(String args[]){
       int[] height = {1,8,6,2,5,4,8,3,7};
       int low=0,high=height.length-1;
       int maxweight=0;
       while(low<high){
        int width=high-low;
        int area=width * Math.min(height[low],height[high]);
        maxweight=Math.max(maxweight,area);
        if(height[low]<height[high]){
            low++;
        }
        else{
            high--;
        }

       }
       System.out.println(maxweight);

       
    }
}