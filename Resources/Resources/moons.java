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

    public moons(Integer distanceFromPlanet, float speed, Integer diameter, String color) {
        this.distanceFromPlanet = distanceFromPlanet;
        this.speed = speed;
        this.diameter = diameter;
        this.color = color;
        this.angle = 0;
    }

    public void update_moon(SolarSystem milkyway, planets planet) {
        this.angle = angle + (1 * speed) / 10;
        double centreOfRotationDistance = planet.getDistance();
        double centreOfRotationAngle = planet.getAngle();
        milkyway.drawSolarObjectAbout(distanceFromPlanet, angle, diameter, color, centreOfRotationDistance, centreOfRotationAngle);
    }
}