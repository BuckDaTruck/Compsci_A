/*
 * Author: Buckley Wiley
 * Contact: buckley@buckleywiley.com
 * GitHub: https://github.com/BuckDaTruck
 * For help, visit: http://buckleywiley.com/forum/Code/forum.html
 * Description: A zoo managment system
 */

package Unit_5.Unit_5_Project;


public class Park {
   
    public static void main(String[] args) {
        Zoo zoo = new Zoo(3);
        Animal Charlemagne = new Animal("Charlemagne", "Chicken", 2);
        Animal Bruttis = new Animal("Bruttis", "White Tail Deer", 4);
        Animal BigHead = new Animal("Big Head", "Cow", 4);
        zoo.takeIn(Charlemagne);
        zoo.takeIn(Bruttis);
        zoo.takeIn(BigHead);
        int numAnimals = zoo.getNumberOfOccupants();
        double admissionCost = zoo.getAdmissionRate();
        System.out.println("There are " + numAnimals + " animals. Admission cost is $" + admissionCost + "buckaroons.");
        System.out.println(zoo);
        Animal seabiscuit = new Animal("Penny", "Golden Doodle", 4);
        zoo.takeIn(seabiscuit);
        System.out.println(zoo);
        zoo.feedTheAnimals();
        zoo.cleanEnclosure(0);
        zoo.cleanEnclosure(1);
        zoo.cleanEnclosure(47);
        System.out.println(zoo);
        zoo.openEnclosure(1);
        System.out.println(zoo);
        Animal charlotte = new Animal("Charlotte", "Spider", 8);
        zoo.takeIn(charlotte);
        System.out.println(zoo);
        //zoo.openAllEnclosures();
        System.out.println(zoo);
    }
}