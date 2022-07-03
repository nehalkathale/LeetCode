# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
        total = depth = 0
        queue = deque([(root,0),])
        
        while queue:
            node, currentDepth = queue.popleft()
            if node.left is None and node.right is None:
                if depth < currentDepth:
                    total = node.val
                    depth = currentDepth
                elif depth == currentDepth:
                    total += node.val
            else:
                if node.left:
                    queue.append((node.left,currentDepth+1))
                if node.right:
                    queue.append((node.right,currentDepth+1))
        return total