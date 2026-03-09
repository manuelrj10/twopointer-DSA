class MinimumSizeSubarraySum {

    public static void main(String[] args){

        int target = 7;
        int[] arr = {2,3,1,2,4,3};

        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int right = 0; right < arr.length; right++){

            sum += arr[right];

            while(sum >= target){

                min = Math.min(min, right - left + 1);

                sum -= arr[left];
                left++;
            }
        }

        if(min == Integer.MAX_VALUE)
            System.out.println(0);
        else
            System.out.println(min);
    }
}