import math 
def checking(bed,n):
    length= len(bed)
    if length%2==0:
            posibility=len(bed)//2
    else:
        if bed[0]==1:
            posibility=math.ceil(len(bed)/2)
        else:
            posibility=math.floor(len(bed)/2)
    count=0
    for i in range(len(bed)):
        if bed[i]==1:
            count+=1
    remaning=posibility-count
    if remaning-n>=0:
        return True 
    else:
        return False
        

array=[1,0,0,0,0,0,1]
n=2
print(checking(array,n))
