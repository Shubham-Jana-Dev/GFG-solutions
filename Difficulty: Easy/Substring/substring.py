class Solution:
    def substring(self, s, l, r):
        str = ""
        for i in range(l,r+1):
            str = str + s[i]
        
        return str