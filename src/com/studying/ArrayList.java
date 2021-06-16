package com.studying;

public class ArrayList <T> {
    public int nextFirst;
    public int nextLast;
    public T[] items;
    public int size;
    public int counter;
    public int initSize = 100;
    public ArrayList(){
        items = (T[]) new Object[initSize];
        nextFirst = initSize/2;
        nextLast = (initSize/2) +1;
        size = 0;
    }
    public void addLast(T item) {
        if (nextLast == items.length - 1) {
            resize(item);
        } else {
            items[nextLast + 1] = item;
            nextLast++;
            size++;
        }
    }
    public void addFirst(T item){
        if (nextFirst == items.length + 1){
            resize(item);
        } else {
            items[nextFirst - 1] = item;
            nextLast--;
            size++;
        }
    }
    public T returnItem(T item){
        if (items == null){
            throw new ArrayIndexOutOfBoundsException("The Array is NULL, add items to the Array");
        }
        counter = nextFirst-1;
        if (items[counter] == null){
            counter = counter + 1;
        }
        int start = 0;
        while ( start <= items.length){
            start+=1;
            items;
        }
    }
    public int size(){
        return size;
    }
}
