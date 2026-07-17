
class Solution {
    public void mergesort(int[] arr,int start,int end){
        if(start<end){
            int mid = start + (end-start)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public void merge(int[] arr,int start,int mid,int end){
        int i = start;
        int j = mid+1;
        int[] temp = new int[arr.length];
        int idx = 0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[idx] = arr[i];
                i++;
                idx++;
            }
            else{
                temp[idx] = arr[j];
                j++;
                idx++;
            }
        }
        while(i<=mid){
            temp[idx++] = arr[i++];
        }
        while(j<=end){
            temp[idx++] = arr[j++];
        }
        for(int k = start;k<=end;k++){
            arr[k] = temp[k-start];
        }
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
        
    }
}