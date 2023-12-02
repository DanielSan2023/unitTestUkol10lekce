package com.engeto.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindMatchingTest {
    List<Double> testList;
    List<Double> testList2;
    @BeforeEach
    void setUp() {
        testList = List.of(12.0,8.126,6.0);
        testList2 = List.of(12.0,8.126,9.0,158.0,6.0);
    }

    @Test
    @DisplayName("Prvý vlastný test.")
    void findMathingFirst() {
        Double testResult = FindMatching.findMathing(testList, 11.0, 12.6);
        Double expected = 12.0;
        Assertions.assertEquals(expected, testResult);
    }

    @Test
    @DisplayName("Prvý vlastný test -  null.")
    void findMathingNull() {
        Double testResult = FindMatching.findMathing(testList, 11.0, 11.9);
        Double expected = null;
        Assertions.assertEquals(expected, testResult);
    }
    @Test
    @DisplayName("Druhý vlastný test.")
    void findMathingSecond() {
        Double testResult = FindMatching.findMathing(testList, 8.0, 10.0);
        Double expected = 8.126;
        Assertions.assertEquals(expected, testResult);
    }




}