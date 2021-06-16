package com.studying;
import java.lang.reflect.Array;
import java.util.Arrays;
public class SortPractice {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 45, 65, 323, 536, 4, 32, 64, 563, 6563, 45, 245, 245};
        for(int last = array.length-1; last < 0; last-- ){
            for( int i = 0; i < last; i ++){
                if (array[i] > array[i + 1]){
                    swap(array,i,i+1);
                }
            }
        }
        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }
    public static void swap(int[] a, int x, int y){
        if (x == y){
            return;
        }
        int holder = a[x];
        a[x] = a[y];
        a[y] = holder;

    }

}


