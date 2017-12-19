package org.one10.examples.two;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackendServiceTwoTest {
    @Test
    public void testBackendServiceTwo() {
        assertEquals("BackendServiceTwo test", "BackendServiceTwo: token1", new BackendServiceTwo().getBackendServiceName());
    }

}