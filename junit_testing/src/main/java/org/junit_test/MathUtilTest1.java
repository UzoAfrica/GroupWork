package org.junit_test;

public class MathUtilTest1 {

    @Test
    void testComputerCircleRadius (){
        MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return circle area");
    }
}
