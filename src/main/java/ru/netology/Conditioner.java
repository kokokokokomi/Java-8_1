package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature(int i) {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature(int i) {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setCurrentTemperature1(int currentTemperature) {
        if (currentTemperature < maxTemperature) {
            this.currentTemperature = currentTemperature;
        }
        if (currentTemperature >= maxTemperature) {
            return;
        }
    }

    public void setCurrentTemperature2(int currentTemperature) {
        if (currentTemperature > minTemperature) {
            this.currentTemperature = currentTemperature;
        }
        if (currentTemperature <= minTemperature) {
            return;
        }
    }

    public void increaseCurrentTemperature() {
        int increasedTemperature = getCurrentTemperature() + 1;
        if (increasedTemperature <= maxTemperature) {
            this.currentTemperature = increasedTemperature;
        }
        if (increasedTemperature > maxTemperature) {
            return;
        }
    }

    public void decreaseCurrentTemperature() {
        int decreasedTemperature = getCurrentTemperature() - 1;
        if (decreasedTemperature > minTemperature) {
            this.currentTemperature = decreasedTemperature;
        }
        if (decreasedTemperature <= minTemperature) {
            return;
        }
    }
}
