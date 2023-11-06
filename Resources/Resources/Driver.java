public class Driver{
    public static void main(String[] args) {
        SolarSystem milkyway = new SolarSystem(1000, 1000);
        planets[] planet;
        moons [] moon;
        planet = new planets[3];
        planet[0]= new planets("sun", 0, 0, 200,"YELLOW");
        planet[1]= new planets("mars",400, 3, 30, "RED");
        planet[2]= new planets("Earth",300, 6, 50, "BLUE");
        //For loop that draws all the planets and then clears them so they can be drawn again creating the effect that they are 
        while (true){
            for(int x=0; x<planet.length; x++){
                planet[x].Update_planet(milkyway);
            }
            milkyway.finishedDrawing();
        }
    }
}