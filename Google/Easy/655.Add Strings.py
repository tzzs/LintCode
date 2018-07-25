class Solution:
    """
    @param num1: a non-negative integers
    @param num2: a non-negative integers
    @return: return sum of num1 and num2
    """

    def addStrings(self, num1, num2):
        # write your code here
        return str(int(num1) + int(num2))


if __name__ == '__main__':
    num1 = "123"
    num2 = "45"
    print(Solution().addStrings(num1, num2))
