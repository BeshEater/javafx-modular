package com.besheater.javafxmodular.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimaryControllerTest {

    @Test
    public void sayHello() {
        PrimaryController primaryController = new PrimaryController();
        assertEquals("Hello!", primaryController.sayHello());
    }
}
