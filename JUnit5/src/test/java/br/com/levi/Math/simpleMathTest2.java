package br.com.levi.Math;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test math operations in simpleMath class")
class simpleMathTest2 {
    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("Test 4D / 2D = 2D")
    @ParameterizedTest
    @MethodSource("testDivisionInputParameters")
    void testDivision(double firstNumber, double secondNumber, double expectedNumber) {
        double actual = math.division(firstNumber, secondNumber);

        assertEquals(expectedNumber, actual, 2D, () -> "Error");
    }

    public static Stream<Arguments> testDivisionInputParameters() {
        return Stream.of(
                Arguments.of(3D, 2D, 1.5D),
                Arguments.of(6D, 2D, 3D),
                Arguments.of(6D, 3D, 2D)
        );
    }
}