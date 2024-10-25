/**
 * This is Course.java, packaged within
 * edu.unl.raikes.objectsIII.
 */
package edu.unl.raikes.objectsIII;

/**
 * This class provides the definitions for Course in the edu.unl.raikes.objectsIII package.
 */
public class Course implements Comparable<Course> {

    private String instructorName;
    private String classID;
    private String className;
    private int creditHours;
    private Roster roster;
    private String roomNumber;

    /**
     * Creates an instance of the Course class.
     *
     * @param instructorName
     * @param classID
     * @param className
     * @param creditHours
     * @param registrationCap
     * @param roomNumber
     */
    public Course(String instructorName, String classID, String className, int creditHours, int registrationCap,
            String roomNumber) {
        this.instructorName = instructorName;
        this.classID = classID;
        this.className = className;
        this.creditHours = creditHours;
        this.roster = new Roster(registrationCap);
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Course [instructorName=" + this.instructorName + ", classID=" + this.classID + ", className="
                + this.className + ", creditHours=" + this.creditHours + ", roster=" + this.roster + ", roomNumber="
                + this.roomNumber + "]";
    }

    /**
     * Gets the object's instructorName.
     *
     * @return the instructorName
     */
    public String getInstructorName() {
        return this.instructorName;
    }

    /**
     * Sets the object's instructorName.
     *
     * @param instructorName the instructorName to set
     */
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    /**
     * Gets the object's classID.
     *
     * @return the classID
     */
    public String getClassID() {
        return this.classID;
    }

    /**
     * Sets the object's classID.
     *
     * @param classID the classID to set
     */
    public void setClassID(String classID) {
        this.classID = classID;
    }

    /**
     * Gets the object's className.
     *
     * @return the className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * Sets the object's className.
     *
     * @param className the className to set
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * Gets the object's creditHours.
     *
     * @return the creditHours
     */
    public int getCreditHours() {
        return this.creditHours;
    }

    /**
     * Sets the object's creditHours.
     *
     * @param creditHours the creditHours to set
     */
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    /**
     * Gets the object's roster.
     *
     * @return the roster
     */
    public Roster getRoster() {
        return this.roster;
    }

    /**
     * Sets the object's roster.
     *
     * @param roster the roster to set
     */
    public void setRoster(Roster roster) {
        this.roster = roster;
    }

    /**
     * Gets the object's roomNumber.
     *
     * @return the roomNumber
     */
    public String getRoomNumber() {
        return this.roomNumber;
    }

    /**
     * Sets the object's roomNumber.
     *
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public int compareTo(Course course2) {
        // if course 1 is less than course 2, return a negative number
        // if course 1 is equal to course 2, return 0
        // otherwise, return positive number
        int comparison = this.getClassID().compareTo(course2.getClassID());
        return comparison;
    }

}
