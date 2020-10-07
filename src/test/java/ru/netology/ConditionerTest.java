package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }


    @Test
    void IncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature(21);
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature(19);
        assertEquals(19, conditioner.getCurrentTemperature());
    }
}