import java.util.Arrays;

public class RangeOFNumber {
    public static void main(String[] args) {
        int []a = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(range(a, 89)));
    }
    static  int[] range(int[]a,int t){
        int st = -1;
        int ed = -1;
        int[] range = {getindex(a,t,true),getindex(a,t,false)};

        return range;
    }

   static int getindex(int [] a,int target,boolean isfirst){
       int s = 0;
       int e = a.length-1;
       int ans = -1;
       while (s <= e){
           int mid = s +(e-s)/2;

           if (target>a[mid]){
               s = mid+1;
           } else if (target<a[mid]) {
               e = mid-1;
           }else {
               ans = mid;
               if (isfirst){
                   e = mid -1;
               }
               else {
                   s = mid +1;
               }
           }
       }
       return  ans;
   }
}
