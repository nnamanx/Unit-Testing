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


    public <T> T calculatePercentage(T number, T percent) {

        if (number instanceof Integer && percent instanceof Integer) {
            return (T) Integer.valueOf(((Integer) number).intValue() * (((Integer) percent).intValue()) / 100);
        } else if (number instanceof Double && percent instanceof Double) {
            return (T) Double.valueOf(((Double) number).doubleValue() * (((Double) percent).doubleValue()) / 100);
        } else {
            throw new IllegalArgumentException("Unsupported data types for calculating percentage");
        }
    }
}
