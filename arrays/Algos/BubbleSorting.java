package Algos;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int [] arr = {1,5,3,49,4,3,1,8,3,88,0};

        for (int i = 0;i<arr.length;i++)
        {
            for (int j = 0; j < arr.length;j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
