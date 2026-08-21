class Solution:
    def nthRoot(self, n, m):
        root = m**(1/n)
        if(int(root) == root):
            return int(root)
        else:
            return -1
        
       
