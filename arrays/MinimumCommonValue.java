public class MinimumCommonValue {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {2 ,4};
        System.out.println(getCommon(b, a));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;

        if (length2 > length1) {
            for (int i = 0; i < length1; i++) {
                int ans = binarySearch(nums2, nums1[i]);
                if (ans != -1) {
                    return nums2[ans];
                }
            }
        } else {
            for (int i = 0; i < length2; i++) {
                int ans = binarySearch(nums1, nums2[i]);
                if (ans != -1) {
                    return nums1[ans];
                }
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            System.out.println(mid);
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

   }
}
