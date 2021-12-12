def search_insert(nums, target):
    """
    sorted array of distinct integers and a target value
    return the index if target is found, if not return where it should have been inserted
    :type nums: List[int]
    :type target: int
    :rtype: int
    """

    start = 0
    end = len(nums) - 1

    while start <= end:
        mid = (start + end) / 2

        current = nums[mid]

        if target == current:
            return mid

        if target > current:
            start = mid + 1
        else:
            end = mid - 1

    return start


# nums = [1,3,5,6], 2
# start = 0, end = 3, mid = 1
# start = 0, end = 0, mid = 0
# start = 1, end = 0

def main():
    search_insert([1, 3, 5, 6], 5)


if __name__ == "__main__":
    main()