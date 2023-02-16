public class SingleNonDuplicate {
    public static void main(String[] args) {
        int []a = {3,3,7,7,10,11,11};
        System.out.println(findNonDuplicate(a));
    }

    static int findNonDuplicate(int []nums){
        int start = 0;
        int end = nums.length-1;
        while (start <=end){
            System.out.println(start+" "+end);
           if (nums[start] == nums[start+1]){
               start = start +2;
           }else {
               return start;
           } if (nums[end] == nums[end-1]){
                end = end -2;
            }else {
                return end;
            }

        }
        return -1;
    }
}
