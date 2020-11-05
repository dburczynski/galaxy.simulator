package com.dburczynski.galaxy.simulator.models.enums;

/**
 * An enum representing the type(shape) of a galaxy
 * @author dburczynski
 * @version 1.0
 */
public enum GalaxyType {
    /**
     * A spherical galaxy type
     */
    SPHERICAL(1L, "Spherical shape"),

    /**
     * A elliptical galaxy type
     */
    ELLIPTICAL(1L,"Elliptical shape")
    ;

    /**
     * value of enum
     */
    private Long value;

    /**
     * name of enum
     */
    private String name;

    /**
     *
     * @param value Long Value of the enum
     * @param name String Name of the enum
     */
    GalaxyType(Long value, String name) {
        this.value = value;
        this.name = name;
    }

    /**
     *
     * @return Long This returns value of enum
     */
    public Long getValue() {
        return value;
    }

    /**
     *
     * @param value Long Value of the enum
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     *
     * @return String This returns name of enum
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name String Name of the enum
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return String This returns toString
     * @see Object
     */
    @Override
    public String toString() {
        return this.name;
    }
}
