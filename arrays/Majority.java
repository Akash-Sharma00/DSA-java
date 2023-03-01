import java.util.Scanner;

public class Majority {
    static void majorityElement(int arr[], int n)
    {
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            // update maxCount if count of
            // current element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        // if maxCount is greater than n/2
        // return the element
        if (maxCount > n / 2)
            System.out.println(arr[index]);

        else
            System.out.println("No Majority Element Found");
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        n = sc.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        majorityElement(a,n);

//
//int m = 0;
//        int maj = 0;
//        int majI = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//             if (a[i] == a[j]){
//                 m = m +1;
//             }
//
//            }
//            if (m > maj){
//                maj = m;
//                majI = i;
//            }
//            m = 0;
//        }
//        if (maj > n/2){
//            System.out.println(a[majI]);
//
//        }
//        else {
//            System.out.println(-1);
//        }
//
    }
}
