class SumArray {
    public int[] twoSum(int[] nums, int target) {
        int s=0; 
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                s=nums[i]+nums[j];
                if(s==target){
                return new int[]{i,j};
                }
            }
            s=0;
        }
        return new int[]{};
    }
}