package Algos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []a = {65,64,2,9,11};
        selectionSort(a);

        System.out.println(Arrays.toString(a));
    }

    public static void selectionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int last = a.length-i-1;
            int maxi = maxI(a,0,last);
            swap(a,maxi,last);

        }


    }

    public static void swap (int []a,int first,int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }



    public  static int maxI(int []a,int start,int end){
        int max = start;
        for (int i = start; i < end; i++) {
    if (a[max]<a[i]){
        max = i;
    }
        }
        return  max;
    }
}
