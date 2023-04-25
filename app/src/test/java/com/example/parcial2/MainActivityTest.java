package com.example.parcial2;

import junit.framework.TestCase;

import org.junit.Test;

public class MainActivityTest extends TestCase {

    @Test
    public void testSuma() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.suma(10, 6);
        assertEquals(16, result);
    }

    @Test
    public void testResta() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.resta(10, 6);
        assertEquals(4, result);
    }

    public void testMulti() {
        MainActivity mainActivity = new MainActivity();
        int result = mainActivity.multi(10, 6);
        assertEquals(60, result);
    }
}



