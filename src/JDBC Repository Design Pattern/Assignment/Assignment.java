package Assignment;

import RepoBase.EntityBase;

/**
 *  Assignment.Assignment represents assigned work given to the student
 *
 * @author Gage Carpenter
 * @Version 2021.04.23.01
 */
public class Assignment extends EntityBase
{
    private String name = "";
    private String type = "";
    private int pointsPossible;

    /**
     * Default constructor for objects of class Assignment.Assignment
     */
    public Assignment()
    {

    }

    /**
     * Overlaoded Constructor for objects of class Assignment.Assignment
     */
    public Assignment(String name, String type, int pointsPossible)
    {
        this.name = name;
        this.type = type;
        this.pointsPossible = pointsPossible;
    }

    /**
     * Get the Assignment.Assignment's name
     * @return String the assignment's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Get the Assignment.Assignment's type
     * @return String the assignment's type
     */
    public String getType()
    {
        return type;
    }

    /**
     * Get the Assignment.Assignment's points possible
     * @return int the amount of points possible
     */
    public int getPointsPossible()
    {
        return pointsPossible;
    }

    /**
     * set the Assignment.Assignment's name
     * param String; the assignment's updated name
     * @return Assignment.Assignment updated instance of the assignment
     */
    public Assignment setName(String value)
    {
        name = value;
        return this;
    }

    /**
     * set the Assignment.Assignment's type
     * param String; the assignments updated type
     * @return Assignment.Assignment updated instance of the assignment
     */
    public Assignment setType(String value)
    {
        type = value;
        return this;
    }

    /**
     * set the Assignment.Assignment's points possible
     * param int; the assignments updated points
     * @return Assignment.Assignment updated instance of the assignment
     */
    public Assignment setPointsPossible(int value)
    {
        pointsPossible = value;
        return this;
    }

    @Override
    public String toString()
    {
        return name + " " + type + " " + pointsPossible;
    }
}
