def isSubsequence(string1, string2):
    arr_s=list(string1)
    arr_t=list(string2)
    if len(arr_s)!=0 and len(arr_s)<=len(arr_t) :
        for i in range(len(arr_t)):
            if arr_s[0]==arr_t[i]:
                arr_s.pop(0)
            if len(arr_s)==0:
                return True
        if len(arr_s)!=0:
            return False
    elif len(arr_s)==0:
        return True
    else: 
        return False
    
string1="ajh"
string2="tyaujihmi"
print(isSubsequence(string1,string2))