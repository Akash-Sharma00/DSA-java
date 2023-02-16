public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] a = {3,5,1};
        System.out.println(search(a,1));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        System.out.println(pivot);
       int ans = -1;
       if (pivot == -1){
           ans = binarySearch(nums,0,nums.length-1,target);
           return  ans;
       }
       if (nums[pivot] == target) {
           return  pivot;
       }
        ans = binarySearch(nums,pivot+1,nums.length-1,target);
        if (target == nums[ans]){
            return  ans;
       }else {
           ans = binarySearch(nums,0,pivot-1,target);
       }
        return  ans;
    }

    public static int binarySearch(int []a,int start,int end,int target){
        while (start <= end){
            int mid = start +(end -start)/2;
            if(a[mid]>target){
                end = mid-1;
            } else if (a[mid]<target) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static int findPivot(int []a){
        int start = 0;
        int end = a.length-1;

        while (start<=end){
            int mid = start +(end-start)/2;
            if ( mid<end && a[mid]>a[mid+1]){
                return mid;
            }
            if (mid>start && a[mid]<a[mid-1]){
                return  mid-1;
            }
            if (a[mid] >a[start] ){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return  -1;
    }
}
