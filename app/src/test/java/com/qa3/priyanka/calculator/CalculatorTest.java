package com.qa3.priyanka.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    //Member variable
    Calculator c;

    @Before
    public void setUp() throws Exception {

        //Initialized member variable
        c = new Calculator();
    }


    // TEST CASES FOR ADDITION

    @Test
    // Test Identifier: 1.1
    // Test Description: Adding 5 and 5 (2 positive numbers)
    // Method of Execution: Automated
    // Input Data: 5,5
    // Expected Output: 10.0
    // Observed Output: 10.0

    public void testAddition_input5and5_output10() throws Exception {
        // 1. Arrange
        double i = 5;
        double j = 5;

        // 2. Act
        double result = c.addition(i, j);

        // 3. Assert
        assertEquals(10.0, result,0);
    }

    @Test
    // Test Identifier: 1.2
    // Test Description: Adding 0 and 5
    // Method of Execution: Automated
    // Input Data: 0,5
    // Expected Output: 5.0


    public void testAddition_input0and5_output5() throws Exception {
        // 1. Arrange
        double i = 0;
        double j = 5;

        // 2. Act
        double result = c.addition(i, j);

        // 3. Assert
        assertEquals(5.0, result,0);
    }

    @Test
    // Test Identifier: 1.3
    // Test Description: Adding 1.0 and -2.7 (adding 2 float numbers)
    // Method of Execution: Automated
    // Input Data: 1.0, -2.7
    // Expected Output: -1.7.0

    public void testAddition_oneAndNegativeTwoPointSeven_outputNegativeOnePointSeven() throws Exception {
        // 1. Arrange
        double i = 1.0;
        double j = -2.7;

        // 2. Act
        double result = c.addition(i, j);

        // 3. Assert
        assertEquals(-1.7, result, 1);
    }

    @Test
    // Test Identifier: 1.4
    // Test Description: Adding 9999999999 and 9999999999
    // Method of Execution: Automated
    // Input Data: 9999999999,9999999999
    // Expected Output: 19999999998

    public void testAddition_bothValue99999999999_output1999999998() throws Exception {
        // 1. Arrange
        double i = 999999999;
        double j = 999999999;

        // 2. Act
        double result = c.addition(i, j);

        // 3. Assert
        assertEquals(1999999998, result, 0);

    }

    @Test
    // Test Identifier: 1.5
    // Test Description: Adding -5 + -5
    // Method of Execution: Automated
    // Input Data: -5,-5
    // Expected Output: -10

    public void testAddition_inputNegative5andNegative5_outputNegative10() throws Exception {
        // 1. Arrange
        double i = -5;
        double j = -5;

        // 2. Act
        double result = c.addition(i, j);

        // 3. Assert
        assertEquals(-10, result, 0);

    }


    // TEST CASES FOR SUBTRACTION

    @Test
    // Test Identifier: 2.1
    // Test Description: Subtracting 10 from 8 (2 positive numbers)
    // Method of Execution: Automated
    // Input Data: 10,8
    // Expected Output: 2.0

    public void testSubtraction_10and8_output2() throws Exception {
        // 1. Arrange
        double i = 10;
        double j = 8;

        // 2. Act
        double result = c.subtraction(i, j);

        // 3. Assert
        assertEquals(2.0, result, 0);
    }

    @Test
    // Test Identifier: 2.2
    // Test Description: Subtracting -12 from -5 (2 negative numbers)
    // Method of Execution: Automated
    // Input Data: -12,-5
    // Expected Output: -7.0

    public void testSubtraction_negative12And5_outputNegative7() throws Exception {
        // 1. Arrange
        double i = -12;
        double j = -5;

        // 2. Act
        double result = c.subtraction(i, j);

        // 3. Assert
        assertEquals(-7.0, result,0);
    }

    @Test
    // Test Identifier: 2.3
    // Test Description: Subtracting 0 from 0
    // Method of Execution: Automated
    // Input Data: 0,0
    // Expected Output: 0.0

    public void testSubtraction_0and0_output0() throws Exception {
        // 1. Arrange
        double i = 0;
        double j = 0;

        // 2. Act
        double result = c.subtraction(i, j);

        // 3. Assert
        assertEquals(0, result,0);
    }

    @Test
    // Test Identifier: 2.4
    // Test Description: Subtracting 0.25 from 0 (subtracting from zero)
    // Method of Execution: Automated
    // Input Data: 0,-0.25
    // Expected Output: 0.25


    public void testSubtraction_0andNegativePoint25_outputPoint25() throws Exception {
        // 1. Arrange
        double i = 0;
        double j = -0.25;

        // 2. Act
        double result = c.subtraction(i, j);

        // 3. Assert
        assertEquals(0.25, result,0);
    }

    @Test
    // Test Identifier: 2.5
    // Test Description: Subtracting 3 from -7
    // Method of Execution: Automated
    // Input Data: -7,3
    // Expected Output: -10.0

    public void testSubtraction3_negative7and3_outputNegative10() throws Exception {
        // 1. Arrange
        double i = -7;
        double j = 3;

        // 2. Act
        double result = c.subtraction(i, j);

        // 3. Assert
        assertEquals(-10, result,0);
    }


    // TEST CASES FOR MULTIPLICATION

    @Test
    // Test Identifier: 3.1
    // Test Description: Multiplying 200 by 2
    // Method of Execution: Automated
    // Input Data: 200,2
    // Expected Output: 400.0

    public void testMultiplication_200And2_output400() throws Exception {
        // 1. Arrange
        double i = 200;
        double j = 2;

        // 2. Act
        double result = c.multiplication(i, j);

        // 3. Assert
        assertEquals(400.0, result,0);
    }

    @Test
    // Test Identifier: 3.2
    // Test Description: Multiplying -15 by -3
    // Method of Execution: Automated
    // Input Data: -15,-3
    // Expected Output: 45.0

    public void testMultiplication_Negative15_Negative3_outputPositive45() throws Exception {
        // 1. Arrange
        double i = -15;
        double j = -3;

        // 2. Act
        double result = c.multiplication(i, j);

        // 3. Assert
        assertEquals(45.0, result,0);
    }

    @Test
    // Test Identifier: 3.3
    // Test Description: Multiplying 0 by -1
    // Method of Execution: Automated
    // Input Data: 0,-1
    // Expected Output: 0.0

    public void testMultiplication_0AndNegative1_output0() throws Exception {
        // 1. Arrange
        double i = 0;
        double j = -1;

        // 2. Act
        double result = c.multiplication(i, j);

        // 3. Assert
        assertEquals(0, result,0);
    }

    @Test
    // Test Identifier: 3.4
    // Test Description: Multiplying 5 by -7
    // Method of Execution: Automated
    // Input Data: 5,-7
    // Expected Output: -35.0

    public void testMultiplication_5AndNegative7_outputNegative35() throws Exception {
        // 1. Arrange
        double i = 5;
        double j = -7;

        // 2. Act
        double result = c.multiplication(i, j);

        // 3. Assert
        assertEquals(-35.0, result,0);
    }

    @Test
    // Test Identifier: 3.5
    // Test Description: Multiplying 0 by 0
    // Method of Execution: Automated
    // Input Data: 0,0
    // Expected Output: -35.0

    public void testMultiplication_0and0_output0() throws Exception {
        // 1. Arrange
        double i = 0;
        double j = 0;

        // 2. Act
        double result = c.multiplication(i, j);

        // 3. Assert
        assertEquals(0.0, result,0);
    }


    // TEST CASES FOR DIVISION

    @Test
    // Test Identifier: 4.1
    // Test Description: Dividing 20 by 5
    // Method of Execution: Automated
    // Input Data: 20,5
    // Expected Output: 0

    public void testDivision_20and5_output4() throws Exception {
        // 1. Arrange
        double i = 20;
        double j = 5;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(4.0, result,0);
    }

    @Test
    // Test Identifier: 4.2
    // Test Description: Dividing 0 by 3
    // Method of Execution: Automated
    // Input Data: 0,3
    // Expected Output: 0.0

    public void testDivision_0And3_output0() throws Exception {
        // 1. Arrange
        double i = 0;
        double j = 3;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(0.0, result,0);
    }

    @Test
    // Test Identifier: 4.3
    // Test Description: Dividing -25 by -10
    // Method of Execution: Automated
    // Input Data: -25,-10
    // Expected Output: 2.5

    public void testDivision_Negative25AndNegative10_output2Point5() throws Exception {
        // 1. Arrange
        double i = -25;
        double j = -10;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(2.5, result,0);
    }

    @Test
    // Test Identifier: 4.4
    // Test Description: Dividing 39 by 13
    // Method of Execution: Automated
    // Input Data: 39,13
    // Expected Output: 3.0

    public void testDivision_Negative39andPositive13_outputNegative3() throws Exception {
        // 1. Arrange
        double i = -39;
        double j = 13;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(-3.0, result,0);
    }

    @Test
    // Test Identifier: 4.5
    // Test Description: Dividing 49000 by -7000
    // Method of Execution: Automated
    // Input Data: 49000,-7000
    // Expected Output: -7.0

    public void testDivision_Positive49000AndNegative7000_outputNegative7() throws Exception {
        // 1. Arrange
        double i = 49000;
        double j = -7000;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(-7.0, result,0);
    }

}