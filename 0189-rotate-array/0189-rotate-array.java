class Solution {

    private void rev(int arr[],int i , int j ){
        
        while(i<j){
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }

    }

    public void rotate(int[] nums, int k) {
       
        k=k%nums.length;

        if(nums.length<=1) return;

       rev(nums,0,nums.length-1-k);
       rev(nums,nums.length-k,nums.length-1);
       rev(nums,0,nums.length-1); 

    }
  
  
}