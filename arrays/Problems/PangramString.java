package Problems;

public class PangramString {
    static boolean checkIfPangram(String sentence) {
        String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "v", "u", "w", "x", "y", "z"};
        for (int i = 0; i < alpha.length; i++) {
            if (!sentence.contains(alpha[i])) {
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ans = checkIfPangram("sdjvnsjdvnlsdnv");
        System.out.println(ans);
    }
}
