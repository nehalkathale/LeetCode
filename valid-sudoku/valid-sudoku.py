class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        N = 9
        
        rows = [set() for _ in range(N)]
        cols = [set() for _ in range(N)]
        boxes = [set() for _ in range(N)]
        
        for row in range(N):
            for col in range(N):
                val = board[row][col]
                if val == ".":
                    continue
                
                if val in rows[row]:
                    return False
                rows[row].add(val)
                
                if val in cols[col]:
                    return False
                cols[col].add(val)
                
                index = (row//3) * 3 + col//3
                
                if val in boxes[index]:
                    return False
                boxes[index].add(val)
                
        return True