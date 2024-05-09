package com.javaone.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdderTests {
    @Test
    @DisplayName("2와 5를 더했을 때 7이 나오는지 확인")
    public void testPlusTwoNumbers1(){
        Adder adder = new Adder();
        int result = adder.plusTwoNumbers(2,5);
        Assertions.assertEquals(7,result);

    }
    @Test
    @DisplayName("5와 5를 더했을 때 10이 나오는지 확인")
    public void testPlusTwoNumbers2(){
        Adder adder = new Adder();
        int result = adder.plusTwoNumbers(5,5);
        Assertions.assertEquals(10,result);

    }
}
