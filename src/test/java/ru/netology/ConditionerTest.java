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
        conditioner.setCurrentTemperature(0);
        conditioner.increaseCurrentTemperature();
        assertEquals(1, conditioner.getCurrentTemperature());
    }

    @Test
    void IncreaseCurrentTemperature2() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    void IncreaseCurrentTemperature3() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(29);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);
        conditioner.decreaseCurrentTemperature();
        assertEquals(29, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature2() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(0);
        conditioner.decreaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature3() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(0);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(1);
        conditioner.decreaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        assertEquals(0, conditioner.getMaxTemperature(30));
        assertEquals(0, conditioner.getMinTemperature(0));
        assertFalse(conditioner.isOn());

    }
}