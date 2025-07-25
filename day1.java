class Solution {
    public int findNumbers(int[] nums) {
        int z =1; // integer
        int numberof=0 ;
        int size = nums.length;
        int rem = 1;
        for (int i=0;i<size;i++){
            int count=0;
            while(nums[i]%rem!=nums[i]){
                count++;
                rem = rem*10;
            }
            if(count%2==0){
                numberof++;
            }       
            rem=1;
        }
        return numberof;
    }
}
    
