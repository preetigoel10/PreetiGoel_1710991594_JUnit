package com.epam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    StringOperation stringOperation;

    @Before
    public void initiateClass(){
        this.stringOperation=new StringOperation();
    }

    @Test
    public void testCase1(){
        String result=stringOperation.removeAFromString("ABCD");
        assertEquals("BCD",result);
    }
    @Test
    public void testCase2(){
        String result=stringOperation.removeAFromString("AACD");
        assertEquals("CD",result);
    }
    @Test
    public void testCase3(){
        String result=stringOperation.removeAFromString("BACD");
        assertEquals("BCD",result);
    }
    @Test
    public void testCase4(){
        String result=stringOperation.removeAFromString("BBAA");
        assertEquals("BBAA",result);
    }
    @Test
    public void testCase5(){
        String result=stringOperation.removeAFromString("AABAA");
        assertEquals("BAA",result);
    }
}
