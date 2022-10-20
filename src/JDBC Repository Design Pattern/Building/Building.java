package Building;

import RepoBase.EntityBase;

/**
 *  Building.Building represents the building that houses that particular course
 *
 * @author Gage Carpenter
 * @Version 2021.04.23.01
 */
public class Building extends EntityBase
{
    private String name = "";
    private String city = "";
    private String state = "";
    private int zipcode;


    /**
     * Constructor for objects of class Building.Building
     */
    public Building()
    {

    }

    /**
     * Overloaded constructor for objects of class Building.Building
     * param name The building name to assign
     * param city The city where the building resides
     * param state The state where the building resides
     * param zipcode The zipcode where the buidling resides
     */
    public Building(String name, String city, String state, int zipcode)
    {
        this.name = name;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    /**
     * Get the buildings name
     * @return name; the buildings name
     */
    public String getName()
    {
        return name;
    }
    /**
     * Get the city where the building resides
     * @return city; the city where the building resides
     */
    public String getCity()
    {
        return city;
    }
    /**
     * Get the state where the building resides
     * @return state; state where the building is located
     */
    public String getState()
    {
        return state;
    }
    /**
     * The zipcode of the building
     * @return zipcode; zipcode of the building
     */
    public int getZipcode()
    {
        return zipcode;
    }
    /**
     * Set the buildings name
     * param String; the new name
     * @return Building.Building the updated instance of the building
     */
    public Building setName(String value)
    {
        name = value;
        return this;
    }
    /**
     * set the bulidings city
     * param String; the new name of the city
     * @return Building.Building the updated instance of the building
     */
    public Building setCity(String value)
    {
        city = value;
        return this;
    }
    /**
     *  set the buildings state
     *  param String; the new name of the state
     * @return Building.Building the updated instance of the building
     */
    public Building setState(String value)
    {
        state = value;
        return this;
    }
    /**
     * set the buildings zipcode
     * param int; the new zipcode for a building
     * @return Building.Building the updated instance of the building
     */
    public Building setZipCode(int value)
    {
        zipcode = value;
        return this;
    }

    @Override
    public String toString()
    {
        return name+ " " + city+ ", " + state + ", " + zipcode;
    }
}
