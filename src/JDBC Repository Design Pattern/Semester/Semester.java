package Semester;

import RepoBase.EntityBase;

/**
 *  A historical marker that declares what time a course was held
 *
 * @author Gage Carpenter
 * @Version 2021.04.23.01
 */
public class Semester extends EntityBase
{
    private String startDate;
    private String endDate;

    /**
     * Constructor for objects of class Semester.Semester
     */
    public Semester()
    {

    }

    /**
     * Overloaded constructor for objects of class Semester.Semester
     * param startDate; when the course starts
     * param endDate; when the course ends
     */
    public Semester(String startDate, String endDate)
    {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Gets the start date of a semester
     * @return startDate; when the semester starts
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * Sets the start date of a semester
     * @param value; when the semester starts
     * @return Semester.Semester; the updated instance of the Semester.Semester
     */
    public Semester setStartDate(String value) {
        startDate = value;
        return this;
    }

    /**
     * gets the end date of a semester
     * @return endDate; when the course ends
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * Sets when the course ends in a semester
     * @param value; the end date
     * @return Semester.Semester; the updated instance of the Semester.Semester
     */
    public Semester setEndDate(String value) {
        endDate = value;
        return this;
    }

    @Override
    public String toString()
    {
        return startDate + " " + endDate;
    }
}
