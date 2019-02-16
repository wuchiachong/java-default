package com.cloudberry.my;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriusTest {
    @Test
    void testMove(){
        Prius prius = new Prius();
        assertEquals("Prius Combustion Electric", prius.move());
    }
}