package task1;

import java.util.Scanner;


/*
Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        //1
        System.out.println(A.length() + B.length());
        //2
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        //3
        String aCapitalized = capitalize(A);
        String bCapitalized = capitalize(B);

              System.out.println(aCapitalized + " " + bCapitalized);
    }

    private static String capitalize(String s) {
        return s.replace(String.valueOf(s.charAt(0)),
                String.valueOf(s.charAt(0)).toUpperCase());
    }
}
