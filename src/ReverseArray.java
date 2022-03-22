import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 8,9};
        System.out.println(Arrays.toString(reverse(a)));
    }

    public static int[] reverse(int[] a2) {
        int len = a2.length;
        int temp, i = 0;
        while ((len / 2 )> 1) {

            temp = a2[i];
            a2[i] = a2[a2.length - 1 - i];
            a2[a2.length - 1 - i] = temp;
            i++;
            len--;
        }
        return a2;
    }
}