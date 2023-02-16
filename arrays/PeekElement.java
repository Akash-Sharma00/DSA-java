public class PeekElement {
    public static void main(String[] args) {
        int []a = {0,1,0};
        System.out.println(searchPeek(a));

    }
    static int searchPeek(int[] a){
        int s = 0;
        int e = a.length-1;
        while (s<e){
            int mid = s + (e-s)/2;
            if (a[mid] >a[mid+1]){
                e = mid;
            } else {
               s = mid+1;

            }
        }
        return  s;
    }
}
