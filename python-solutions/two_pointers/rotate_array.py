def rotate(nums, k):
    """
    :type nums: List[int]
    :type k: int
    :rtype: None Do not return anything, modify nums in-place instead.

    Example:
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]

    Could you do it in-place with O(1) extra space?
    """

    for i in range(len(nums)):
        current = nums[i]
        if type(current) is tuple:
            continue

        new_index = (i + k) % len(nums)
        value_other_index = nums[new_index]

        while type(value_other_index) is not tuple:
            nums[new_index] = (current, 1)
            current = value_other_index
            new_index = (new_index + k) % len(nums)
            value_other_index = nums[new_index]

    for i in range(len(nums)):
        nums[i] = nums[i][0]


def main():
    rotate([1, 2, 3, 4, 5, 6, 7], 3)


if __name__ == "__main__":
    main()
