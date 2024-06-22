package org.example;

public class MethodsDemo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        MethodsDemo a = new MethodsDemo();
        String name = a.getData();
        System.out.println(name);

        MethodsTwoDemo b = new MethodsTwoDemo();
        String nameTwo = b.getDataTwo();
        System.out.println(nameTwo);
    }
    public String getData()
    {
        System.out.println("Hello World From GetData");
        return "Hkasdnas";
    }
}
