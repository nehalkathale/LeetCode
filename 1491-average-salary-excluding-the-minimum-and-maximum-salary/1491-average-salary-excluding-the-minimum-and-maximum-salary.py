class Solution:
    def average(self, salary: List[int]) -> float:
        maxSalary = max(salary)
        minSalary = min(salary)
        total = 0
        for sal in salary:
            total += sal
        return ((total-(maxSalary+minSalary))/(len(salary)-2))