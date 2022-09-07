package com.example.lab1mp;

import java.util.Collections;
import java.util.List;

public class Functions {

    public static Object min(List<Integer> list){
        if(!list.isEmpty())
            return Collections.min(list);
        else
            return "List is empty";
    }

    public static Object max(List<Integer> list){
        if(!list.isEmpty())
            return Collections.max(list);
        else
            return "List is empty";
    }
}

