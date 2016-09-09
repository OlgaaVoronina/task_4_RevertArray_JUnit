package ua.epam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println("My array: " + Arrays.toString(arr));

        RevertArr revert = new RevertArr();

        revert.Revert(arr);
        System.out.println("Revert array: " + Arrays.toString(arr));
    }



}
