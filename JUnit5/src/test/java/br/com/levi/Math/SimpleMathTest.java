package br.com.levi.Math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test math operations in simpleMath class")
class SimpleMathTest {
    SimpleMath math;

    @BeforeAll
    static void setup(){
        System.out.println("Running @BeforeAll");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Running @AfterAll");
    }

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("running @BeforeEach");
    }

    @AfterEach
    void afterEachMethod() {
        System.out.println("running @afterEach");
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]

    @Test
    @DisplayName("Test 8 + 2 = 10")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
        System.out.println("Test 8 + 2 = 10");
        //AAA -> arrange, act, assert

        //Given
        Double actual = math.sum(8D, 2D);
        Double expected = 10D;
        //When
        assertEquals(expected, actual, () -> "Error");
        //Then
        assertNotEquals(11D, actual);
        assertNotNull(actual);

    }

    @Test
    @DisplayName("Test 10 - 5 = 5")
    void testSubtraction() {
        System.out.println("Test 10 - 5 = 5");
        Double firstNumber = 10D;
        Double secondNumber = 5D;
        Double actual = math.subtraction(firstNumber, secondNumber);
        Double expected = 5D;
        assertNotNull(actual);
        assertEquals(expected, actual, () -> "Error");
    }

    @Test
    @DisplayName("Test 10 * 5 = 50")
    void testMultiplication() {
        System.out.println("Test 10 * 5 = 50");
        Double firstNumber = 10D;
        Double secondNumber = 5D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        Double expected = 50D;
        assertNotNull(actual);
        assertEquals(expected, actual, () -> "Error");
    }

    @Test
    @DisplayName("Test squareRoot of 100 = 10")
    void testSquareRoot() {
        System.out.println("Test squareRoot of 100 = 10");
        Double number = 100D;
        Double actual = math.squareRoot(number);
        Double expected = 10D;
        assertNotNull(actual);
        assertEquals(expected, actual, () -> "Error");
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Division by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
        System.out.println("Division by Zero");
        assertThrows(ArithmeticException.class, () -> {
            math.division(10.0, 0.0);
        });
    }
}