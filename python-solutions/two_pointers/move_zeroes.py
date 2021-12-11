def move_zeroes(nums):
    """
    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero
    elements.
     :type nums: List[int] :rtype: None Do not return anything, modify nums in-place instead.
    Note that you must do this in-place without making a copy of the array.

    Example:
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    [0, 0, 0, 5, 2, 0, 3, 0]
    [5, 2, 3, 0, 0, 0, 0]
    """

    index = 0

    for i in range(len(nums)):
        current = nums[i]

        if current != 0:
            nums[index] = current
            index += 1

    while index < len(nums):
        nums[index] = 0
        index += 1


def move_zeroes_2(nums):
    """
    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero
    elements.
     :type nums: List[int] :rtype: None Do not return anything, modify nums in-place instead.
    Note that you must do this in-place without making a copy of the array.

    Example:
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    [0, 0, 0, 5, 2, 0, 3, 0]
    [5, 2, 3, 0, 0, 0, 0]
    """

    last_non_zero_index = 0

    for i in range(len(nums)):

        if nums[i] != 0:
            temp = nums[last_non_zero_index]
            nums[last_non_zero_index] = nums[i]
            last_non_zero_index += 1
            nums[i] = temp


def main():
    arr = [0, 0, 0, 5, 2, 0, 3, 0]
    move_zeroes(arr)
    print(arr)


if __name__ == "__main__":
    main()