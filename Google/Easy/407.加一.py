class Solution:
    """
    @param digits: a number represented as an array of digits
    @return: the result
    """

    def plusOne(self, digits):
        # write your code here
        if digits[-1] < 9:
            digits[-1] += 1
        else:
            digits[-1] = 0
            if len(digits) < 2:
                digits.insert(0, 1)
                return digits
            else:
                flag = 0
                for i in range(len(digits) - 2, -1, -1):
                    if flag == 1 or i == len(digits) - 2:
                        if digits[i] < 9:
                            digits[i] += 1
                            flag = 0
                        else:
                            digits[i] = 0
                            if i == 0:
                                digits.insert(0, 1)
                                break
                            flag = 1
                    else:
                        break
        return digits


if __name__ == '__main__':
    digits = [9]
    print(Solution().plusOne(digits))
