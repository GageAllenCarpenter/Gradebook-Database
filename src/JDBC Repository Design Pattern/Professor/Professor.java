package Professor;

import RepoBase.EntityBase;

/**
 *  Professors information
 *
 * @author Gage Carpenter
 * @Version 2021.04.23.01
 */
public class Professor extends EntityBase
{
    private String firstName = "";
    private String lastName = "";
    private String email = "";
    private String phoneNumber = "";
    private String address = "";

    /**
     * Constructor for objects of class Professor.Professor
     */
    public Professor()
    {

    }

    /**
     * Overloaded constructor for objects of class Professor.Professor
     * param first name; the professors first name
     * param last name; the professors last name
     * param email; the professors email
     * param phoneNumber; the professors phoneNumber;
     * param address; the professors address;
     */
    public Professor(String firstName, String lastName, String email, String phoneNumber, String address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    /**
     * Gets the professors first name
     * @return firstname; the professors first name
     */
    public String getFirstName()
    {
        return firstName;
    }
    /**
     * Gets the professors last name
     * @return lastName; the professors last name
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * gets the professors email
     * @return email; the professors email
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * gets the professors phone number
     * @return phoneNumber; the professors phone number
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    /**
     * gets the professors address
     * @return address; the professors address
     */
    public String getAddress()
    {
        return address;
    }
    /**
     * sets the professors first name
     * param String; firstName
     * @return Professor.Professor; an updated instance of a professor
     */
    public Professor setFirstName(String value)
    {
        firstName = value;
        return this;
    }
    /**
     * sets the professors last name
     * param String; lastName
     * @return Professor.Professor; an updated instance of a professor
     */
    public Professor setLastName(String value)
    {
        lastName = value;
        return this;
    }
    /**
     * sets the professors email
     * param String; email of the professor
     * @return Professor.Professor; an updated instance of a professor
     */
    public Professor setEmail(String value)
    {
        email = value;
        return this;
    }
    /**
     * sets the professors phone number
     * param String;  phone number of the professor
     * @return Professor.Professor; an updated instance of a professor
     */
    public Professor setPhoneNumber(String value)
    {
        phoneNumber = value;
        return this;
    }
    /**
     * sets the professors address
     * param String; address of the professor
     * @return Professor.Professor; an updated instance of a professor
     */
    public Professor setAddress(String value)
    {
        address = value;
        return this;
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName + " " + email + " " + phoneNumber + " " + address;
    }
}
