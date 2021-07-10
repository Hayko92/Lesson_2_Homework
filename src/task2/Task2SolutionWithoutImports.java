package task2;


import java.util.Scanner;

public class Task2SolutionWithoutImports {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        char[] charsOfStringA = a.toLowerCase().toCharArray();
        char[] charsOfStringB = b.toLowerCase().toCharArray();
        if (charsOfStringA.length != charsOfStringB.length) return false;
        for (int i = 0; i < charsOfStringA.length; i++) {
            char current = charsOfStringA[i];
            int counter1 = 0;
            int counter2 = 0;
            for (int j = 0, k = 0; j < charsOfStringB.length && k < charsOfStringB.length; j++, k++) {
                if (charsOfStringA[j] == current) counter1++;
                if (charsOfStringB[k] == current) counter2++;
            }
            if (counter1 != counter2) return false;
        }
        return true;
    }
}

