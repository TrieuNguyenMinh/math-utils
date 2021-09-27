/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trieunm.mathutil.main;

import com.trieunm.mathutil.core.MathUtil;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
        // test = tay, manual testing
        System.out.println("0!: 1?:" + MathUtil.getFactorial(0));
        System.out.println("1!: 1?:" + MathUtil.getFactorial(1));
        System.out.println("2!: 2?:" + MathUtil.getFactorial(2));
        System.out.println("5!: 120?:" + MathUtil.getFactorial(5));
        // muon thay ngoai le xh thi cu goi de xem app bi giet
    }
}
