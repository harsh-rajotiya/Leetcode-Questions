class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        //Brute force: create a new array and put even element at even index and odd at odd index
        int n = nums.length;
        int[] arr = new int[n];
        
        int index = 0;
        
        for(int i: nums){
            if(i % 2 == 0){
                arr[index] = i;
                index+=2;
            }
        }
        
        index = 1;
            for(int i: nums){
                if(i % 2 == 1){
                    arr[index] = i;
                    index+=2;
                }
            }
        
        return arr;
    }
}