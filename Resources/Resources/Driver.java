/**
 * This is the driver class for the creation of the plannets moons as well as a while loop that for updating all of the plantets and moons
 * @author Curtis grimbaldeston
*/
public class Driver {
    public static void main(String[] args) {
        SolarSystem milkyway = new SolarSystem(1500, 1000);
        planets[] planetsArray = new planets[9];
        moons[] moonArray = new moons[1];
        //if we add many more planets create a function that summons an array of an passed amount of moons of a given type.
        moonArray[0] = new moons(20, 50, 5, "White");


        //if we return to this find a way of making it so that you dont have to give distance. 
        //it should be just caluclated using the size of itself, the size of the prev planet and the distance of the prev planet.
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
                //the planet it is linked to should really be a in the constructor.
                moon.update_moon(milkyway, planetsArray[4]);
            }
            // Update moon's position based on the first planet
            milkyway.finishedDrawing();
        }
    }
}
