package Room;

import Building.Building;
import RepoBase.EntityBase;

/**
 *  Room.Room that holds the course with the professor(s) and student(s)
 *
 * @author Gage Carpenter
 * @Version 2021.04.23.01
 */
public class Room extends EntityBase
{
    private Building building;

    /**
     * Constructor for objects of class Room.Room
     */
    public Room()
    {

    }

    /**
     * Overloaded constructor for objects of class Room.Room
     * param building; the building that houses a course
     */
    public Room(Building building)
    {
        this.building = building;
    }

    /**
     * gets the building where the room is located
     * @return building; the type of building
     */
    public Building getBuilding() {
        return building;
    }

    /**
     * sets the building where the room is located
     * param Building.Building;
     * @return Room.Room; the updated instance of room
     */
    public Room setBuilding(Building value) {
        building = value;
        return this;
    }

    @Override
    public String toString()
    {
        return String.valueOf(building.getID());
    }
}
