package org.example;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {
        int[] array2 = {1,2,3,4,5,6,7,8,9, 10, 122};

        // Reverse the array
        for(int i= array2.length; 0<i; i--)
        {
            System.out.println(array2[i-1]);
        }
//        for(int i: array2)
//        {
//            if (i%2==0)
//            {
//                System.out.println(i);
//                break;
//            }
//        }
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);
        for(int i=numbers.length; 0<i; i--)
        {
            System.out.println(numbers[i-1]);
            sum+=numbers[i-1];
        }
        System.out.println(sum);
    }
}
