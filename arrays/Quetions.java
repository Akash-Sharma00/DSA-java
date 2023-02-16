public class Quetions {
    public static void main(String[] args) {
        int[] a = {2,3,5,14,16,18};
        System.out.println(searchCeiling(a,17));
        char[] c = {'a','b','d','t'};
        System.out.println(searchFloorLetter(c,'y'));

    }
    static int searchCeiling(int[] a, int target){
        int s = 0;
        int e = a.length-1;
        if (target > a[e]){return  -1;}
        while (s <= e){
            int mid = s + (e-s)/2;
            if (a[mid] >target){
                e = mid-1;
            } else if (a[mid] < target) {
                s = mid+1;
            }else {
                return a[mid];

            }
        }
        return a[s];
    }
    static int searchFloor(int[] a, int target){
        int s = 0;
        int e = a.length-1;
        if (target < a[e]){return  -1;}
        while (s <= e){
            int mid = s + (e-s)/2;
            if (a[mid] >target){
                e = mid-1;
            } else if (a[mid] < target) {
                s = mid+1;
            }else {
                return a[mid];

            }
        }
        return a[e];
    }

    static char searchFloorLetter(char[] a, char target){
        int s = 0;
        int e = a.length-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if (a[mid] >target){
                e = mid-1;
            } else if (a[mid] < target) {
                s = mid+1;
            }
        }
        return a[s%a.length];
    }
}
