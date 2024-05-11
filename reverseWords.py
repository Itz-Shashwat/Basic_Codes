def reverseWords(s):
        word_array=s.split()
        word_array=word_array[::-1]
        string=" ".join(word_array)
        return string

s="Hi there how are u"
print(reverseWords(s))