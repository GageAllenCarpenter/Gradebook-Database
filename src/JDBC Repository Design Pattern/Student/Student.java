package Student;

import RepoBase.EntityBase;

/**
 *  the people who are taking the courses or have taken a course in the past
 *
 * @author Gage Carpenter
 * @Version 2021.04.23.01
 */
public class Student extends EntityBase
{
    private String firstName = "";
    private String lastName = "";
    private String email = "";
    private String phoneNumber = "";
    private String address = "";

    /**
     * Constructor for objects of class Student.Student
     */
    public Student()
    {

    }

    /**
     * Overloaded constructor for objects of class Student.Student
     * param firstName; the students first name
     * param lastName; the students last name
     * param email; the students email
     * param phoneNumber; the students phone number
     * param address; the students address
     */
    public Student(String firstName, String lastName, String email, String phoneNumber, String address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    /**
     * Gets the first name of a student
     * @return firstname; Students first name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * sets the first name of a student
     * param value; first name
     * @return Student.Student; an updated instance of student
     */
    public Student setFirstName(String value) {
        firstName = value;
        return this;
    }
    /**
     * gets the last name of a student
     * @return last name; students last name
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * sets the last name of a student
     * param value; students last name
     * @return Student.Student; an updated instance of student
     */
    public Student setLastName(String value) {
        lastName = value;
        return this;
    }
    /**
     * gets the email of a student
     * @return email; the students email
     */
    public String getEmail() {
        return email;
    }
    /**
     * sets the email of a student
     * param value; students email
     * @return Student.Student; an updated instance of student
     */
    public Student setEmail(String value) {
        email = value;
        return this;
    }
    /**
     * gets the phone number of a student
     * @return phoneNumber; the students phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * sets the students phone number
     * param value; student phoneNumber
     * @return Student.Student; an updated instance of student
     */
    public Student setPhoneNumber(String value) {
        phoneNumber = value;
        return this;
    }
    /**
     * gets the address of a student
     * @return address; the address of a student
     */
    public String getAddress() {
        return address;
    }
    /**
     * Sets the address of a student
     * param value; the address of the student
     * @return Student.Student; an updated instance of student
     */
    public Student setAddress(String value) {
        address = value;
        return this;
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName + " " + email + " " + phoneNumber + " " + address;
    }
}
