class Solution(object):
    def removeElement(self, nums, val):
        valu=[]
        for num in nums:
            if num!=val:
                valu.append(num)
        del nums[:]
        nums.extend(valu)
                