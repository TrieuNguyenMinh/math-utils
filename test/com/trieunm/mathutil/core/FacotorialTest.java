/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trieunm.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nguye
 */
public class FacotorialTest {
    
    @Test
    public void checkFactorialGivenCorrectArgumentReturnsWell(){
        //Tui ki vong khi goi ham tinh 5! = 120
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        assertEquals(720, MathUtil.getFactorial(6));
        assertEquals(1, MathUtil.getFactorial(0));
        assertEquals(1, MathUtil.getFactorial(1));
        assertEquals(24, MathUtil.getFactorial(4));
        
        //dung quen con nhieu tinh huong/case xai ham`
    }
    
    @Test(expected = IllegalArgumentException.class) //bien ham nay thanh public static void main(){...}
    //day la quy tac cua bo thu vien JUnit  
    
    public void checkFactorialGivenWrongArgumentThrowsException(){
       MathUtil.getFactorial(-5); 
       MathUtil.getFactorial(21); 
       MathUtil.getFactorial(22); 
    }
    //am -> ko tinh giai thua
    // >= 21! bij tran long  hong tinh lun
    // 2 tinh huong nay ko co value ko ss dc
    //ko assertEquals() so sanh coi co bang ko
}
//Quy uoc
//Ham la xanh khi tat ca ham deu xanh

//chi an 1 cai do  expected != actual
//Hoac ban ki vong sai

// can xem lai code/test  de dam bao xanh het, ket luan ham on voi cac tinh huong da test