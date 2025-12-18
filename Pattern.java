// import java.util.*;
// public class Pattern{
//     public static void main(String[] args) {
//         Scanner ab =new Scanner(System.in);
//         String st;
//         System.out.println("Enter the word to print in a pattern");
//         st = ab.next();
//         int b = st.length();
//         System.out.println("The Pattern");
//         for(int a=0;a<=b;a++){
//         }
//         System.out.println(st.substring(0,a));
//     }
// }

import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter your name to print in a pattern:");
        String name = ab.next();
        int length = name.length();
        System.out.println("The Pattern:");
        for (int i = 1; i <= length; i++) {
            System.out.println(name.substring(0, i));
        }
    }
}
