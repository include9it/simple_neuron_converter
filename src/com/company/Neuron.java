package com.company;

public class Neuron {

    private double weight = 0.5d;

    private double lastError;

    private double smoothing = 0.00001d;

    public double processInputData(double input) {
        return input * weight;
    }

    public double restoreInputData(double output) {
        return output / weight;
    }

    public void train(double input, double expectedResult) {
        int i = 0;
        do {
            i++;
            trainer(input, expectedResult);
//            System.out.println("Iteration: " + i + "\tError:\t" + getLastError());
        } while (getLastError() > getSmoothing() || getLastError() < -getSmoothing());
    }

    private void trainer(double input, double expectedResult) {
        var actualResult = input * weight;
        lastError = expectedResult - actualResult;
        var correction = (lastError / actualResult) * smoothing;
        weight += correction;
    }

    public double getLastError() {
        return lastError;
    }

    public double getSmoothing() {
        return smoothing;
    }

    public void setSmoothing(double smoothing) {
        this.smoothing = smoothing;
    }
}
