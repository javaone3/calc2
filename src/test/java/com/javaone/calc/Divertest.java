package com.javaone.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Divertest {

    @Test
    @DisplayName("10과 5를 나눴을 때 2가 나오는지 확인")

    public void testDivideTwonumbers1(){

        Divider divider = new Divider();
        int result = divider.divideTwonumbers(10, 5);


        Assertions.assertEquals(2, result);

    }

    @Test
    @DisplayName("20과 10을 나눴을 때 2가 나오는지 확인")
    public void testDivideTwonumbers2(){


        Divider divider = new Divider();
        int result = divider.divideTwonumbers(20, 10);

        Assertions.assertEquals(2, result);
    }


}
