public class Moons{
    private Integer distance;
    private float speed;
    private Integer diameter;
    private String color;
    private float angle;
    

    Moons(Integer Distance,float Speed,Integer Diameter,String Color){
        this.distance = Distance;
        this.speed =  Speed;
        this.diameter = Diameter;
        this.color = Color;
        this.angle =0;

    }
    public void Update_Moon(SolarSystem milkyway){
        this.angle = angle +(1*speed)/10;
        // Update this with the angle and distance of the planet that it orbits.
        milkyway.drawSolarObjectAbout(distance, angle, diameter,color);
    }

}