class Solution(object):
    def highFive(self, items):
        """
        :type items: List[List[int]]
        :rtype: List[List[int]]
        """
        sortedItems = sorted(items, key=lambda x: (x[0], x[1]), reverse=True)
        dictionary = {}
        res =[]
        for i, marks in sortedItems:
            if i not in dictionary:
                dictionary[i] = [marks]
            else:
                if len(dictionary[i]) < 5:
                    dictionary[i].append(marks)
        for key in sorted(dictionary.keys()):
            res.append([key , sum(dictionary[key]) // 5])
        return res        
        