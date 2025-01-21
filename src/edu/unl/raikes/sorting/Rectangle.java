/**
 * This is Rectangle.java, packaged within
 * edu.unl.raikes.sorting.
 */
package edu.unl.raikes.sorting;

/**
 * This class provides the definitions for Rectangle in the edu.unl.raikes.sorting package.
 */
public class Rectangle {

    /** The width. */
    private double width;

    /** The height. */
    private double height;

    /** The x. */
    private double x;

    /** The y. */
    private double y;

    /**
     * Creates an intance of the Rectangle class.
     *
     * @param width  the width
     * @param height the height
     * @param x      the x
     * @param y      the y
     */
    public Rectangle(double width, double height, double x, double y) {
        super();
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the object's width.
     *
     * @return the width
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Gets the object's height.
     *
     * @return the height
     */
    public double getHeight() {
        return this.height;
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

    /**
     * Gets the object's area.
     *
     * @return the area
     */
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * this.width + 2 * this.height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle [x=%.3f, y=%.3f, width=%.3f, height=%.3f, area=%.3f, perimeter=%.3f]", this.x,
                this.y, this.width, this.height, this.getArea(), this.getPerimeter());
    }
}
