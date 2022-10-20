package Enrollment;

import Division.Division;
import RepoBase.EntityBase;
import Student.Student;

import java.sql.Date;
/**
 *  Enrollment.Enrollment information for the student
 *
 * @author Gage Carpenter
 * @Version 2021.04.23.01
 */
public class Enrollment extends EntityBase
{
    private Date enrollDate;
    private int currentGrade;
    private int midtermGrade;
    private int finalGrade;
    Division division;
    Student student;


    /**
     * Constructor for objects of class Enrollment.Enrollment
     */
    public Enrollment()
    {

    }

    /**
     * Overloaded constructor for objects of class Enrollment.Enrollment
     * param name The category name to assign
     */
    public Enrollment(Date enrollDate, int currentGrade, int midtermGrade, int finalGrade, Division division, Student student)
    {
        this.enrollDate = enrollDate;
        this.currentGrade = currentGrade;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
        this.division= division;
        this.student = student;
    }

    /**
     *  gets the date a student enrolled
     * @return enrollDate; the date of enrollment
     */
    public Date getEnrollDate()
    {
        return enrollDate;
    }
    /**
     * gets the students current grade
     * @return currentGrade; the current grade of a student
     */
    public int getCurrentGrade()
    {
        return currentGrade;
    }
    /**
     * gets the midterm grade of a student
     * @return midtermGrade; the midterm grade for a student
     */
    public int getMidtermGrade()
    {
        return midtermGrade;
    }
    /**
     * gets the final grade of a student
     * @return finalGrade; the final grade for a student
     */
    public int getFinalGrade()
    {
        return finalGrade;
    }
    /**
     * gets the division that the student enrolled in
     * @return division; the section a student enrolled
     */
    public Division getDivision()
    {
        return division;
    }
    /**
     * gets the student that enrolled
     * @return student; the person who enrolled
     */
    public Student getStudent()
    {
        return student;
    }
    /**
     * sets the date enrolled
     * param String; enrollDate
     * @return Enrollment.Enrollment; an updated instance of Enrollment.Enrollment
     */
    public Enrollment setEnrollDate(Date value)
    {
        enrollDate = value;
        return this;
    }
    /**
     * sets the current grade for a course
     * param String; current grade
     * @return Enrollment.Enrollment; an updated instance of Enrollment.Enrollment
     */
    public Enrollment setCurrentGrade(int value)
    {
        currentGrade = value;
        return this;
    }
    /**
     * sets the midterm grades for the student who enrolled
     * param String; midterm grade
     * @return Enrollment.Enrollment; an updated instance of Enrollment.Enrollment
     */
    public Enrollment setMidtermGrade(int value)
    {
        midtermGrade = value;
        return this;
    }
    /**
     * Sets the final grade for a student who enrolled
     * param int; final grade
     * @return Enrollment.Enrollment; an updated instance of Enrollment.Enrollment
     */
    public Enrollment setFinalGrade(int value)
    {
        finalGrade = value;
        return this;
    }
    /**
     * sets the division of a student who enrolled
     * param Division.Division; division (could also be considered a section)
     * @return Enrollment.Enrollment; an updated instance of Enrollment.Enrollment
     */
    public Enrollment setDivision(Division value)
    {
        division = value;
        return this;
    }
    /**
     * sets the student who enrolled
     * param Student.Student; student who enrolls
     * @return Enrollment.Enrollment; an updated instance of Enrollment.Enrollment
     */
    public Enrollment setStudent(Student value)
    {
        student = value;
        return this;
    }

    @Override
    public String toString()
    {
        return enrollDate + " " + currentGrade + " " + midtermGrade + " " + finalGrade + " " + division.getID() + " " +student.getID();
    }
}
