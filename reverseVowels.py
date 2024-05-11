def reverseVowels(s):
        array=list(s)
        array_vowel=[]
        index=[]
        vowel=["a","e","i","o","u","A","E","I","O","U"]
        for i in range(len(array)):
            if array[i] in vowel:
                index.append(i)
                array_vowel.append(array[i])
        array_vowel=array_vowel[::-1]
        for i in range(len(index)):
            temp=index[i]
            array[temp]=array_vowel[i]
        return "".join(array)
    
s = "leetcode"
print(reverseVowels(s))