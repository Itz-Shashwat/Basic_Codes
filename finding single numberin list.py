class dataq:
    def finding(data):
        array_data_set=set(data)
        array_data_set=sum(array_data_set)*2
        array_data=sum(data)
        single=array_data_set-array_data
        return single
    

data=[1,1,3,3,2,2,10,10,7]
cl=dataq
print(cl.finding(data))