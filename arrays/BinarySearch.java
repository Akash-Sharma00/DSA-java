import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4};
//        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int a = search(arr,4);
        System.out.println(a);
    }
    static int search(int[]a,int t){ 
        int str = 0;
        int end = a.length-1;
        System.out.println(end);

        while (str<=end){
            int mid = str +(end-str)/2;

            if (t>a[mid]){
                str = mid+1;
            } else if (t<a[mid]) {
                end = mid-1;
            }else {
                return mid;
            }
        }

        return  -1;
    }
}
