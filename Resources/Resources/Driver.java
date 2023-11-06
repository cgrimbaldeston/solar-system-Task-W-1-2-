public class Driver {
    public static void main(String[] args) {
        SolarSystem milkyway = new SolarSystem(1000, 1000);
        planets[] planetsArray = new planets[6];
        moons[] moonArray = new moons[1];
        moonArray[0] = new moons(20, 5, 5, "White");

        planetsArray[0] = new planets("sun", 0, 0, 50, "YELLOW");
        planetsArray[3] = new planets("Mercury", 60, 6, 10, "#808080");
        planetsArray[4] = new planets("Venus", 70, 9, 10, "ORANGE");
        planetsArray[1] = new planets("mars", 100, 3, 30, "RED");
        planetsArray[2] = new planets("Earth", 140, 10, 20, "BLUE");
        planetsArray[5] = new planets("Jupiter", 160, 15, 30, "#ebf3f6");

        while (true) {
            for (planets planet : planetsArray) {
                planet.update_planet(milkyway, planetsArray);
            }
            for(moons moon: moonArray){
                moon.update_moon(milkyway, planetsArray[2]);
            }
            // Update moon's position based on the first planet
            milkyway.finishedDrawing();
        }
    }
}
