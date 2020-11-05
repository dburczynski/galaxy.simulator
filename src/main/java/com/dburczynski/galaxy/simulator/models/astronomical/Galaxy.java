package com.dburczynski.galaxy.simulator.models.astronomical;

import com.dburczynski.galaxy.simulator.models.enums.GalaxyType;

import java.util.List;

/**
 * Class representing a galaxy object
 *
 * @author dburczynski
 * @version 1.0
 */
public class Galaxy {

    /**
     * @see GalaxyType
     */
    private GalaxyType galaxyType;

    /**
     * @see AstronomicalObject
     */
    private List<AstronomicalObject> astronomicalObjects;

    /**
     * Default constructor
     */
    public Galaxy() {}

    /**
     * Full argument constructor
     *
     * @param galaxyType GalaxyType The type(shape) of galaxy
     */
    public Galaxy(GalaxyType galaxyType) {
        this.galaxyType = galaxyType;
    }

    /**
     * @return GalaxyType
     * @see GalaxyType
     */
    public GalaxyType getGalaxyType() {
        return galaxyType;
    }

    /**
     * @param galaxyType GalaxyType
     * @see GalaxyType
     */
    public void setGalaxyType(GalaxyType galaxyType) {
        this.galaxyType = galaxyType;
    }

    /**
     *
     * @return List<AstronomicalObject> A list of AstronomicalObject
     * @see AstronomicalObject
     * @see List
     */
    public List<AstronomicalObject> getAstronomicalObjects() {
        return astronomicalObjects;
    }

    /**
     *
     * @param astronomicalObjects List<AstronomicalObject> A list of AstronomicalObject
     * @see AstronomicalObject
     * @see List
     */
    public void setAstronomicalObjects(List<AstronomicalObject> astronomicalObjects) {
        this.astronomicalObjects = astronomicalObjects;
    }


}
