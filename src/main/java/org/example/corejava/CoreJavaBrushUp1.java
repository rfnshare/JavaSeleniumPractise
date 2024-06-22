package org.example.corejava;

public class CoreJavaBrushUp1 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num);
        String name = "Sample Text";
        System.out.println(name);

        char letter = 'A';
        System.out.println(letter);

        float number = 3.14f;
        System.out.println(number);

        boolean bool = true;
        System.out.println(bool);

        // Array

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        System.out.println(array[3]);

        int[] array2 = {1, 2, 3, 4, 5,6,7,8,9};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        String[] names = {"Sample Text", "Sample Text", "Sample Text", "Sample Text"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("Enhanced For Loop......");

        for(String s: names)
        {
            System.out.println(s);
        }


    }
}
