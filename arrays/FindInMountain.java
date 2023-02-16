public class FindInMountain {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,3,2,1};
        int target = 3;
        System.out.println(search(a,target));
    }

    static  int search(int[]a,int target){
        int p = findPeek(a,target,0,a.length-1);
        int f = searchInHalfArray(a,target,0,p);
        if (f != -1){
            return f;
        }
        return  searchInHalfArray(a,target,p+1,a.length-1);
    }

    static int findPeek(int[] a,int target,int s,int e){
        while (s < e){
            int mid = s + (e-s)/2;
            if(a[mid]>a[mid+1]){
                e = mid;
            }else {
                s = mid+1;
            }
        }
        return s;
    }

    static int searchInHalfArray(int[]a,int target,int start,int end){
        int mid = start + (end - start)/2;

        if (a[mid+1]<a[mid]){

            while (start <=end)
            {

                mid = start + (end-start)/2;
                if (a[mid]>target){
                    start = mid+1;
                } else if (a[mid]<target) {
                    end = mid-1;
                }else {
                    return mid;
                }
            }
        }else {
            while (start <= end)
            {
                mid = start + (end-start)/2;
                if (a[mid]>target){
                    end = mid-1;
                } else if (a[mid]<target) {
                    start = mid+1;
                }else {
                    return mid;
                }
            }
        }
        return -1;

    }
}
