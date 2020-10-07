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

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }

        this.currentTemperature = currentTemperature;
    }


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentTemperature(int currentTemperature) {
        int increasedTemperature = getCurrentTemperature() + 1;
        if (increasedTemperature > maxTemperature) {
            return;
        }
        this.currentTemperature = increasedTemperature;
    }

    public void decreaseCurrentTemperature(int currentTemperature) {
        int decreasedTemperature = getCurrentTemperature() - 1;
        if (decreasedTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = decreasedTemperature;
    }
}