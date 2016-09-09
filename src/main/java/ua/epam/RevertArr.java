package ua.epam;

/**
 * Created by Olia on 07.09.2016.
 */
public class RevertArr {

    public static int[] Revert(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }
}
