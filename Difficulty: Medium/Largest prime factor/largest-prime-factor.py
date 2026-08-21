class Solution:
    def largestPrimeFactor(self, n):
        tt = n
        div = 2
        while(n != 1):
            if(div*div > n):
                return n
            if(n%div == 0):
                n = n//div
            else:
                div += 1
        return div
                
        