public class Driver {
    public static void main(String[] args) {
        SolarSystem milkyway = new SolarSystem(1500, 1000);
        planets[] planetsArray = new planets[9];
        moons[] moonArray = new moons[1];
        moonArray[0] = new moons(20, 50, 5, "White");

        planetsArray[0] = new planets("sun", 0, 0, 50, "YELLOW");
        planetsArray[1] = new planets("Mercury", 60, 16, 3.8, "#808080");
        planetsArray[2] = new planets("Venus", 70, 14, 7.2, "ORANGE");
        planetsArray[3] = new planets("mars", 100, 12, 15, "RED");
        planetsArray[4] = new planets("Earth", 130, 10, 10, "BLUE");
        planetsArray[5] = new planets("Jupiter", 165, 8, 52, "#FFFDD0");
        planetsArray[6] = new planets("Saturn", 250, 6, 95, "#808080");
        planetsArray[7] = new planets("Uranus", 400, 4, 192, "#30D5C8");
        planetsArray[8] = new planets("Neptune", 630, 2, 200, "#0096FF");

        while (true) {
            for (planets planet : planetsArray) {
                planet.update_planet(milkyway, planetsArray);
            }
            for(moons moon: moonArray){
                moon.update_moon(milkyway, planetsArray[4]);
            }
            // Update moon's position based on the first planet
            milkyway.finishedDrawing();
        }
    }
}
