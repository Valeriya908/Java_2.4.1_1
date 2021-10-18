package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"checking inside range limit, 200, 300, 3",
            "checking lower range limit, 200, 200, 0",
            "checking under lower range limit, 100, 100, 1",
            "checking upper range limit, 300, 300, 0",
            "checking over upper range limit, 400, 400, 1",
            "checking all number limit, 100, 9801, 90"})
    void shouldEnumerationSqrNum(String testName, int lowerRangeLimit, int upperRangeLimit, long expected) {
        SQRService service = new SQRService();
        long actual = service.enumerationSqrNum(lowerRangeLimit, upperRangeLimit);
        assertEquals(expected, actual);
    }
}