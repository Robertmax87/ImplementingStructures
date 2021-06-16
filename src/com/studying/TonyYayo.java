package com.studying;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class TonyYayo {
    public static void main(String[] args){
        List<String> maxwell = new ArrayList<>();
        maxwell.add("swear");
        maxwell.add("yoyo");
        maxwell.add("dont do it yah");
        maxwell.add("oh my gawd");
        List<String> l = maxwell.subList(1,4);
        System.out.println(l);
        l.set(1,"on moms");
        System.out.println(l);


        }


    }





