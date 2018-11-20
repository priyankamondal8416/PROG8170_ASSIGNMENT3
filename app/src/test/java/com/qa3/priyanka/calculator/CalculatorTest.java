package com.qa3.priyanka.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    //Member variable
    private Calculator c;

    @Before
    public void setUp() {

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

    public void testAddition_input5and5_output10() {
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
    // Test Description: Adding 0 and 3
    // Method of Execution: Automated
    // Input Data: 0,3
    // Expected Output: 3.0


    public void testAddition_input0and3_outputExpected3() {
        // 1. Arrange
        double i = 0;
        double j = 3;

        // 2. Act
        double result = c.addition(i, j);

        // 3. Assert
        assertEquals(3.0, result,0);
    }

    @Test
    // Test Identifier: 1.3
    // Test Description: Adding 2.0 and -5.7 (adding 2 float numbers)
    // Method of Execution: Automated
    // Input Data: 2.0, -5.7
    // Expected Output: -1.7

    public void testAddition_input2AndNegative5Point7_outputExpectedNegative3Point7() {
        // 1. Arrange
        double i = 2.0;
        double j = -5.7;

        // 2. Act
        double result = c.addition(i, j);

        // 3. Assert
        assertEquals(-3.7, result, 1);
    }

    @Test
    // Test Identifier: 1.4
    // Test Description: Adding 9999999999 and 9999999999
    // Method of Execution: Automated
    // Input Data: 9999999999,9999999999
    // Expected Output: 19999999998

    public void testAddition_bothValue99999999999_outputExpected1999999998() {
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
    // Test Description: Adding -2 + -2
    // Method of Execution: Automated
    // Input Data: -2,-2
    // Expected Output: -4

    public void testAddition_inputNegative2andNegative2_outputExpectedNegative4() {
        // 1. Arrange
        double i = -2;
        double j = -2;

        // 2. Act
        double result = c.addition(i, j);

        // 3. Assert
        assertEquals(-4, result, 0);

    }


    // TEST CASES FOR SUBTRACTION

    @Test
    // Test Identifier: 2.1
    // Test Description: Subtracting 8 from 20 (2 positive numbers)
    // Method of Execution: Automated
    // Input Data: 20,8
    // Expected Output: 12.0

    public void testSubtraction_input20and8_outputExpected12Point0() {
        // 1. Arrange
        double i = 20;
        double j = 8;

        // 2. Act
        double result = c.subtraction(i, j);

        // 3. Assert
        assertEquals(12.0, result, 0);
    }

    @Test
    // Test Identifier: 2.2
    // Test Description: Subtracting -25 from -5 (2 negative numbers)
    // Method of Execution: Automated
    // Input Data: -25,-5
    // Expected Output: -20.0

    public void testSubtraction_inputNegative25AndNegative5_outputExpectedNegative20Point0() {
        // 1. Arrange
        double i = -25;
        double j = -5;

        // 2. Act
        double result = c.subtraction(i, j);

        // 3. Assert
        assertEquals(-20.0, result,0);
    }

    @Test
    // Test Identifier: 2.3
    // Test Description: Subtracting 0 from 0
    // Method of Execution: Automated
    // Input Data: 0,0
    // Expected Output: 0.0

    public void testSubtraction_input0and0_outputExpected0() {
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
    // Test Description: Subtracting 0.75 from 0 (subtracting from zero)
    // Method of Execution: Automated
    // Input Data: 0,-0.75
    // Expected Output: 0.75


    public void testSubtraction_input0andNegativePoint75_outputExpectedPoint75() {
        // 1. Arrange
        double i = 0;
        double j = -0.75;

        // 2. Act
        double result = c.subtraction(i, j);

        // 3. Assert
        assertEquals(0.75, result,0);
    }

    @Test
    // Test Identifier: 2.5
    // Test Description: Subtracting 9 from -7
    // Method of Execution: Automated
    // Input Data: -7,9
    // Expected Output: -16.0

    public void testSubtraction3_negative7and9_outputExpectedNegative16() {
        // 1. Arrange
        double i = -7;
        double j = 9;

        // 2. Act
        double result = c.subtraction(i, j);

        // 3. Assert
        assertEquals(-16, result,0);
    }


    // TEST CASES FOR MULTIPLICATION

    @Test
    // Test Identifier: 3.1
    // Test Description: Multiplying 20 by 2
    // Method of Execution: Automated
    // Input Data: 20,2
    // Expected Output: 40.0

    public void testMultiplication_input20And2_outputExpected40() {
        // 1. Arrange
        double i = 20;
        double j = 2;

        // 2. Act
        double result = c.multiplication(i, j);

        // 3. Assert
        assertEquals(40.0, result,0);
    }

    @Test
    // Test Identifier: 3.2
    // Test Description: Multiplying -12 by -9
    // Method of Execution: Automated
    // Input Data: -12,-9
    // Expected Output: 108.0

    public void testMultiplication_inputNegative12andNegative9_outputExpectedPositive108Point0() {
        // 1. Arrange
        double i = -12;
        double j = -9;

        // 2. Act
        double result = c.multiplication(i, j);

        // 3. Assert
        assertEquals(108.0, result,0);
    }

    @Test
    // Test Identifier: 3.3
    // Test Description: Multiplying 0 by -1
    // Method of Execution: Automated
    // Input Data: 0,-1
    // Expected Output: 0.0

    public void testMultiplication_input0AndNegative1_outputExpected0() {
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
    // Test Description: Multiplying 5 by -5
    // Method of Execution: Automated
    // Input Data: 5,-5
    // Expected Output: -25.0

    public void testMultiplication_input5AndNegative5_outputExpectedNegative25() {
        // 1. Arrange
        double i = 5;
        double j = -5;

        // 2. Act
        double result = c.multiplication(i, j);

        // 3. Assert
        assertEquals(-25.0, result,0);
    }

    @Test
    // Test Identifier: 3.5
    // Test Description: Multiplying 0 by 0
    // Method of Execution: Automated
    // Input Data: 0,0
    // Expected Output: 0.0

    public void testMultiplication_input0and0_outputExpected0() {
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
    // Test Description: Dividing 42 by 4
    // Method of Execution: Automated
    // Input Data: 42,4
    // Expected Output: 10.5

    public void testDivision_input42and4_outputExpected10Point5() {
        // 1. Arrange
        double i = 42;
        double j = 4;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(10.5, result,0);
    }

    @Test
    // Test Identifier: 4.2
    // Test Description: Dividing 0 by 7
    // Method of Execution: Automated
    // Input Data: 0,7
    // Expected Output: 0.0

    public void testDivision_input0And7_outputExpected0() {
        // 1. Arrange
        double i = 0;
        double j = 7;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(0.0, result,0);
    }

    @Test
    // Test Identifier: 4.3
    // Test Description: Dividing -22 by -11
    // Method of Execution: Automated
    // Input Data: -22,-11
    // Expected Output: 2.0

    public void testDivision_inputNegative22AndNegative11_outputExpected2Point0() {
        // 1. Arrange
        double i = -22;
        double j = -11;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(2.0, result,0);
    }

    @Test
    // Test Identifier: 4.4
    // Test Description: Dividing -300 by 6
    // Method of Execution: Automated
    // Input Data: -300,6
    // Expected Output: -50.0

    public void testDivision_inputNegative300andPositive6_outputExpectedNegative50Point0() {
        // 1. Arrange
        double i = -300;
        double j = 6;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(-50.0, result,0);
    }

    @Test
    // Test Identifier: 4.5
    // Test Description: Dividing 490 by -7
    // Method of Execution: Automated
    // Input Data: 490,-7
    // Expected Output: -70.0

    public void testDivision_inputPositive490AndNegative7_outputNegative70Point0() {
        // 1. Arrange
        double i = 490;
        double j = -7;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(-70.0, result,0);
    }

    // TEST MUTANT METHODS

    @Test
    // Test Identifier: 5.1
    // Test Description: Dividing 1 by 1
    // Method of Execution: Automated
    // Input Data: 1,1
    // Expected Output: 1

    public void testDivision_input1And1_outputExpected1() {
        // 1. Arrange
        double i = 1;
        double j = 1;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(1, result,0);
    }

    @Test
    // Test Identifier: 5.2
    // Test Description: Dividing 2 by 1
    // Method of Execution: Automated
    // Input Data: 2,1
    // Expected Output: 2

    public void testDivision_input2And1_outputExpected2() {
        // 1. Arrange
        double i = 2;
        double j = 1;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(2, result,0);
    }

    @Test
    // Test Identifier: 5.2
    // Test Description: Dividing 9 by 3
    // Method of Execution: Automated
    // Input Data: 9,3
    // Expected Output: 3

    public void testDivision_input9And3_outputExpected3() {
        // 1. Arrange
        double i = 9;
        double j = 3;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(3, result,0);
    }
}