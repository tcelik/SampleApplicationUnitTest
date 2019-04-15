package org.csystem.sampleapp.util;

import java.util.Arrays;

public class ArrayUtil {

    public static int [] getMyArray()
    {
        int [] result = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        return result;
    }

    public static int maxElementOfArray(int [] a)
    {
        int max = a[0];

        for (int number : a)
            if (number > max)
                max = number;

        return max;
    }

    public static int maxElementOfArrayLambdaWay(int [] a)
    {
        return Arrays.stream(a).max().getAsInt();
    }

    // dev test quick
    public static void main(String[] args)
    {
        if (21 == ArrayUtil.maxElementOfArrayLambdaWay(ArrayUtil.getMyArray()))
            System.out.println("yes");
    }
}
