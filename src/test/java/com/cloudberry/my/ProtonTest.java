package com.cloudberry.my;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProtonTest {
    @Test
    void testMove() {
        Proton proton = new Proton();
        assertEquals("Turbo", proton.move());
    }
}