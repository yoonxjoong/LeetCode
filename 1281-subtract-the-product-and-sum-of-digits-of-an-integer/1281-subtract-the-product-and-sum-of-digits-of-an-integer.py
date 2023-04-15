class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        tmp = [int(d) for d in (str(n))]
        
        productTmp = reduce(lambda x, y: x * y, tmp)
        sumTmp = reduce(lambda x, y: x + y, tmp)
       
        return productTmp -sumTmp