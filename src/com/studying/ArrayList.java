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
    public void addLast
}
