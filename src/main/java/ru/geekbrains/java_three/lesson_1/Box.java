package ru.geekbrains.java_three.lesson_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitList = new ArrayList<>();
    private String fruitName;

    public void addFruit(T fruit){
        fruitList.add(fruit);
        if (fruitList.isEmpty())
            fruitName = fruit.getClass().getName();
    }
    
    public double getWeight(){
        int count = fruitList.size();
        if (count==0) 
            return 0;
        return fruitList.get(0).getWeight()*count;
    }

    public boolean compare(Box box){
        return this.getWeight()==box.getWeight();
    }

    public void pourOverTo(Box<T> destBox){
        for (T fruit : fruitList){
            destBox.addFruit(fruit);
        }
        fruitList.clear();
    }
}
