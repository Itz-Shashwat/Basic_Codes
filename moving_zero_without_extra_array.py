def moving(nums):
    i=0
    n=len(nums)
    while i<n:
        if nums[i]==0:
            nums.pop(i)
            nums.append(0)
            n-=1
        else:
            i+=1
    return nums

nums=[1,0,2,3,0,0,8,7]
print(moving(nums))