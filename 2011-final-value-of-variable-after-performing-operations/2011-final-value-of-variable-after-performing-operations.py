class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        x = 0
        print(operations)
        for i in range(len(operations)):
            print(operations[i])
            if operations[i] == '--X':
                x = x - 1
            if operations[i] == 'X++':
                x = x + 1
            if operations[i] == '++X':
                x = x + 1
            if operations[i] == 'X--':
                x = x - 1
        return x
        