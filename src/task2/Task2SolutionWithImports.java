package task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2SolutionWithImports {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {

        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();

        SortingAlgoritmUtil.selectionSort(aChars);
        SortingAlgoritmUtil.insertionSort(bChars);

        return Arrays.equals(aChars, bChars);
    }
}

