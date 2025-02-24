from math import ceil

class Solution:
    def minEatingSpeed(self, piles, h) -> int:
        
        def eatK_perH(k):
            total_hour = 0
            for pile in piles:
                total_hour += ceil(pile/k)
                if total_hour > h:
                    return False
            return True

        left = 1
        right = max(piles)
        while left <= right:
            mid = (left + right) // 2
            if eatK_perH(mid):
                right = mid - 1
            else:
                left = mid + 1
        return left
    
Solution = Solution()
cases = {"case1":([30,11,23,4,20], 5),
         "case2":([30,11,23,4,20], 6),
         "case3":([3,6,7,11], 8)}
for case in cases.values():
    print(Solution.minEatingSpeed(case[0], case[1]))
