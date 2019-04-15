package org.csystem.sampleapp.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilTest {

    @Test
    int[] getMyArray() {
        return ArrayUtil.getMyArray();
    }

    @Test
    void maxElementOfArray()
    {
        Assertions.assertEquals(21, ArrayUtil.maxElementOfArray(ArrayUtil.getMyArray()));
    }

    @Test
    void maxElementOfArrayLambdaWay()
    {
        Assertions.assertEquals(21, ArrayUtil.maxElementOfArrayLambdaWay(ArrayUtil.getMyArray()));
    }
}