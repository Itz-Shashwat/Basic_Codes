class Solution(object):
    def twoSum(self, numbers, target):
        array=[]
        for i in range(len(numbers)):
            result=self.finding(numbers,target,i,i+1)
            if result:
                array.extend(result)
                return array
            
    def finding(self,numbers,target,i,j):
        if j<len(numbers) and numbers[i]+numbers[j]==target:
            array=[]
            array.append(i+1)
            array.append(j+1)
            return array
        elif j<len(numbers) and numbers[i]+numbers[j]!=target:
            return self.finding(numbers,target,i,j+1)
        else:
            return 0
        