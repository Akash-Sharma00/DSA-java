//     https://leetcode.com/problems/build-array-from-permutation/

package Problems;

import java.util.Arrays;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] a = {0,2,1,5,3,4};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a[i]];
        }
        System.out.println(Arrays.toString(b));
    }
}
