public class InfiniteArray {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,6,7,8,9,11,12,13,14,15};
        int target = 15;
        System.out.println(mainAns(a,target));
    }

    static int mainAns(int []a,int targrt){
    int start = 0;
    int end = 1;
    while (targrt>a[end]){
        int newStart = end + 1;
         end = end+(end-start+1)*2;
         start = newStart;

    }
    return  search(a,targrt,start,end);
    }

    static int search(int []a,int t,int s,int e){

        while (s<=e){
            int mid = s +(e-s)/2;

            if (t>a[mid]){
                s = mid+1;
            } else if (t<a[mid]) {
                e = mid-1;
            }else {
                return mid;
            }
        }
        return  -1;
    }
}
