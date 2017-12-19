package org.one10.examples.two;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testRunModuleUtil() {
        assertEquals("module util", "token1", Main.runModuleUtil());
    }

    @Test
    public void testRunModuleOne() {
        assertEquals("module 1", "BackendServiceOne", Main.runModuleOne());
    }

    @Test
    public void testRunModuleTwo() {
        assertEquals("module 2", "BackendServiceTwo: token1", Main.runModuleTwo());
    }
}