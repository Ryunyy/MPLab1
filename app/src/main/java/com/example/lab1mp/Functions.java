package com.example.lab1mp;

import java.util.Collections;
import java.util.List;

/**
 * Class of functions for lab 1 with <b>min</b> and <b>max</b> methods.
 * @author Svyatoslav Sentyurov
 * @version 0.1
 */
public class Functions {

    /**Method for finding the minimum value
     * @param list list of numbers to search
     * @return returns the element if found or a string if the list is empty*/
    public static Object min(List<Integer> list){
        if(!list.isEmpty())
            return Collections.min(list);
        else
            return "List is empty";
    }

    /**Method for finding the maximum value
     * @param list - list of numbers to search
     * @return returns the element if found or a string if the list is empty*/
    public static Object max(List<Integer> list){
        if(!list.isEmpty())
            return Collections.max(list);
        else
            return "List is empty";
    }
}

