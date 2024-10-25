package edu.unl.raikes.day21;

// this is a class - a blueprint
public class Town {
    // public means anyone has access to read/modify
    // nothing is included means anyone in same package can read/modify
    // protected - ignore this for now
    // private - no one but "this" can modify
    private String name;
    private String mayorName;
    private Point location;

    private boolean isElectionSeason = false;

    public Town(String name, String mayorName, double x, double y) {
        this(name, mayorName, new Point(x, y));
    }

    public Town(String name, String mayorName, Point location) {
        this.name = name;
        this.mayorName = mayorName;
        this.location = location;
    }

    // non static because it relies on town data - we need this.x and this.y to do this work
    public double distance(Town otherTown) {
        return this.location.distance(otherTown.getLocation());
    }

    /**
     * Gets the object's name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the object's name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the object's mayorName.
     *
     * @return the mayorName
     */
    public String getMayorName() {
        return this.mayorName;
    }

    /**
     * Sets the object's mayorName.
     *
     * @param mayorName the mayorName to set
     */
    public void setMayorName(String mayorName) {
        if (this.isElectionSeason) {
            this.mayorName = mayorName;
        }
    }

    /**
     * Gets the object's location.
     *
     * @return the location
     */
    public Point getLocation() {
        return this.location;
    }

    /**
     * Sets the object's location.
     *
     * @param location the location to set
     */
    public void setLocation(Point location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "I'm a town called " + this.name + " and my mayor is the honorable " + this.mayorName
                + ".\nI am located at " + this.location.toString();
    }

}
