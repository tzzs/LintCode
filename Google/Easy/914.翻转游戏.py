class Solution:
    """
    @param s: the given string
    @return: all the possible states of the string after one valid move
    """

    def generatePossibleNextMoves(self, s):
        # write your code here
        result = []
        for i in range(len(s) - 1):
            k = s
            if s[i] == '+' and s[i + 1] == '+':
                k = k[:i] + '--' + k[i + 2:]
                result.append(k)
        return result


s = Solution()
r = s.generatePossibleNextMoves("++++")
print(r)
