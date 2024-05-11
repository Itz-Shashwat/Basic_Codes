def mergeAlternately(word1, word2):
        array1=list(word1)
        array2=list(word2)
        array1_len=len(array1)
        array2_len=len(array2)
        final=[]
        if array1_len>array2_len:
            for i in range(array2_len):
                final.append(array1[i])
                final.append(array2[i])
            for temp in range(array2_len,array1_len):
                final.append(array1[temp])
        else:
            for i in range(array1_len):
                final.append(array1[i])
                final.append(array2[i])
            for temp in range(array1_len,array2_len):
                final.append(array2[temp])
        return ''.join(final)
                
word1 = "abc"
word2 = "pqrmlk"
print(mergeAlternately(word1, word2))