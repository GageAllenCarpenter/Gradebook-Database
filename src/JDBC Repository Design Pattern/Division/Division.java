package Division;

import Course.Course;
import Professor.Professor;
import RepoBase.EntityBase;
import Room.Room;
import Semester.Semester;

/**
 *  The division of study for a particular course
 *
 * @author Gage Carpenter
 * @Version 2021.04.23.01
 */
public class Division extends EntityBase
{
    private int time;
    Professor professor;
    Semester semester;
    Course course;
    Room room;

    /**
     * Constructor for objects of class Division.Division
     */
    public Division()
    {

    }

    /**
     * Overloaded constructor for objects of class Division.Division
     * param time the Divisions time
     * param professor the professor for that Division.Division
     * param semester the semester that the division is held
     * param course the courses within that Division.Division
     * param room the room for that Divisions course
     */
    public Division(int time, Professor professor, Semester semester, Course course, Room room)
    {
        this.time = time;
        this.professor = professor;
        this.semester = semester;
        this.course = course;
        this.room = room;
    }

    /**
     * Gets the time that the Division.Division of a course will be held
     * @return time; time of that Division.Division
     */
    public int getTime()
    {
        return time;
    }
    /**
     * gets the professor for a particular Division.Division
     * @return professor; the person who teaches that Division.Division
     */
    public Professor getProfessor()
    {
        return professor;
    }
    /**
     * gets the semester that the Division.Division is held in
     * @return semester; the semester that the Division.Division is held in
     */
    public Semester getSemester()
    {
        return semester;
    }
    /**
     * gets the course for that Division.Division
     * @return course; course from that Division.Division
     */
    public Course getCourse()
    {
        return course;
    }
    /**
     * gets the room of a Division.Division where that divisions courses will be held
     * @return room; the room for a Division.Division
     */
    public Room getRoom()
    {
        return room;
    }
    /**
     * sets the time of a Division.Division
     * param int; the time of a division
     * @return Division.Division; an updated instance of Division.Division
     */
    public Division setTime(int value)
    {
        time = value;
        return this;
    }
    /**
     * sets the professor in a Division.Division
     * param Professor.Professor; the professor(s) in a Division.Division
     * @return Division.Division; an updated instance of Division.Division
     */
    public Division setProfessor(Professor value)
    {
        professor = value;
        return this;
    }
    /**
     * sets the semester for which a division is held
     * param Semester.Semester; the Divisions that are held in a semester
     * @return Division.Division; an updated instance of Division.Division
     */
    public Division setSemester(Semester value)
    {
        semester = value;
        return this;
    }
    /**
     *sets the course that goes into a Division.Division
     * param Course.Course; the courses in a Division.Division
     * @return Division.Division; an updated instance of Division.Division
     */
    public Division setCourse(Course value)
    {
        course = value;
        return this;
    }
    /**
     * sets the room that a course takes place within a Division.Division
     * param Room.Room; the rooms in a Division.Division
     * @return Division.Division; an updated instance of Division.Division
     */
    public Division setRoom(Room value)
    {
        room = value;
        return this;
    }

    @Override
    public String toString()
    {
        return time + " " + professor.getID() + " " + semester.getID() + " " + course.getID() + " " + room.getID();
    }
}
