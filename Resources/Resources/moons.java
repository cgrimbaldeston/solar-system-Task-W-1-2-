/**
 * This class handles the creation of moons and or any other objects that obit around other planets
 * @author Curtis grimbaldeston
*/
public class moons {
    private Integer distanceFromPlanet;
    private float speed;
    private Integer diameter;
    private String color;
    private float angle;

    /**
	 * Constructor for the moon that allows for the creation of moons other objects that obit planets.
	 *
	 * @param distanceFromPlanet distance from the planet in pixels.
	 * @param speed speed that the moon travels around the planet.
     * @param diameter of the moon.
     * @param colour colour of the moon.
	 */
    public moons(Integer distanceFromPlanet, float speed, Integer diameter, String color) {
        this.distanceFromPlanet = distanceFromPlanet;
        this.speed = speed;
        this.diameter = diameter;
        this.color = color;
        this.angle = 0;
    }



    /**
    * Updates moon based on planet. This is called from update_spheres () and should not be called directly.
    * 
    * @param milkyway - SolarSystem to draw on.
    * @param planet - Planet that was updated from the milkyway
    */
    public void update_moon(SolarSystem milkyway, planets planet) {
        this.angle = angle + (1 * speed) / 10;
        double centreOfRotationDistance = planet.getDistance();
        double centreOfRotationAngle = planet.getAngle();
        milkyway.drawSolarObjectAbout(distanceFromPlanet, angle, diameter, color, centreOfRotationDistance, centreOfRotationAngle);
    }
}