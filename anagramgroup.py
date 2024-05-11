strs = ["eat","tea","tan","ate","nat","bat"]
listing=[]
for i in range(len(strs)):
    listing.append([strs[i]])
    for j in range(i+1,len(strs)):
        if sorted(strs[i]) == sorted(strs[j]):
            listing[i].append(strs[j])
print(listing)