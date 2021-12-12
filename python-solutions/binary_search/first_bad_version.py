def first_bad_version(n):
    """
    :type n: int
    :rtype: int
    """
    left = 1
    right = n

    while left <= right:
        mid = (left + right) / 2

        if isBadVersion(mid):
            right = mid - 1
        else:
            left = mid + 1

    return left


# [1, 2, 3, 4, 5], bad = 4
# left = 1 , right = 5, mid = 3
# left = 1, right = 2, mid = 1
# left = 2, right = 2, mid = 2
# left = 3, right = 2

def isBadVersion(version):
    return version > 3  # just for check


def main():
    first_bad_version(5)


if __name__ == "__main__":
    main()