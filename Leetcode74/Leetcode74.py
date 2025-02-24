class Solution:
    def searchMatrix(self, matrix, target) -> bool:
        for row in matrix:
            right = len(row) - 1
            if row[right] < target:
                continue
            else:
                left = 0
                while (left <= right):
                    middle = (left + right) // 2
                    if row[middle] == target:
                        return True
                    elif row[middle] < target:
                        left = middle + 1
                    else:
                        right = middle - 1
        return False

Solution = Solution()
matrix = [[1,3,5,7],
          [10,11,16,20],
          [23,30,34,60]]
target = 7
print(Solution.searchMatrix(matrix, target))