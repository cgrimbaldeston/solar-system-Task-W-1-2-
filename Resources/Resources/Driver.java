public class Driver {
    public static void main(String[] args) {
        SolarSystem milkyway = new SolarSystem(1000, 1000);
        planets[] planetsArray = new planets[3];
        moons moon = new moons(50, 20, 20, "White");

        planetsArray[0] = new planets("sun", 0, 0, 200, "YELLOW");
        planetsArray[1] = new planets("mars", 400, 3, 30, "RED");
        planetsArray[2] = new planets("Earth", 300, 6, 50, "BLUE");

        while (true) {
            for (planets planet : planetsArray) {
                planet.update_planet(milkyway, planetsArray);
            }
            
            // Update moon's position based on the first planet
            moon.update_moon(milkyway, planetsArray[2]);
            milkyway.finishedDrawing();
        }
    }
}
