def topKFrequent(nums, k):
    final=[]
    result=[]
    for i in range(len(nums)):
        count=0
        temp=[]
        if nums[i] not in final:
            temp.append(nums[i])
            for j in range(len(nums)):
                if nums[i] == nums[j]:
                    count+=1
            final.append(nums[i])
            temp.append(count)
            result.append(temp)
        
    result=sorted(result, key=lambda x: x[1])
    result_list=[]
    q=len(result)-1
    for p in range(k):
        result_list.append(result[q][0])
        q-=1
    return result_list

nums = [1]
print(topKFrequent(nums,1))