package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BirdTesting {
@Test
@DisplayName("Test all birds have a beak")
public void testingBirdsHaveABeak() {
        Bird penguin = new Penquin();
        Bird goose = new Goose();
        Assertions.assertTrue(penguin.hasABeak());
        Assertions.assertTrue(goose.hasABeak());
        }
}
