package com.example.lab1mp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExampleUnitTest {
    @Test
    public void a_mintest(){
        List<Integer> test_list = new ArrayList<>();
        test_list.add(1);
        test_list.add(7);
        test_list.add(10);
        assertEquals(1,Functions.min(test_list));
    }

    @Test
    public void b_mintest(){
        List<Integer> test_list = new ArrayList<>();
        test_list.add(-1);
        test_list.add(-100);
        test_list.add(3);
        assertEquals(-100,Functions.min(test_list));
    }

    @Test
    public void c_mintest(){
        List<Integer> test_list = new ArrayList<>();
        assertEquals("List is empty",Functions.min(test_list));
    }

    @Test
    public void d_mintest(){
        List<Integer> test_list = new ArrayList<>();
        test_list.add(10);
        assertEquals(10,Functions.min(test_list));
    }

    @Test
    public void e_maxtest(){
        List<Integer>test_list = new ArrayList<>();
        test_list.add(1000000);
        test_list.add(7000);
        test_list.add(1065);
        assertEquals(1000000, Functions.max(test_list));
    }

    @Test
    public void f_maxtest(){
        List<Integer>test_list = new ArrayList<>();
        test_list.add(0);
        test_list.add(-7000);
        test_list.add(-1065);
        assertEquals(0, Functions.max(test_list));
    }

    @Test
    public void g_maxtest(){
        List<Integer>test_list = new ArrayList<>();
        test_list.add(-7000);
        assertEquals(-7000, Functions.max(test_list));
    }

    @Test
    public void h_maxtest(){
        List<Integer>test_list = new ArrayList<>();
        assertEquals("List is empty", Functions.max(test_list));
    }
}