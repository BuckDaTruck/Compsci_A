/*
 * Author: Buckley Wiley
 * Contact: buckley@buckleywiley.com
 * GitHub: https://github.com/BuckDaTruck
 * For help, visit: http://buckleywiley.com/forum/Code/forum.html
 * Description: A zoo managment system
 */
package Unit_5.Unit_5_Project;

public class Animal {
    private String name;
    private String species;
    private int numLegs;

    public Animal(String name, String species, int numLegs) {
        this.name = name;
        this.species = species;
        this.numLegs = numLegs;
    }

    public Animal(String name, int numLegs) {
        this(name, "Unknown", numLegs);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public void eat() {
        System.out.println(name + " gobbled up some food!");
    }

    public void free() {
        System.out.println(name + " made a prison break!");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", numLegs=" + numLegs +
                '}';
    }
}
