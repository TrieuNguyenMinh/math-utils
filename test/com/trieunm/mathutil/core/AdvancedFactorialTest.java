/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trieunm.mathutil.core;

import static com.trieunm.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author nguye
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    //Tach toan bo dât can gom dau vao va dau ra 
    //cho de quan li/ de theo doi/ de thong ke 
    //du? cac tinh huong can test hay chua
    
    //ta co the dat bo data nay o file txt, csv, excel, database
    @Parameters
    public static Object[][] innitData(){
//        int a[][] = {{2,4}};
        return new Integer[][]{
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120},
                                {6,1720},
                                {0,1}
                               };
    }
    //chuan 2 bien de hung data tu mang, sau do thay vao ham test
    
    @Parameterized.Parameter(value = 0)
    public int input;
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Test
    public void checkFactorialGivenCorrectArgumentReturnsWell(){
       
        assertEquals(expected, getFactorial(input));
    }
}
