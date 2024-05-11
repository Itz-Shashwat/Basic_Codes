class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        maxi=max(candies)
        result=[]
        for i in range(len(candies)):
            if candies[i]+extraCandies>=maxi:
                result.append(True)
            else:
                result.append(False)
        return result 
        