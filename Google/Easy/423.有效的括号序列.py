class Solution:
    """
    @param s: A string
    @return: whether the string is a valid parentheses
    """

    def isValidParentheses(self, s):
        # write your code here
        s = " ".join(s)
        s = s.split()
        left = ['(', '[', '{']
        right = [')', ']', '}']
        stack = []
        for k in s:
            if k in left:
                stack.append(k)
            else:
                if len(stack) == 0:
                    return False
                if k in right and left.index(stack[-1]) == right.index(k):
                    stack.pop()
                else:
                    return False
        if len(stack) != 0:
            return False
        else:
            return True


if __name__ == '__main__':
    s = "[]]"
    print(Solution().isValidParentheses(s))
