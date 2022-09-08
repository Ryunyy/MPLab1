package com.example.lab1mp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Test class for lab 1 functions with <b>min</b> and <b>max</b> methods.
 * @author Svyatoslav Sentyurov
 * @version 0.1
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExampleUnitTest {

    /**Testing the method of getting the minimum value from a list among positive ones*/
    @Test
    public void a_min_positive_result(){
        List<Integer> test_list = new ArrayList<>();
        test_list.add(1);
        test_list.add(7);
        test_list.add(10);
        assertEquals(1,Functions.min(test_list));
    }

    /**Testing the method of getting the minimum value from a list among negative ones*/
    @Test
    public void b_min_neative_result(){
        List<Integer> test_list = new ArrayList<>();
        test_list.add(-1);
        test_list.add(-100);
        test_list.add(3);
        assertEquals(-100,Functions.min(test_list));
    }

    /**Testing the method of getting the minimum value from an empty list*/
    @Test
    public void c_min_empty_list(){
        List<Integer> test_list = new ArrayList<>();
        assertEquals("List is empty",Functions.min(test_list));
    }

    /**Testing the method of getting the minimum value from a list with single element*/
    @Test
    public void d_min_single_element(){
        List<Integer> test_list = new ArrayList<>();
        test_list.add(10);
        assertEquals(10,Functions.min(test_list));
    }

    /**Testing the method of getting the maximum value from a list among positive ones*/
    @Test
    public void e_max_positive_result(){
        List<Integer>test_list = new ArrayList<>();
        test_list.add(1000000);
        test_list.add(7000);
        test_list.add(1065);
        assertEquals(1000000, Functions.max(test_list));
    }

    /**Testing the method of getting the maximum value from a list among negative ones*/
    @Test
    public void f_max_negative_result(){
        List<Integer>test_list = new ArrayList<>();
        test_list.add(-1000);
        test_list.add(-7000);
        test_list.add(-1065);
        assertEquals(-1000, Functions.max(test_list));
    }

    /**ТTesting the method of getting the maximum value from a list with single object*/
    @Test
    public void g_max_single_element(){
        List<Integer>test_list = new ArrayList<>();
        test_list.add(7000);
        assertEquals(7000, Functions.max(test_list));
    }

    /**Testing the method of getting the maximum value from an empty list*/
    @Test
    public void h_max_empty_list(){
        List<Integer>test_list = new ArrayList<>();
        assertEquals("List is empty", Functions.max(test_list));
    }
}