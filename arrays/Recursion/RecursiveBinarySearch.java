package Recursion;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int []a ={1,2,3,4,5,6,7,8};
        int target = 5;
        System.out.println(search(a,target,0,a.length-1));
    }
    public static int search(int []a,int target,int start,int end){

        if(start>end){return  -1;}
        int mid = start+(end-start)/2;
        if (a[mid] == target){
            return mid;
        }
        if (a[mid]>target){
            return search(a,target,start,end-1);
        }
           return search(a,target,mid+1,end);

    }
}
