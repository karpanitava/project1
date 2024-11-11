package com.cicdclouds;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testApp() {
        assertEquals("Hello, CICD Clouds!", App.getHelloMessage());
    }
}
