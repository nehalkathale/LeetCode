class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        count=Counter(arr)
        return len(count)==len(set(count.values()))
        
        count = {}
        for n in arr:
            count[n] = 1 + count.get(n,0)
        for value in count.values():
            if value in seen:
                return False
            seen.add(value)
        return True