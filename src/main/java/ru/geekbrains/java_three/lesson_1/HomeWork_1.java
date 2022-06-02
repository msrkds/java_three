package ru.geekbrains.java_three.lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork_1 {

    static void swap(Object[] arr, int num1, int num2) {
        Object buf = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = buf;
    }

    static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        //Task 1
        System.out.println("#Task 1");
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        String[] arr2 = new String[]{"a", "b", "c", "d", "e"};
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr2));
        swap(arr2, 0, 4);
        System.out.println(Arrays.toString(arr2));

        //Task 2
        System.out.println("\n#Task 2");
        ArrayList<String> arrayList = toArrayList(arr2);
        System.out.println(arrayList.toString());

        //Task3
        System.out.println("\n#Task 3");
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        for (int i = 0; i < 10; i++) {
            appleBox1.addFruit(new Apple());
            orangeBox1.addFruit(new Orange());
        }
        for (int i = 0; i < 5; i++) {
            appleBox2.addFruit(new Apple());
        }
        System.out.println("Масса первой коробки с яблоками: " + appleBox1.getWeight());
        System.out.println("Масса второй коробки с яблоками: " + appleBox2.getWeight());
        System.out.println("Масса коробки с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Результат сравнения 1й коробки с яблоками и коробки с апельсинами: "+appleBox1.compare(orangeBox1));

        System.out.println("\nПересыпаем из второй коробки в первую...\n");
        appleBox2.pourOverTo(appleBox1);
        System.out.println("Масса первой коробки с яблоками: " + appleBox1.getWeight());
        System.out.println("Масса второй коробки с яблоками: " + appleBox2.getWeight());
        System.out.println("Масса коробки с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Результат сравнения 1й коробки с яблоками и коробки с апельсинами: "+appleBox1.compare(orangeBox1));
    }

}
