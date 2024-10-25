package edu.unl.raikes.day21;

public class Point {
    private double x;
    private double y;

    private static double ORIGIN_X = 0;
    private static double ORIGIN_Y = 0;

    private static int countOfDistancesComputed = 0;

    public Point() {
        this(ORIGIN_X, ORIGIN_Y);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // non static because it relies on point data - we need this.x and this.y to do this work
    public double distance(Point otherPoint) {
        return distance(this, otherPoint);
    }

    public static double distance(Point firstPoint, Point otherPoint) {
        countOfDistancesComputed++;

        double deltaX = otherPoint.getX() - firstPoint.getX();
        double deltaY = otherPoint.getY() - firstPoint.getY();

        double squares = Math.pow(deltaX, 2) + Math.pow(deltaY, 2);

        return Math.sqrt(squares);
    }

    /**
     * Gets the object's x.
     *
     * @return the x
     */
    public double getX() {
        return this.x;
    }

    /**
     * Sets the object's x.
     *
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Gets the object's y.
     *
     * @return the y
     */
    public double getY() {
        return this.y;
    }

    /**
     * Sets the object's y.
     *
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "[x=" + this.x + ", y=" + this.y + "] (" + countOfDistancesComputed + ")";
    }

}
