package com.javaone.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinusTests {
    @Test
    @DisplayName("2와 1을 전달했을때 1이 나오는지 확인")
    public void testMinusOnenumbers1(){

        Minus minus = new Minus();
        int result = minus.minusOneNumbers(2, 1);

        Assertions.assertEquals( 1, result);
    }
}
