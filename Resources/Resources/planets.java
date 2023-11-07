/**
 * This class handles the creation of planets and allows for the the defintion of all defining planet factors.
 * @author Curtis grimbaldeston
*/
public class planets {
    private String name;
    private Integer distance;
    private float speed;
    private double diameter;
    private String color;
    private float angle;


    /**
	 * Constructor for planet objects
	 *
	 * @param name The name of this planet (this isnt actually used but could be used in the future)
     * @param distance This referes to the distance that a planet is from the sun
     * @param speed The speed that the planet travels round the sun.
     * @param diameter Diameter of the planet.
     * @param color colour of the planet.
	 */
    public planets(String name, Integer distance, float speed, double diameter, String color) {
        this.name = name;
        this.distance = distance;
        this.speed = speed;
        this.diameter = diameter;
        this.color = color;
        this.angle = 0;
    }

    /**
    * Updates planet and its distance. Used to update the milkyway when it's time to move a planet
    * 
    * @param milkyway - SolarSystem to draw the planet
    * @param planets - Array of planet '
    */
    public void update_planet(SolarSystem milkyway, planets[] planets) {
        this.angle = angle + (1 * speed) / 10;
        milkyway.drawSolarObject(distance, angle, diameter, color);
    }
    

    /**
    * Returns the distance of the object. This is used to determine how far to go in the case of collision.
    * 
    * 
    * @return the distance of the object in millimeters or - 1 if not known ( in which case the object is infinitely
    */
    public Integer getDistance() {
        return this.distance;
    }

    /**
    * Returns the angle of the line. Note that this is a floating point number in [ 0 PI ].
    * 
    * 
    * @return the angle of the line in radians ( 0 to PI ) or - 1 if there is no angle
    */
    public float getAngle() {
        return this.angle;
    }
}
