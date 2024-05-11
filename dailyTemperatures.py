def dailyTemperatures(temperatures):
    result = []
    for i in range(len(temperatures)):
        result.append(tempre(temperatures, 0, i, i + 1))
    return result

def tempre(temperatures, count, i, j):
    if j < len(temperatures) and temperatures[j] > temperatures[i]:
        return count + 1
    elif j < len(temperatures):
        return tempre(temperatures, count + 1, i, j + 1)
    else:
        return 0
            
temperatures = [73,74,75,71,69,72,76,73]
print(dailyTemperatures(temperatures))
