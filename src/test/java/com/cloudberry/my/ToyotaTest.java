package com.cloudberry.my;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyotaTest {
    @Test
    void testMove() {
        Toyota toyota = new Toyota();
        assertEquals("Hybrid", toyota.move());
    }
}