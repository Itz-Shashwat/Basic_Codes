def isValid(s):
    char_array = list(s)
    flag = False
    mapp = {"(": ")", "[": "]", "{": "}"}
    i=0
    while i < len(char_array):
        if char_array and len(char_array)%2 == 0:
            key = char_array.pop(0)
            temp = char_array.pop(0)
            if key in mapp and mapp[key] == temp:
                flag = True
            else:
                flag = False
            i+=1
        else:
            return False
    return flag

st="()[]"
print(isValid(st))
