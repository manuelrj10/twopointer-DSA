class palindrome{
    public static void main(String[] args){
        String word="madlm";
        char[] arr=word.toCharArray();
        int left=0;
        int right=arr.length-1;
        int flag=1;
        while(left<right){
            if(arr[left]!=arr[right]){
                flag=0;
                System.out.println("false");
                break;
            }
            left++;
            right--;
        }
        if(flag==1){
            System.out.println("true");
        }

    }
}