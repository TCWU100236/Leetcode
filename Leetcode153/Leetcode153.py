class Solution:
    def findMin(self, nums):
        left = 0
        right = len(nums) - 1
        while left <= right:
            mid = (left + right) // 2
            if nums[mid] < nums[right]:
                right = mid
            else:
                left = mid + 1
        return nums[right]
    
Solution = Solution()
nums = [3, 4, 5, 1, 2]
res = Solution.findMin(nums)
print(res)