class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int left =0;
        int right= nums.length-1;
        int fill= nums.length-1;
        while(left<=right)
        {
            int leftsquare= nums[left]*nums[left];
            int rightsquare=nums[right]*nums[right];
            if(leftsquare>rightsquare)
            {
                ans[fill] = leftsquare;
                left++;
            }
            else
            {
                ans[fill] = rightsquare;
                right--;
            }
            fill--;
        }
        return ans;

        
    }
}