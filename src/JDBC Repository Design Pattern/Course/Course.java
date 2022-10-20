package Course;

import Professor.Professor;
import RepoBase.EntityBase;

/**
 *  The course represents the room where professors teach students (a class)
 *
 * @author Gage Carpenter
 * @Version 2021.04.23.01
 */
public class Course extends EntityBase
{
    private String name = "";
    private String description = "";
    private int creditHour;
    Professor professor;

    /**
     * Constructor for objects of class Course.Course
     */
    public Course()
    {

    }

    /**
     * Overloaded constructor for objects of class Course.Course
     * param name The course name to assign
     * param description The course description
     * param creditHour the courses amount of credit hours
     * param professor the professor(s) that teach that course
     */
    public Course(String name, String description, int creditHour, Professor professor)
    {
        this.name = name;
        this.description = description;
        this.creditHour = creditHour;
        this.professor = professor;
    }

    /**
     * Gets the name of the course
     * @return name; the name of that course
     */
    public String getName()
    {
        return name;
    }
    /**
     * gets the description of the course
     * @return description; the description of a course
     */
    public String getDescription()
    {
        return description;
    }
    /**
     * gets the credit hours for a course
     * @return creditHour; the amount of credit hours for a course
     */
    public int getCreditHour()
    {
        return creditHour;
    }
    /**
     * the professor who teaches a course
     * @return professor; the professor who teaches a course
     */
    public Professor getProfessor()
    {
        return  professor;
    }
    /**
     * sets the name of a course
     * param String; the name of the course
     * @return Course.Course; the updated instance of Course.Course
     */
    public Course setName(String value)
    {
        name = value;
        return this;
    }
    /**
     * sets the description of course
     * param String; the words used to describe a course
     * @return Course.Course; the updated instance of Course.Course
     */
    public Course setDescription(String value)
    {
        description = value;
        return this;
    }
    /**
     * sets the amount of credit hours for a course
     * param int; the amount of credit hours
     * @return Course.Course; the updated instance of course
     */
    public Course setCreditHour(int value)
    {
        creditHour = value;
        return this;
    }
    /**
     * assigns a professor to a course
     * param Professor.Professor; which professor will teach the course
     * @return Course.Course; the updated instance of course
     */
    public Course setProfessor(Professor value)
    {
        professor = value;
        return this;
    }

    @Override
    public String toString()
    {
        return  name  + " " + description + " " + creditHour + " " + professor.getID();
    }
}
