class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        length = len(nums)
        a = [0] * length
        for i in range(length):
            a[(i+k) %length] = nums[i]
        nums[:] = a