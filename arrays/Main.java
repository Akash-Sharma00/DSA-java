public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] a = {18, 12, 9, 14, 77, 50};

        for (int i :a) {
            System.out.println(i);
            if(i == 14){
                System.out.println("Found");
                break;
            }
        }
    }
}