def longestConsecutive(nums):
        nums=sorted(nums)
        count=1
        result=[]
        for i in range(len(nums)-1):
            j=i+1
            if nums[j]-nums[i]== 1:
                count+=1
            else:
                result.append(count)
                count=1
            if j==len(nums)-1:
                result.append(count)
        return max(result)

nums=[100,4,101,102,1,3,2,5,6]
print(longestConsecutive(nums))