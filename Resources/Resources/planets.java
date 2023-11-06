public class planets {
    private String name;
    private Integer distance;
    private float speed;
    private Integer diameter;
    private String color;
    private float angle;

    public planets(String name, Integer distance, float speed, Integer diameter, String color) {
        this.name = name;
        this.distance = distance;
        this.speed = speed;
        this.diameter = diameter;
        this.color = color;
        this.angle = 0;
    }

    public void update_planet(SolarSystem milkyway, planets[] planets) {
        this.angle = angle + (1 * speed) / 10;
        milkyway.drawSolarObject(distance, angle, diameter, color);
    }

    public Integer getDistance() {
        return this.distance;
    }
    
    public float getAngle() {
        return this.angle;
    }
}
