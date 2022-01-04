class Solution {
    public void rotate(int[] nums, int k) {
		int count = 0;
		int i = 0;
		while(count< nums.length)
		{
			int curr = (i+k)%nums.length;
			int prev = nums[i];
			do
			{
				int temp = nums[curr];
				nums[curr] = prev;
				prev = temp;
				count++;
				curr = (curr+k)%nums.length;

			}while(curr!=((i+k)%nums.length)); 
            i++;
		}

    }
}