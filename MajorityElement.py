class Solution(object):
    def majorityElement(self, nums):
        nums.sort()
        count = 1
        max_count = 1
        major_element = nums[0]
        temp_major = nums[0]
        
        for i in range(1, len(nums)):
            if nums[i] == temp_major:
                count += 1
            else:
                if count > max_count:
                    max_count = count
                    major_element = temp_major
                temp_major = nums[i]
                count = 1
        if count > max_count:
            major_element = temp_major
        
        return major_element
