class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        length = len(nums)
        if length == 0:
            return 0
        i = 0
        for j in range (1,length):
            if nums[i] != nums[j]:
                i += 1
                nums[i] = nums[j]
        return i+1;