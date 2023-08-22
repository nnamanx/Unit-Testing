package com.nnamanx.calculatorusingtesting.service;

public class CalculatorService {

    public <T> T add(T x, T y) {

        if (x instanceof Integer && y instanceof Integer) {
            return (T) Integer.valueOf(((Integer) x).intValue() + ((Integer) y).intValue());
        } else if (x instanceof Double && y instanceof Double) {
            return (T) Double.valueOf(((Double) x).doubleValue() + ((Double) y).doubleValue());
        } else if (x instanceof String && y instanceof String) {
            return (T) (((String) x) + ((String) y));
        } else {
            throw new IllegalArgumentException("Unsupported data types for addition");
        }
    }


    public <T> T subtract(T x, T y) {

        if (x instanceof Integer && y instanceof Integer) {
            return (T) Integer.valueOf(((Integer) x).intValue() - ((Integer) y).intValue());
        } else if (x instanceof Double && y instanceof Double) {
            return (T) Double.valueOf(((Double) x).doubleValue() - ((Double) y).doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data types for subtraction");
        }
    }

    public <T> T multiple(T x, T y) {

        if (x instanceof Integer && y instanceof Integer) {
            return (T) Integer.valueOf(((Integer) x).intValue() * ((Integer) y).intValue());
        } else if (x instanceof Double && y instanceof Double) {
            return (T) Double.valueOf(((Double) x).doubleValue() * ((Double) y).doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data types for multiplication");
        }
    }

    public <T> T divide(T x, T y) {

        if (x instanceof Integer && y instanceof Integer) {
            return (T) Integer.valueOf(((Integer) x).intValue() / ((Integer) y).intValue());
        } else if (x instanceof Double && y instanceof Double) {
            return (T) Double.valueOf(((Double) x).doubleValue() / ((Double) y).doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data types for division");
        }
    }

}
