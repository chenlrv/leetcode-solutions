def remove_duplicates(nums):
    """
    :type nums: List[int]
    :rtype: int

    Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each
    unique element appears at most twice. The relative order of the elements should be kept the same.
    Since it is impossible to change the length of the array in some languages, you must instead have the result be
    placed in the first part of the array nums.
    More formally, if there are k elements after removing the duplicates, then the first k elements of nums should
    hold the final result. It does not matter what you leave beyond the first k elements.
    Return k after placing the final result in the first k slots of nums.

    Example:
    Input: nums = [0,0,1,1,1,1,2,3,3]
    Output: 7, nums = [0,0,1,1,2,3,3,_,_]
    """

    duplicates_count = 0
    value = None
    new_arr_index = 0

    i = 0

    while i < len(nums):
        current = nums[i]

        if current == value:
            duplicates_count += 1

            if duplicates_count == 3:
                while i < len(nums) and nums[i] == value:
                    i += 1

                continue

        else:
            duplicates_count = 1
            value = current

        nums[new_arr_index] = nums[i]
        new_arr_index += 1
        i += 1

    return new_arr_index


def main():
    nums = [0, 0, 1, 1, 1, 1, 2, 3, 3]
    k = remove_duplicates(nums)
    print(nums[:k])


if __name__ == "__main__":
    main()
