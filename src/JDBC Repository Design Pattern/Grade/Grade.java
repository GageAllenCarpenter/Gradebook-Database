package Grade;

import Assignment.Assignment;
import Division.Division;
import Professor.Professor;
import RepoBase.EntityBase;
import Student.Student;

/**
 *  Grades within a classroom or course
 *
 * @author Gage Carpenter
 * @Version 2021.04.23.01
 */
public class Grade extends EntityBase
{
    private int points;
    private Assignment assignment;
    private Division division;
    private Student student;
    private Professor professor;

    /**
     * Constructor for objects of class Grade.Grade
     */
    public Grade()
    {

    }

    /**
     * Overloaded constructor for objects of class Grade.Grade
     * param points the amount of points for that grade
     * param assignment the assignments' information
     * param division the location for that assignment
     * param student who took the assignment to get that grade
     * param professor who administered that assignment for that student
     */
    public Grade(int points, Assignment assignment, Division division, Student student, Professor professor)
    {
        this.points = points;
        this.assignment = assignment;
        this.division = division;
        this.student = student;
        this.professor = professor;
    }

    /**
     * gets the points from a grade
     * @return points; the points from the assignment
     * param points
     */
    public int getPoints()
    {
        return this.points;
    }
    /**
     * gets the assignment that was graded
     * @return assignment; the task assigned to the student
     */
    public Assignment getAssignment()
    {
        return assignment;
    }
    /**
     * gets the division of the course that the student participated in for a grade
     * @return division; the section a student is in
     */
    public Division getDivision()
    {
        return division;
    }
    /**
     * gets the student who is in the course
     * @return student; the person who is in the course
     */
    public Student getStudent()
    {
        return student;
    }

    /**
     * gets the professor who was in the course
     * @return professor; the one who teaches the course in a Division.Division
     */
    public Professor getProfessor()
    {
        return professor;
    }
    /**
     * sets the points that a student recieved on an assignment
     * @return points; the value received on an assignment
     */
    public Grade setPoints(int value)
    {
        points = value;
        return this;
    }
    /**
     * sets the assignment to a student for a grade
     * @return assignment; the task assigned to a student
     */
    public Grade setAssignment(Assignment value)
    {
        assignment = value;
        return this;
    }
    /**
     * sets the Division.Division a student is being graded in
     * @return division; the section of a course that a student is enrolled and being graded in
     */
    public Grade setDivision(Division value)
    {
        division = value;
        return this;
    }
    /**
     * sets the student that has an assignment that needs to be graded
     * @return student; the student who is enrolled and being graded in a course inside a division inside a room inside a building
     */
    public Grade setStudent(Student value)
    {
        student = value;
        return this;
    }
    /**
     * sets the professor who is creating assignments for the student
     * @return professor; the one creating and grading assigned work in a course in a division in a room in a building
     */
    public Grade setProfessor(Professor value)
    {
        professor = value;
        return this;
    }

    @Override
    public String toString()
    {
        return points + " " + assignment.getID() + " " + division.getID() + " " + student.getID() + " " + professor.getID();
    }
}
