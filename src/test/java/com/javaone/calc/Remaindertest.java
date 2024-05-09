package com.javaone.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Remaindertest {

    @Test
    @DisplayName("10을 3로 나누었을때 나머지가 나오는지 확인")
    public void testRemainderTwoNum() {

        Remainder remainder = new Remainder();
        int res = remainder.remainderTwoNum(10,2);

        Assertions.assertEquals(0,res);
    }

    @Test
    @DisplayName("10 % 3 check")
    public void testRemainderTwoNum2() {

        Remainder remainder = new Remainder();
        int res = remainder.remainderTwoNum(10,3);

        Assertions.assertEquals(1,res);
    }
}

