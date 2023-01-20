package ru.udilov_a_s.range;

public class Range {

    private double from;
    private double to;

    public Range(double from, double to) {

        this.from = from;
        this.to = to;
    }

    public double getFrom() {

        return from;
    }

    public void setFrom(double from) {

        this.from = from;
    }

    public double getTo() {

        return to;
    }

    public void setTo(double to) {

        this.to = to;
    }

    public double getLength() {

        return to - from;
    }

    public boolean isInside(double number) {

        double epsilon = 1.0e-10;

        return (number - from >= -epsilon) && (to - number >= -epsilon);
    }

    @Override
    public String toString() {

        return "(" + from + "; " + to + ")";
    }
}
