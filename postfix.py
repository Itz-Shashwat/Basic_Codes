def evalRPN(tokens):
        listi=[]
        for i in range(len(tokens)):
            if tokens[i].isdigit():
                listi.append(tokens[i])
            if not tokens[i].isdigit():
                temp2=int(listi.pop())
                temp1=int(listi.pop())
                if tokens[i] == '+':
                    result=temp1+temp2
                elif tokens[i] == '-':
                    result=temp1-temp2
                elif tokens[i] == '*':
                    result=temp1 * temp2
                elif tokens[i] == '/':
                    result=temp1/temp2
                listi.append(result)
        if len(listi)==1:
            total=listi[0]
        return total

tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
print(evalRPN(tokens))