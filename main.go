package main

import (
	"fmt"
	"leetcode/src/main/java/leetcode/findMedianSortedArrays"
)

func main() {
	nums1 := []int{1, 2, 3, 4, 5}
	nums2 := []int{6, 7, 8, 9, 10}
	fmt.Print(findMedianSortedArrays.FindMedianSortedArrays(nums1, nums2))
}