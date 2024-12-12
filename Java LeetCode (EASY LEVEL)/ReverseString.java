import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        // Two pointer apporach (opp direction)
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        System.out.print(Arrays.toString(s));
    }

    public static void main(String[] args) {
        String str = "Hello";
        char[] strArr = str.toCharArray();
        ReverseString rs = new ReverseString();
        rs.reverseString(strArr);
    }
}