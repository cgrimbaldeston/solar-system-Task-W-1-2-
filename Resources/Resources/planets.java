public class planets{
    private String name;
    private Integer distance;
    private float speed;
    private Integer diameter;
    private String color;
    private float angle;

    planets(String Name,Integer Distance,float Speed,Integer Diameter,String Color){
        this.name = Name;
        this.distance = Distance;
        this.speed =  Speed;
        this.diameter = Diameter;
        this.color = Color;
        this.angle =0;

    }
    public void Update_planet(SolarSystem milkyway){
        this.angle = angle +(1*speed)/10;
        milkyway.drawSolarObject(distance, angle, diameter,color);
    }

    public float get_angle(){
        return this.angle;
    }
}