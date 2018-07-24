class Solution:
    """
    @param words: a list of string
    @return: a boolean
    """

    def validWordSquare(self, words):
        # Write your code here
        rows = len(words)
        for i in range(rows):
            for j in range(len(words[i])):
                if words[i][j] != words[j][i]:
                    return False
        return True


words = ["abcd", "bnrt", "crmy", "dtye"]
print(Solution().validWordSquare(words))
