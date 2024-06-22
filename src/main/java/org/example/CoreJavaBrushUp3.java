package org.example;

public class CoreJavaBrushUp3 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello World";
        System.out.println("Hash code of s1: " + System.identityHashCode(s1));
        System.out.println("Hash code of s2: " + System.identityHashCode(s2));

        String s3 = new String("Hello World");
        System.out.println("Hash code of s3: " + System.identityHashCode(s3));
        String s4 = new String("Hello World");
        System.out.println("Hash code of s4: " + System.identityHashCode(s4));

        String s5 = "Abdullah Al Faroque";
        String[] list = s5.split("Al");
        System.out.println(list[1].trim());
        for (int i = 0; i < s5.length(); i++)
        {
            System.out.print(s5.charAt(i)+" ");
        }
        System.out.println();

        // Reverse Order
        for(int j= s5.length()-1; 0<=j; j--)
        {
            System.out.print(s5.charAt(j)+" ");
        }



    }
}
