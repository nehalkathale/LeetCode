class Solution {
    public void rotate(int[] nums, int k) {
		int count = 0;
		int i = 0;
		while(count< nums.length)
		{
			int current = (i+k)%nums.length;
			int previous = nums[i];
			do
			{
				int temp = nums[current];
				nums[current] = previous;
				previous = temp;
				count++;
				current = (current+k)%nums.length;

			}while(current!=((i+k)%nums.length)); 
            i++;
		}

    }
}