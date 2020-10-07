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
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature1(28);
        conditioner.increaseCurrentTemperature();
        assertEquals(29, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature2(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.getCurrentTemperature();
        assertEquals(0, conditioner.getMaxTemperature(30));
        assertEquals(0, conditioner.getMinTemperature(0));
        assertFalse(conditioner.isOn());

    }
}