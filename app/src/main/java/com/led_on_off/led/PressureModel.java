package com.led_on_off.led;

public class PressureModel {

    private int stockingPressure;
    private long readingTime;

    public PressureModel(int stockingPressure, long readingTime) {
        this.stockingPressure = stockingPressure;
        this.readingTime = readingTime;
    }

    public PressureModel() {
    }

    public long getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(long readingTime) {
        this.readingTime = readingTime;
    }

    public int getStockingPressure() {
        return stockingPressure;
    }

    public void setStockingPressure(int stockingPressure) {
        this.stockingPressure = stockingPressure;
    }
}
