package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCalc() {
        SQRService service = new SQRService();
        int actual = service.cube(300, 200);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
