def productExceptSelf(nums):
        result=[]
        j=0
        pro=1
        for i in range(len(nums)):
            result.append(mul(nums,i,j,pro))
        return result
def mul(nums,i,j,pro):
        if j!= len(nums):
            if j!=i:
                pro*=nums[j]
            return mul(nums, i, j+1, pro)
        else:
            return pro
    
nums = [1,2,3,4]
print(productExceptSelf(nums))