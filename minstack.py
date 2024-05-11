class MinStack(object):
    
    def __init__(self):
        self.stack=[]
        self.min_stack=[]

    def push(self, val):
        self.stack.append(val)
        if not self.min_stack or val<=self.getMin():
            self.min_stack.append(val)
        

    def pop(self):
        if not self.stack:
            return None
        val = self.stack.pop()
        if val == self.getMin():
            self.min_stack.pop()
        return val

        

    def top(self):
        if not self.stack:
            return None
        return self.stack[-1]
        

    def getMin(self):
        return self.min_stack[-1]
        
