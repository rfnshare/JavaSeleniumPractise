package org.example.corejava;

public class MethodsDemo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        MethodsDemo a = new MethodsDemo();
        String name = a.getData();
        System.out.println(name);

        MethodsTwoDemo b = new MethodsTwoDemo();
        String nameTwo = b.getDataTwo();
        System.out.println(nameTwo);

        System.out.println(getDataThree());
    }
    public String getData()
    {
        System.out.println("Hello World From GetData");
        return "Hkasdnas";
    }

    // It Belongs to class, not object
    public static String getDataThree()
    {
        return "Static Methods Demo";
    }
}
