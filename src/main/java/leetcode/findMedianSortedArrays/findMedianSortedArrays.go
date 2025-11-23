package findMedianSortedArrays

import "math"

//nums1 := []int{1, 2, 3, 4, 5}
//nums2 := []int{6, 7, 8, 9, 10}

func FindMedianSortedArrays(nums1 []int, nums2 []int) float64 {
	if len(nums1) > len(nums2) {
		nums1, nums2 = nums2, nums1
	}
	m, n := len(nums1), len(nums2)
	right, left := m, 0

	for left <= right {
		partition1 := (left + right) / 2
		partition2 := (m+n+1)/2 - partition1

		var maxLeft1 int
		if partition1 == 0 {
			maxLeft1 = math.MinInt
		} else {
			maxLeft1 = nums1[partition1-1]
		}

		var minRight1 int
		if partition1 == len(nums1) {
			minRight1 = math.MaxInt
		} else {
			minRight1 = nums1[partition1]
		}

		var maxLeft2 int
		if partition2 == 0 {
			maxLeft2 = math.MinInt
		} else {
			maxLeft2 = nums2[partition2-1]
		}

		var minRight2 int
		if partition2 == len(nums2) {
			minRight2 = math.MaxInt
		} else {
			minRight2 = nums2[partition2]
		}

		if maxLeft1 <= minRight2 && maxLeft2 <= minRight1 {
			if (m+n)%2 == 0 {
				return (math.Max(float64(maxLeft1), float64(maxLeft2)) + math.Min(float64(minRight1), float64(minRight2))) / 2
			} else {
				return math.Max(float64(maxLeft1), float64(maxLeft2))
			}
		} else if maxLeft1 > minRight2 {
			right = partition1 - 1
		} else {
			left = partition1 + 1
		}
	}

	return 0.0
}
